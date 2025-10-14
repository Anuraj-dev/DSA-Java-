package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringsAQ {
    public static void countLowerCaseVowels(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your desired line: ");
        String str = sc.nextLine();
        int count = 0;

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if( ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("The lowercase vowels occured " + count + " times");
        sc.close();
    }

    //? Check if 2 str are anagrams PQ-4
    public static boolean checkIfAnagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] ch1Arr = str1.toCharArray();
        char[] ch2Arr = str2.toCharArray();

        Arrays.sort(ch1Arr);
        Arrays.sort(ch2Arr);
     
        return Arrays.equals(ch1Arr, ch2Arr);
    }
    
    //? Another approach of the anagrams
    public static boolean optimisedCheckIfAnagrams(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        int freq[] = new int[128];

        for(int i = 0; i<str1.length(); i++){
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        for(int count : freq){
            if(count != 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        //? PQ-1
        // countLowerCaseVowels();

        //? Q3
        // String str = "ApnaCollege".replace("l", "");
        // System.out.println(str);                        // OUtput will be ApnaCoege

        //? PQ-4
        System.out.println(checkIfAnagrams("race", "care"));

        //? Different Approach PQ-4
        System.out.println(optimisedCheckIfAnagrams("heart", "earth"));
    }
}
