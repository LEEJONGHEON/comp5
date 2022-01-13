import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Expression {
    public String function(String s) {
        s = s.replaceAll("\\s+", "");
        List<String> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        String op1 = "+-";
        String op2 = "*/%";
        String op3 = op1+op2;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '-' || s.charAt(i) == '+') && (i == 0 || s.charAt(i - 1) == '(')) {
                if (i == 0) {
                    s = "0" + s;
                } else {
                    s = s.substring(0, i) + "0" + s.substring(i);
                }
            }
        }

        char[] str = s.toCharArray();
        changePlusMinus(str);

        String s1 = new String(str);
        s1 = s1.replaceAll("\\s+", "");
        // System.out.println(s1);
        char[] str1 = s1.toCharArray();


        for (int i = 0; i < str1.length; i+=1) {
            int num = 0;
            String string = "";
            boolean flag = false;

            if (Character.isLetter(str1[i]) || str1[i] == '_') {
                string += str1[i];
                i++;
                flag = true;
                for (; i < str1.length && (Character.isDigit(str1[i]) || Character.isLetter(str1[i]) || str1[i] == '_'); i++) {
                    string += str1[i];
                }
            }
            if (flag) {
                checkNick2(string);
                list.add(getCode(string));
                i-=1;
                flag = false;
                continue;
            }

            for (; i < str1.length && Character.isDigit(str1[i]); i+=1) {
                num = num * 10 + Character.getNumericValue(str1[i]);
                flag = true;
            }
            if (flag) {
                list.add(String.valueOf(num));
                i-=1;
                flag = false;
                continue;
            }

            if (stack.size() == 0 || str1[i] == '(') {
                stack.push(str1[i] + "");
                continue;
            }

            if (str1[i] == ')') {
                while (stack.size() != 0 && !stack.peek().equals("(")) {
                    list.add(stack.pop());
                }
                stack.pop();
                continue;
            }

            while (stack.size() != 0 && op1.contains(str1[i] + "") && op3.contains(stack.peek())) {
                list.add(stack.pop());
            }
            while (stack.size() != 0 && op2.contains(str1[i] + "") && op2.contains(stack.peek())) {
                list.add(stack.pop());
            }
            stack.push(str1[i] + "");
        }

        while (stack.size() != 0) {
            list.add(stack.pop());
        }

        int sum = 0;
        boolean flag = false;
        for (int i = 2; list.size() != 1; i+=1) {
        	flag = print(list,list.get(i),i);
            if (flag) {
                Visitor.num+=1;
                list.set(i, "%" + Visitor.num);
                list.remove(i - 1);
                list.remove(i - 2);
                i = 1;
                flag = false;
            }
        }

        return list.get(0);
    }
    public void changePlusMinus(char[] str) {
    	char t1;
        char t2;
        int count = 0;
        for(int i = 0;i < str.length - 1;) {
            t1 = str[i];
            t2 = str[i+1];
            if (t1 == '+') {
                if(t2=='-') {
                    t1 = ' ';
                    t2 = '-';
                } else if(t2=='+') {
                    t1 = ' ';
                    t2 = '+';
                }
            } else if (t1 == '-') {
                if(t2=='+') {
                    t1 = ' ';
                    t2 = '-';
                } else if(t2=='-') {
                    t1 = ' ';
                    t2 = '+';
                }
            }
            count+=1;
            str[i] = t1;
            str[i+1] = t2;
            i+=1;
        }
    }
    public boolean print(List<String> list,String temp,int i) {
        int count = 1;
        if(temp.equals("+")) {
            System.out.println("\t%" + (Visitor.num + 1) + " =" + " add i32 " + list.get(i - 2) + ", " + list.get(i - 1));
            count+=1;
        } 
        if(temp.equals("-")) {
            System.out.println("\t%" + (Visitor.num + 1) + " =" + " sub i32 " + list.get(i - 2) + ", " + list.get(i - 1));
            count+=1;
        } 
        if(temp.equals("*")) {
            System.out.println("\t%" + (Visitor.num + 1) + " =" + " mul i32 " + list.get(i - 2) + ", " + list.get(i - 1));
            count+=1;
        } 
        if(temp.equals("/")) {
            System.out.println("\t%" + (Visitor.num + 1) + " =" + " sdiv i32 " + list.get(i - 2) + ", " + list.get(i - 1));
            count+=1;
        } 
        if(temp.equals("%")) {
            count+=1;
            System.out.println("\t%" + (Visitor.num + 1) + " =" + " sdiv i32 " + list.get(i - 2) + ", " + list.get(i - 1));
            Visitor.num+=1;
            System.out.println("\t%" + (Visitor.num + 1) + " =" + " mul i32 " + "%" + Visitor.num + ", " + list.get(i - 1));
            Visitor.num+=1;
            System.out.println("\t%" + (Visitor.num + 1) + " =" + " sub i32 " + list.get(i - 2) + ", " + "%" + Visitor.num);
            count+=1;
        }
        if(count>1) return true;
        else return false;
    }
    public static String getCode(String nick) {
        for (Var v : Visitor.list) {
            if (v.nick.equals(nick)) {
                return v.code;
            }
        }
        return null;
    }

    public static void checkNick(String nick) {
        for (Var v : Visitor.list) {
            if (v.nick.equals(nick)) {
                System.exit(1);
            }
        }
    }

    public static void checkNick2(String nick) {
        for (Var v : Visitor.list) {
            if (v.nick.equals(nick)) {
                return;
            }
        }
        System.exit(1);
    }

    public static boolean check(String nick) {
        for (Var v : Visitor.list) {
            if (v.nick.equals(nick) && v.check) {
                return true;
            } else if (v.nick.equals(nick)) {
                return false;
            }
        }
        return true;
    }

    public static void change(String nick, String newN) {
        for (Var v : Visitor.list) {
            if (v.nick.equals(nick)) {
                v.code = newN;
                v.value = 2;
            }
        }
    }
}