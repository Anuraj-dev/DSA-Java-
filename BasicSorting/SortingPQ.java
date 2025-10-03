package BasicSorting;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

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

    public static int[] selectSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos]<arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        return arr;
    }

    public static int[] inserSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];  //Current = prev
                prev--;
            }
            arr[prev+1] = curr;
        }
        return arr;
    }

    public static int[] countSort(int arr[]){
        //Find max no
        int maxNo = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            maxNo = Math.max(maxNo, arr[i]);
        }

        //Freqency aray
        int freq[] = new int[maxNo+1];
        for(int i = 0; i<arr.length; i++){
            freq[arr[i]]++;
        }

        //Sort
        int j =0;
        for(int i = maxNo; i>=0; i--){
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
        int num[] = {3,6,2,1,8,7,4,5,3,1};

        //? PQ-1 Bubble Sort
        printArr(bSort(num));

        //? PQ-2 Selection Sort
        printArr(selectSort(num));

        //? PQ-3 Insertion sort
        printArr(inserSort(num));

        //? PQ-4 Counting SOrt
        printArr(countSort(num));
    }
}
