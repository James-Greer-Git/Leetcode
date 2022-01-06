import java.util.Arrays;

public class Solution{
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] heights = {1, 5, 6, 3, 2};
    }
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            expected[i] = heights[i];
        }
        int count = 0;
        
        Arrays.sort(expected);
        for(int i = 0; i < expected.length; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}