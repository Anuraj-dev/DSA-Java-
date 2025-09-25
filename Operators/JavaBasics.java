public class JavaBasics{
    public static void main(String[] args) {
        // int a = 20;
        // int b = ++a;         //? Pre increment (Value update in a then use in b)
        
        // System.out.println(a);
        // System.out.println(b);


        int a = 20;
        int b = a++;            //? Post increment (Use in b then value change of a)
        
        System.out.println(a);
        System.out.println(b); 

        int c = 10;
        int d = 57;
        System.out.println((c==d));        //*This is an relational operator who checks the conditions(return bool val) */

        //!Logical Operators
        System.out.println( (6<8) && (5>2));  //*Logical AND*/
        



    }
}
