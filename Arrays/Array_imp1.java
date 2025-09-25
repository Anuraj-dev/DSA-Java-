package Arrays;

public class Array_imp1 {
    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    } 

    public static int binarySearch(int sortedNum[], int key){
        int start = 0, end = sortedNum.length - 1;

        while (start <= end) {
            int mid = (end+start)/2;
            //compare mid and key
            if(sortedNum[mid] == key){
                return mid;
            } else if(sortedNum[mid] > key){
                //search left
                end = mid-1;
            } else{
                //search right
                start = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        //!Sorted array is prerequisite for Binary Search
        int num[] = {2,4,6,8,45,67,78,89,92,123,125,145};
        int key = 145;
        

        //? Finding index of an ele via Linear Search
        // int index = linearSearch(num, key);
        // if(index == -1){
        //     System.out.println("Key Not Found");
        // } else{
        //     System.out.println("Key is at index: " + index);
        // }

        //? Finding idx of ele using Binary Search
        int index = binarySearch(num, key);
        if(index == -1){
            System.out.println("Key Not Found");
        } else{
            System.out.println("Key is at index: " + index);
        }
    }
}