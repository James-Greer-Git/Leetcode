import java.util.HashMap;

public class Solution{
    public static void main(String args[]){
        int[] nums = {1,1,2,2,3,3,5,6,6,7,8,9,7,8,9};
        Solution sol = new Solution();
        System.out.print(sol.singleNumber(nums));
    }
    public int singleNumber(int[] nums){
        HashMap<Integer, Boolean> nums_tracker = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(nums_tracker.containsKey(nums[i])){
                nums_tracker.remove(nums[i]);
            }
            else{
                nums_tracker.put(nums[i], true);
            }
        }
        for(int i : nums_tracker.keySet()){
            if(nums_tracker.get(i) == true){
                return i;
            }
        }
        return -1;
    }
}