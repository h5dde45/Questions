package ru.q170;

import java.util.Stack;

public class StringReversWays {

    public static void main(String[] args) {

        String str="Abc de";
        System.out.println(str+"\n==========================");
        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println("1. "+stringBuffer.reverse());

        char[] chars=str.toCharArray();
        System.out.print("2. ");
        for(int i=chars.length-1;i>=0;i--){
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.println("3. "+(new StringReversWays()).recursiveReverse(str));

        StringBuilder stringBuilder=new StringBuilder();
        for(int i=chars.length-1;i>=0;i--){
            stringBuilder.append(str.charAt(i));
        }
        System.out.println("4. "+stringBuilder);
        System.out.println("5. "+(new StringReversWays()).reverseByStack(str));



    }
    public String recursiveReverse(String s){
        if((s==null)||(s.length()<2)){
            return s;
        }
        return recursiveReverse(s.substring(1))+s.charAt(0);
    }
    public String reverseByStack(String s){
        Stack<Character> stack=new Stack<>();
        for(Character character:s.toCharArray()){
            stack.add(character);
        }
        StringBuilder builder=new StringBuilder();
        while (stack.size()>0){
            builder.append(stack.pop());
        }
        return builder.toString();
    }

}
