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
    public static void main(String[] args) {
        //? First question palindrome
        System.out.println(checkPalindrome("racecar"));

        //? Second ques Shortest path
        findShortestDist("WNEENESENNN");
    }
}
