package Arrays;

public class Array_PQ {
    public static int getLargestNum(int numbers[]){
        int largestNum = Integer.MIN_VALUE;   //? -infinity
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] > largestNum){
                largestNum = numbers[i];
            }
        }
        return largestNum;
    }

    public static int[] reverseArray(int num[]){
        int first = 0, last = num.length-1;

        while(first < last){
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;

            first++;
            last--;
        }
        return num;
    }

    public static void pairsOfArray(int num[]){
        for(int i = 0; i<num.length-1; i++){                    //*-1 is actually not needed but i write just to reject the extra line space */
            for(int j = i+1; j<num.length; j++){
                System.out.print("(" + num[i] + "," + num[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void printSubArrays(int num[]){
        int ts = 0; //total pairsmy_tupule = (1,5,8,"raja")
        int minSum = Integer.MAX_VALUE, maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            for(int j = i; j<num.length; j++){
                int currSum = 0;
                for(int k = i; k<=j; k++){
                    //SubArray Sum
                    currSum+=num[k];
                    System.out.print(num[k] + " "); //Print Subarrays
                }
                System.out.print("Sum: " + currSum);
                ts++;
                if(minSum>currSum){
                    minSum = currSum;
                } else if(maxSum<currSum){
                    maxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays: " + ts);
        System.out.println("MinSum: " + minSum + " MaxSum: " + maxSum);
    }

    public static void main(String args[]){
        int num[] = {-1, 2, 3};

        //? Find the largest num in an array
        // System.out.println("Largest num in the array is: " + getLargestNum(num));

        //? Find Reverse of an Array
        // int revArr[] = reverseArray(num);
        // for(int i = 0; i<revArr.length; i++){
        //     System.out.print(revArr[i] + " ");
        // }
        // System.out.println();

        //? Finding pairs of array
        // pairsOfArray(num);

        //? Print subarrays
        printSubArrays(num);
    }
}