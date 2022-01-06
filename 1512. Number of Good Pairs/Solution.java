public class Solution{
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.print(sol.numIdenticalPairs(nums));;
    }
    public int numIdenticalPairs(int[] nums){
        int pointer = 0;
        int pairs = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[pointer] == nums[i] && pointer < i){
                pairs++;
            }
            if(i == nums.length - 1 && pointer < nums.length - 1){
                pointer++;
                i = -1;
            }
        }
        return pairs;
    }
}