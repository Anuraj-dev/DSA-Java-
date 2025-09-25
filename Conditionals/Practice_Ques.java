import java.util.Scanner;

public class Practice_Ques {
    public static void main(String[] args) {
        //!Q1
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // String numStatus = (num>=0)? "Positive" : "Negative";
        // System.err.println(numStatus);

        //!Q2
        // double temp = 103.2;
        // String isFever = (temp>100)? "You Have Fever": "You don't have fever";
        // System.out.println(isFever);

        //!Q3
        // System.out.println("Enter a week no (1-7)");
        // int week_num = sc.nextInt();
        // switch (week_num) {
        //     case 1:
        //         System.out.println("Sunday");
        //         break;
        //     case 2:
        //         System.out.println("Monday");
        //         break;
        //     case 3:
        //         System.out.println("Tuesday");
        //         break;
        //     case 4:
        //         System.out.println("Wednesday");
        //         break;
        //     case 5:
        //         System.out.println("Thursday");
        //         break;
        //     case 6:
        //         System.out.println("Friday");
        //         break;
        //     case 7:
        //         System.out.println("Saturday");
        //         break;
        
        //     default:
        //     System.out.println("Wrong Input!!");
        //         break;
        // }

        //!Q5
        int year = sc.nextInt();
        //?V1
        // if(year%4 == 0){
        //     if(year%100 != 0){
        //         System.out.println("Leap Year");
        //     } else if(year%400 ==0){
        //     System.out.println("Leap Year");
        //     } else{
        //     System.out.println("Not a Leap Year");
        //     }
        // } 
        //?v2
        if((year%4 == 0 && year%100 != 0) || year%400 == 0 ){
            System.out.println("Leap Year");
        } else{
            System.out.println("Not a Leap Year");
        }

        sc.close();
    }
}
