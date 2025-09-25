package Arrays;

public class Array2 {

    public static void update(int marks[], int nonChangable){
        //*Non changable is updated but it wwont refltect in the results. Why?` */
        nonChangable = 10;
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int myMarks[] = {99, 98, 95};
        int nonChangable = 5;         //!This is not changable means, var cannot pass as arguments. Bcz They work as call by value
        update(myMarks, nonChangable);            //?Representing array can be pass as arguments (call by refrence)

        //print mymarks one by one
        for(int i = 0; i<myMarks.length; i++){
            System.out.println("Your updated marks are for Sub " +(i+1)+ " is: " + myMarks[i]);
        }

        //?NonChangable will not change
        System.out.println(nonChangable);    //! NOt make this mistake of passing an declared var inside func as arguments it won't work
    }
}