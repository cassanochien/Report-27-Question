package Cau5;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "EASYQUESTION";
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        for (char c : ch) {
            System.out.print(c);
        }
        Stack<String> stack = new Stack<String>();
        for (char a : ch) {
            String m = "" + a;
            stack.push(m);
        }
        System.out.println();
        System.out.println("Size: " + stack.size());
        System.out.println("Stack ban dau: " + stack);
        Stack<String> stack1 = new Stack<String>();
        while (stack.size() > 0) {
            String str = stack.pop();
            if (str.equals("*")) {
                continue;
            } else {
                stack1.push(str);
            }
        }
        System.out.println("Stack pop *: " + stack1);
        String string = "";
        while (stack1.size() > 0) {
            String str = stack1.pop();
            stack.push(str);
            string += str;
        }
        System.out.println("Stack dao nguoc: " + stack);
        System.out.println("String: " + string);
    }
}
