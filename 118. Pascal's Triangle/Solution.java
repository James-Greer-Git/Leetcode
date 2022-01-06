import java.util.*;

public class Solution{
    public static void main(String args[]){
        Solution sol = new Solution();
        System.out.print(sol.generate(5));
    }
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++){
            List<Integer> currentRow = new ArrayList<Integer>();
            for(int j = 0; j < i + 1; j++){
                if(j == 0 || j == i){
                    currentRow.add(j, 1);
                }
                else{
                    currentRow.add(j, pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j));
                }
            }
            pascal.add(i, currentRow);
        }
        return pascal;
    }
}