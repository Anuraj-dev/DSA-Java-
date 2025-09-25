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
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};

        //?PQ-1
        System.out.println(checkIfRedundant(nums));
    }
}
