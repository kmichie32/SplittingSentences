package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fromUser = scanner.nextLine();
        String REGEX = "[!,?._'@]";
        String Replace = " ";

        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(fromUser);
        StringBuffer sb = new StringBuffer();

        while(m.find()){
            m.appendReplacement(sb,Replace);
        }
        m.appendTail(sb);
        String finalString = sb.toString();

        String[] wordsFromFinalString = finalString.split(" ");

        int spaceCount = 0;
        for(int i = 0; i < wordsFromFinalString.length; i++){
            if(wordsFromFinalString[i].length() == 0){
                spaceCount+=1;
            }
        }

        System.out.println((wordsFromFinalString.length)-spaceCount);

        for(int i = 0; i < wordsFromFinalString.length; i++){
            if(wordsFromFinalString[i].length() != 0){
                System.out.println(wordsFromFinalString[i]);
            }
        }

        // write your code here
    }
}

// http://www.tutorialspoint.com/java/java_regular_expressions.htm