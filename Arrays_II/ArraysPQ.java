package Arrays_II;

import java.util.Arrays;
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
    public static void uniqueTriplets(int nums[]){
        Arrays.sort(nums);
         System.out.print("[");
        for(int i =0; i<nums.length-2; i++){
            if(i>=1 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1, right = nums.length -1;
            while(left <= right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0 && i!=left && i!=right && left!=right){
                    System.out.print("[" + nums[i] + ", " + nums[left] + ", " + nums[right] + "] ");
                    left++;
                    right--;
                //Skip dublicates for left
                while(left<right && nums[left] == nums[left-1]){
                    left++;
                }
                //Skip dublicates for right
                while(left < right && nums[right] == nums[right-1]){
                    right--;
                }
                } else if(sum < 0){
                    left++;
                } else{
                    right--;
                }
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        int nums2[] = {4,5,6,7,0,1,2};
        int nums3[] = {-1,0,1,2,-1,-4};

        //?PQ-1
        System.out.println(checkIfRedundant(nums));

        //?PQ-2
        System.out.println(indexTarget(nums2, 4));

        //?PQ-3
        uniqueTriplets(nums3);
      
    }
}
