package src.stringProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(palindromicSubStr(str));
    }

    private static Map<Integer, String> palindromicSubStr(String str) {
        int length = str.length();
        String palindromicString = null;
        int maxpalindromiclenght = 0;
        for(int i = 0; i < length; i++){
            for(int j=i+1; j < length; j++){
                int lenght = j-i;
                String substr = str.substring(i,j+1);
                if(checkPalidrom(substr)){
                    if(lenght > maxpalindromiclenght){
                        maxpalindromiclenght = substr.length();
                        palindromicString = substr;
                    }
                }
            }
        }
        int finalMaxpalindromiclenght = maxpalindromiclenght;
        String finalPalindromicString = palindromicString;
        return new HashMap<>() {{
            put(finalMaxpalindromiclenght, finalPalindromicString);
        }};
    }

    public static boolean checkPalidrom(String substr){
        for(int i=0; i < substr.length(); i++){
            if(substr.charAt(i) != substr.charAt(substr.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}

