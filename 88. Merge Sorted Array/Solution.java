public class Solution{
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        sol.merge(nums1, m, nums2, n);
    }
    public int[] merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m - 1;
        int p2 = n - 1; 
        for(int p = m + n - 1; p >= 0; p--){
            if(p2 < 0){
                break;
            }
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1--];
            }
            else{
                nums1[p] = nums2[p2--];
            }
        }
        return nums1;
    }
}