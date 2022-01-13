import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Visitor extends compiler5BaseVisitor<Void> {
    public PrintStream ps = new PrintStream(new FileOutputStream(Main.out));
    public static String exp = "";
    public static ArrayList<Var> list = new ArrayList<>();
    public static int num = 0;
    public boolean flag1 = false;
    public boolean flag2 = false;

    public Visitor() throws FileNotFoundException {
        System.setOut(ps);
    }

    @Override
    public Void visitCompUnit(compiler5Parser.CompUnitContext ctx) {
        return super.visitCompUnit(ctx);
    }

    @Override
    public Void visitFuncDef(compiler5Parser.FuncDefContext ctx) {
        System.out.println("declare i32 @getint()");
        System.out.println("declare void @putint(i32)");
        System.out.println("declare i32 @getch()");
        System.out.println("declare void @putch(i32)");
        System.out.print("define dso_local ");
        return super.visitFuncDef(ctx);
    }

    @Override
    public Void visitFuncType(compiler5Parser.FuncTypeContext ctx) {
        System.out.print("i32 @main() ");
        return null;
    }

    @Override
    public Void visitBlock(compiler5Parser.BlockContext ctx) {
        System.out.println("{");
        for (compiler5Parser.BlockItemContext e : ctx.blockItem()) {
            visit(e);
        }
        if (!flag1) {
            System.out.println("\tret i32 0");
        }
        System.out.println("}");
        return null;
    }

    @Override
    public Void visitBlockItem(compiler5Parser.BlockItemContext ctx) {
        return super.visitBlockItem(ctx);
    }

    @Override
    public Void visitStmt(compiler5Parser.StmtContext ctx) {
    	exp = "";
    	String s ="";
        if (ctx.lVal() != null) {
            if (check(ctx.lVal().getText())) {
                System.exit(1);
            }
            String var = ctx.lVal().getText();
            System.out.println("\t%" + (num + 1) + " = alloca i32");
            num+=1;
            int temp = num;
            visit(ctx.exp());
            if (!flag2) {
                s = new Expression().function(exp);
            } else {
                s = "%" + num;
                flag2 = false;
            }
            System.out.println("\tstore i32 " + s + ", i32* %" + temp);
            System.out.println("\t%" + (num + 1) + " = load i32, i32* %" + temp);
            num+=1;
            change(var, "%" + num);
        } else if (ctx.return_() != null) {
            visit(ctx.exp());
            if (!flag2) {
                s = new Expression().function(exp);
            } else {
                s = "%" + num;
                flag2 = false;
            }
            System.out.println("\tret i32 " + s);
            flag1 = true;
        } else {
            visit(ctx.exp());
            if (!flag2) {
                s = new Expression().function(exp);
            } else {
                s = "%" + num;
                flag2 = false;
            }
        }
        return null;
    }

    @Override
    public Void visitReturn_(compiler5Parser.Return_Context ctx) {
        return super.visitReturn_(ctx);
    }

    @Override
    public Void visitLVal(compiler5Parser.LValContext ctx) {
        return super.visitLVal(ctx);
    }

    @Override
    public Void visitDecl(compiler5Parser.DeclContext ctx) {
        return super.visitDecl(ctx);
    }

    @Override
    public Void visitConstDecl(compiler5Parser.ConstDeclContext ctx) {
        return super.visitConstDecl(ctx);
    }

    @Override
    public Void visitBType(compiler5Parser.BTypeContext ctx) {
        return super.visitBType(ctx);
    }

    @Override
    public Void visitConstDef(compiler5Parser.ConstDefContext ctx) {
        checkNick(ctx.ident().getText());
        String var = ctx.ident().getText();
        System.out.println("\t%" + (num + 1) + " = alloca i32");
        num+=1;
        int temp = num;
        int i =0; 
        exp = "";
        visit(ctx.constInitVal());
        String s = "";
        if (!flag2) {
            char[] str1 = exp.toCharArray();
            int len=str1.length;
            while(i<len) {
            	String string = "";
                int flag = 0;
                if (Character.isLetter(str1[i]) || str1[i] == '_') {
                    string += str1[i];
                    i+=1;
                    flag = 1;
                    for (; i < len && (Character.isDigit(str1[i]) || Character.isLetter(str1[i]) || str1[i] == '_'); i+=1) {
                        string += str1[i];
                    }
                }
                if (flag==1) {
                    checkNick2(string);
                    if (!check(string)) {
                        System.exit(1);
                    }
                    i-=1;
                    flag = 0;
                }
                i+=1;
            }
            s = new Expression().function(exp);
        } else {
            s = "%" + num;
            flag2 = false;
        }
        System.out.println("\tstore i32 " + s + ", i32* %" + temp);
        System.out.println("\t%" + (num + 1) + " = load i32, i32* %" + temp);
        num+=1;

        list.add(new Var(var, "%" + num, 2, true));
        return null;
    }

    @Override
    public Void visitConstInitVal(compiler5Parser.ConstInitValContext ctx) {
        return super.visitConstInitVal(ctx);
    }

    @Override
    public Void visitConstExp(compiler5Parser.ConstExpContext ctx) {
        return super.visitConstExp(ctx);
    }

    @Override
    public Void visitVarDecl(compiler5Parser.VarDeclContext ctx) {
        return super.visitVarDecl(ctx);
    }

    @Override
    public Void visitVarDef(compiler5Parser.VarDefContext ctx) {
    	int temp;
    	int check = 0;
    	exp = "";
    	String s = "";
        checkNick(ctx.ident().getText());
        String var = ctx.ident().getText();
        System.out.println("\t%" + (num + 1) + " = alloca i32");
        num+=1;
        temp = num;
        if (ctx.initVal() == null) {
            System.out.println("\t%" + (num + 1) + " = load i32, i32* %" + temp);
            num+=1;
            check =1;
        } else {
            visit(ctx.initVal());
            if (!flag2) {
                s = new Expression().function(exp);
            } else {
                s = "%" + num;
                flag2 = false;
            }
            System.out.println("\tstore i32 " + s + ", i32* %" + temp);
            System.out.println("\t%" + (num + 1) + " = load i32, i32* %" + temp);
            num+=1;
            check=2;
        }
        if(check==1) {
        	list.add(new Var(var, "%" + num, 1, false));
        } 
        if(check==2) {
        	list.add(new Var(var, "%" + num, 2, false));
        }
        return null;
    }

    @Override
    public Void visitInitVal(compiler5Parser.InitValContext ctx) {
        return super.visitInitVal(ctx);
    }

    @Override
    public Void visitExp(compiler5Parser.ExpContext ctx) {
        return super.visitExp(ctx);
    }

    @Override
    public Void visitAddExp(compiler5Parser.AddExpContext ctx) {
        return super.visitAddExp(ctx);
    }

    @Override
    public Void visitAddSub(compiler5Parser.AddSubContext ctx) {
        exp += ctx.getText();
        return null;
    }

    @Override
    public Void visitMulExp(compiler5Parser.MulExpContext ctx) {
        return super.visitMulExp(ctx);
    }

    @Override
    public Void visitMulDiv(compiler5Parser.MulDivContext ctx) {
        exp += ctx.getText();
        return null;
    }

    @Override
    public Void visitUnaryExp(compiler5Parser.UnaryExpContext ctx) {
        if (ctx.primaryExp() != null) {
            visit(ctx.primaryExp());
        } else if (ctx.ident() != null) {
            String text = ctx.ident().getText();
            exp = "";
            if (text.equals("getint") && ctx.funcRParams() == null) {
            	flag2 = true;
                System.out.println("\t%" + (num + 1) + " = call i32 @getint()");
                num+=1;
            } else if (text.equals("putint") && ctx.funcRParams() != null) {
            	flag2 = true;
                visit(ctx.funcRParams());
                String s = new Expression().function(exp);
                System.out.println("\tcall void @putint(i32 " + s + ")");
            } else if (text.equals("getch") && ctx.funcRParams() == null) {
            	flag2 = true;
                System.out.println("\t%" + (num + 1) + " = call i32 @getch()");
                num+=1;
            } else if (text.equals("putch") && ctx.funcRParams() != null) {
            	flag2 = true;
                visit(ctx.funcRParams());
                String s = new Expression().function(exp);
                System.out.println("\tcall void @putch(i32 " + s + ")");
            } else {
                System.exit(1);
            }
            
        } else {
            visit(ctx.unaryOp());
            visit(ctx.unaryExp());
        }
        return null;
    }

    @Override
    public Void visitFuncRParams(compiler5Parser.FuncRParamsContext ctx) {
        return super.visitFuncRParams(ctx);
    }

    @Override
    public Void visitPrimaryExp(compiler5Parser.PrimaryExpContext ctx) {
        if (ctx.exp() != null) {
            exp += "(";
            visit(ctx.exp());
            exp += ")";
        } else if (ctx.lVal() != null) {
            exp += ctx.lVal().getText();
        } else {
            visit(ctx.number());
        }
        return null;
    }

    @Override
    public Void visitUnaryOp(compiler5Parser.UnaryOpContext ctx) {
        exp += ctx.getText();
        return null;
    }

    @Override
    public Void visitIdent(compiler5Parser.IdentContext ctx) {
        return super.visitIdent(ctx);
    }

    @Override
    public Void visitNumber(compiler5Parser.NumberContext ctx) {
        if (ctx.DecimalConst() != null) {
            exp += ctx.DecimalConst().getText();
        } else if (ctx.OctalConst() != null) {
            if (ctx.OctalConst().getText().equals("0")) {
                exp += "0";
            } else {
                String s = ctx.OctalConst().getText().substring(1);
                exp += String.valueOf(Integer.parseInt(s, 8));
            }
        } else {
            String s = ctx.HexadecimalConst().getText().substring(2);
            exp += String.valueOf(Integer.parseInt(s, 16));
        }
        return null;
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
