public class Solution{
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] nums = {1,3,4,5,7};
        int target = 6;
        System.out.print(sol.searchInsert(nums, target));
    }
    public int searchInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length;
        int middle = (left + right)/2;
        for(int i = 0; i < nums.length; i++){
            middle = (left + right)/2;
            if(left == right){
                return right;
            }
            else if(nums[middle] < target){
                left = middle + 1;
            }
            else if(nums[middle] > target){
                right = middle - 1;
            }
        }
        return (nums[left] < target)? left + 1 : left;
    }
}