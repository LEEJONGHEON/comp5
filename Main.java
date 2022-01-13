import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
	public static String out = "";

    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream(args[0]);
        out = args[1];

        byte[] arr = new byte[105];
        String s = "";
        int i = 0;

        while ((i = stream.read(arr, 0, 105)) != -1) {
            s += new String(arr, 0, i);
        }

        String str = "";
        int flag = 0;
        int flag2 = 0;
        int len = 0;
        int check = 0;
        while (true) {
        	len = s.length();
        	check =0;
            if (s.charAt(0) == '/' && s.charAt(1) == '/' && flag2==0) {
                flag = 1;
                if (len == 2) check =1;
                if(check==1) break;
                s = s.substring(2);
                continue;
            }
            if (s.charAt(0) == '/' && s.charAt(1) == '*' && flag==0) {
                flag2 = 1;
                if (len == 2) check =1;
                if(check==1) break;
                s = s.substring(2);
                continue;
            }
            if (s.charAt(0) == '\n' && flag==1) {
                flag = 0;
                str += "\n";
                if (len == 1) check =1;
                if(check==1) break;
                s = s.substring(1);
                continue;
            }
            if (s.charAt(0) == '*' && s.charAt(1) == '/' && flag2==1) {
                flag2 = 0;
                if (len == 2) check =1;
                if(check==1) break;
                s = s.substring(2);
                continue;
            }
            if (flag==0 && flag2==0) {
                str += s.charAt(0);
                if (len == 1) check =1;
                if(check==1) break;
                s = s.substring(1);
                continue;
            }
            if (len == 1) check =1;
            if(check==1) break;
            s = s.substring(1);
        }
        if (flag2==1) {
            System.out.println("error");
            System.exit(1);
        }


        CharStream inputStream = CharStreams.fromString(str); 
        compiler5Lexer lexer = new compiler5Lexer(inputStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer); 
        compiler5Parser parser = new compiler5Parser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        ParseTree tree = parser.compUnit(); 

        Visitor visitor = new Visitor();
        visitor.visit(tree);

        stream.close();
    }
}