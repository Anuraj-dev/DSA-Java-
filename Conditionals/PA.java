import java.util.Scanner;

public class PA {

    public static void main(String args[]){

        // int A = 1;
        // int B = 3;

        // if (A >= B){                                        
        //     System.out.println("A is greater than B");
        // } else{
		// 	System.out.println("B is greater than A");
		// }

		//TODO - Print if a no is odd or even

		Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();

		// if(num%2 == 0){
		// 	System.out.println("Even no");
		// } else{
		// 	System.out.println("Odd No");
		// }

		//TODO- Tax Calculator

		// double income = sc.nextDouble();
		// double tax = 0;
		// sc.close();

		// if(income<400000){
		// 	tax = income*0;
		// } else if(income >= 400000 && income < 800000){
		// 	tax = income*0.05;
		// } else if(income >=800000 && income < 1200000){
		// 	tax = income*0.01;
		// } else if(income >=1200000 && income < 1600000){
		// 	tax = income*0.15;
		// } else if(income >=1600000 && income < 2000000){
		// 	tax = income*0.2;
		// } else if(income >= 2000000 && income < 2400000){
		// 	tax = income*0.25;
		// } else{
		// 	tax = income*0.3;
		// }
		// System.out.println("Your tax is:" + tax);
    
		//TODO- Print the largest of 3 Numbers
	
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// int c = sc.nextInt();

		// if(a>b){
		// 	if(a>c){
		// 		System.out.println(a + " is greater than " + b +" and " + c);
		// 	} else {
		// 		System.out.println(c + " is greater than " + b +" and " + a);
		// 	} 
		// }
		// if(b>a){
		// 	if(b>c){
		// 		System.out.println(b + " is greater than " + a +" and " + c);
		// 	} else{
		// 		System.out.println(c + " is greater than " + b +" and " + a);
		// 	}
		// }

		// if(a>=b && a>=c){
		// 	System.out.println(a + " is greater than " + b +" and " + c);
		// } else if(b>=c){
		// 	System.out.println(b + " is greater than " + a +" and " + c);
		// } else{
		// 	System.out.println(c + " is greater than " + b +" and " + a);
		// }

		//TODO- Check if a stident Pass or Fail 

		// int marks = sc.nextInt();
		// sc.close();
		// String result = (marks>=33)? "PASS" : "FAIL";
		// System.out.println(result);

		//TODO- Calculator

		System.out.println("Enter 1st no: ");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd no: ");
		int n2 = sc.nextInt();
		System.out.println("Enter operator: ");
		char operator = sc.next().charAt(0);
		switch (operator) {
			case '+':
				System.out.println(n1+n2);
				break;
			
			case '-':
				System.out.println(n1-n2);
				break;
			
			case '*':
				System.err.println(n1*n2);
				break;
			
			case '/':
				System.out.println(n1/n2);
				break;

			case '%':
				System.out.println(n1%n2);
				break;
			
			default:
				System.err.println("Invalid operation");
				break;
		}
	}
}