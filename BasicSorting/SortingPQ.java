package BasicSorting;

public class SortingPQ {
    public static int[] bSort(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }



    //?For printing array
    public static void printArr(int arr[]){
        System.out.print("[ ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int num[] = {3,6,2,1,8,7,4,5,3,1};

        //? PQ-1 Bubble Sort
        printArr(bSort(num));

        //? PQ-2 Selection Sort
        

    }
}
