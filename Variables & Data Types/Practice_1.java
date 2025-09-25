import java.util.Scanner;

public class Practice_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // TODO: Find area of a circle

        // int rad = sc.nextInt();
        // double pie = 3.14;
        // double area = pie*rad*rad;
        // System.out.println(area);

        //*   Or    */
        float rad = sc.nextInt();  //* We can take it as float or int does't matter
        
        float pie = 3.14f;                     //* To convert to float we need to write f at the end of the number
        double area = pie*rad*rad;             //* Otherwise java will think it as a double by default
        System.out.println(area);


        sc.close();
    }
}