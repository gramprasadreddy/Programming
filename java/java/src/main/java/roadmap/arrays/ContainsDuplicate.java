package roadmap.arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    /*
    * Hashset in java returns false when you add the number to the list if its already present
    * */
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;

    }


    public static void main(String[] args){
        int[] nums = {1,2,3,1};

        System.out.println(new ContainsDuplicate().containsDuplicate(nums));
    }
}
