package BasicSorting;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    //?Bubble sort
    public static int[] bubbleSort(int arr[]){
        //Turns
        for(int i = 0; i<arr.length-1; i++){
            int swap = 0;
            //SwapSorting
            for(int j = 0; j<arr.length-1-i; j++){   //! We are soting upto n-2 elements if arr.length is n | See carefully thats a < sign
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            //? If no swap is there than the array is already sotrted (simply return it)
            if(swap ==0){
               return arr;
            }
        }
        return arr;
    }

    //? Selection sort lets go
    public static int[] selectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos]>arr[j]){                 //! If u write < then this will give result in desc order
                    minPos = j;
                }
            }
            if(minPos != 1){
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
            }
        }
        return arr;
    }

    //? Insertion sort lets gooo
    public static int[] insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //Finding out the correct pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
        return arr;
    }

    //? Insertion sort by me
    //! Logic is flawed - Not correct
    public static int[] insertionSortMe(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<i; j++){
                int temp = arr[j];
                if(temp > arr[j+1]){
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //? Counting sort (In trip letss goo)
    public static int[] countingSort(int arr[]){
        int maxNo = Integer.MIN_VALUE;
        //Calculate Largest integer
        for(int i = 0; i<arr.length; i++){
            maxNo = Math.max(maxNo, arr[i]);
        }
        //Frequency array
        int freq[] = new int[maxNo + 1];
        for(int i = 0; i<arr.length; i++){
            freq[arr[i]]++;
        }

        //Sort it or say print it
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            while(freq[i]>0){
                arr[j] = i;
                j++;
                freq[i]--;
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
        Integer arr[] = {5,4,1,3,2};
        int arr2[] = {5,4,1,3,2};
        int arr3[] = {1,4,1,3,2,4,3,7};
        //? Bubble sort testing
        // printArr(bubbleSort(arr));

        //?Selection Sort Lets goo
        // printArr(selectionSort(arr));

        //? Insertion sort
        // printArr(insertionSort(arr));

        //? Mine Insertion sort
        // printArr(insertionSort(arr2));

        //? Inbuilt java sort
        Arrays.sort(arr, Collections.reverseOrder());             //? Inbuilt sort like Arrays.sort(arr, startingIndex, endingIndex(nonInclusive)) 
        // printArr(arr);

        //? Counting sort
        printArr(countingSort(arr3));
    }
}