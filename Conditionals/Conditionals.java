import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        

        // if(age>=18){                                           //* If else Contidionals */
        //     System.out.println("You can Vote!");
        // }
        // else if(age>=13 && age<18) {
        //     System.out.println("Baccha hai tu!");
        // }
        // else{
        //     System.out.println("You are minor!!");    
        // }

        //*Ternary Operator */
        // String votingElegibility = (age>=18)? "Can Vote" : "Minor";
        // System.out.println(votingElegibility); 
        
        //*Switch Statements */
        int number = sc.nextInt();
        switch (number){
            case 1: System.out.println("Samosa");
                break;
            case 2: System.out.println("Burger");
                break;
            case 3: System.out.println("Protein");
                break;
            default: System.err.println("Wake up!!");
        }
        sc.close();
    }
}