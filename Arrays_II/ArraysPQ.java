package Arrays_II;

import java.util.HashSet;

public class ArraysPQ {
    public static boolean checkIfRedundant(int nums[]){
       HashSet<Integer> seen = new HashSet<>();
       for(int i = 0; i<nums.length; i++){
            if(seen.contains(nums[i]) ){
                return true;
            } else{
                seen.add(nums[i]);
            }
        }
        return false;
    }
    public static int indexTarget(int nums[], int target){
        int start = 0, end = nums.length -1;
        
        while (start <= end) {
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            } 
            //? Check if 1st half sorted
            if(nums[start] < nums[mid]){
                //? Where is the target
                if(target < nums[mid] && target >= nums[start]){
                    //Left half
                    end = mid -1;
                } else{
                    //Right half
                    start = mid +1;
                }
                //? 2nd half sorted
            } else{
                //? Where is the target?
                if(target > nums[mid] && target <= nums[end]){
                    //Right half
                    start = mid +1;
                } else{
                    //Left Half
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        int nums2[] = {4,5,6,7,0,1,2};

        //?PQ-1
        System.out.println(checkIfRedundant(nums));

        //?PQ-2
        System.out.println(indexTarget(nums2, 4));
    }
}
