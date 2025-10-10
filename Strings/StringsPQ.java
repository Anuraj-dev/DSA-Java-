package Strings;
public class StringsPQ {
    //? PQ-1
    public static boolean checkPalindrome(String str){
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){          
              return false; 
            } 
        }
        return true;
    }

    //? PQ-2 
    public static void findShortestDist(String path){
        int x = 0,y = 0;
        for(int i = 0; i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'E'){
                x++;
            } else if(dir == 'W'){
                x--;
            } else if(dir == 'N'){
                y++;
            } else if(dir == 'S'){
                y--;
            } else{
                System.out.println("Invalid direction!!");
                return;
            }
        }
        double shortestDist = Math.sqrt(x*x + y*y);
        System.out.println("Shortest distance between to reach the destination is: " + shortestDist);
    }

    //? Substring printer
    public static String subString(String str, int si, int ei){
        String sub =  "";
        for(int i = 0; i<ei; i++){
            sub+= str.charAt(i);
        }
        return sub;
    }

    //? Print the largest string
    public static void printLargestStr(String l[]){
        String largest = l[0];
        for(int i=1; i<l.length; i++){
            if(largest.compareTo(l[i]) < 0){
                largest = l[i];
            }
        }
        System.out.println("The largest string is: " + largest);
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        String fruits[] = {"apple", "banana", "mango"};

        //? First question palindrome
        System.out.println(checkPalindrome("racecar"));

        //? Second ques Shortest path
        findShortestDist("WNEENESENNN");

        //? Substring tester homebuild
        System.out.println(subString(str, 0, 5));
        System.out.println(str.substring(0, 5));            //! In built available

        //? Print largest string
        printLargestStr(fruits);
    }
}
