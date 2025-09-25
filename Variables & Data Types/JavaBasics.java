public class JavaBasics {
    public static void main(String args[]){
        byte a = 5;
        a = (byte) (a * 2);       //! If not converted to byte this will raise a lossy conversion error from int to byte
        System.out.println(a);
       
    }
}
//*boilerplate code

    