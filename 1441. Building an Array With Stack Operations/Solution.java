import java.util.ArrayList;
import java.util.List;

public class Solution{
    public static void main(String args[]){
        int[] target = {1, 3};
        int n = 3;
        Solution sol = new Solution();
        sol.buildArray(target, n);
    }
    public List<String> buildArray(int[] target, int n){
        List<String> operations = new ArrayList<>();
        int index = 0;
        int l = target[target.length - 1];
        for(int i = 1; i <= l; i++){
            if(target[index] == i){
                operations.add("Push");
                index++;
            }
            else{
                operations.add("Push");
                operations.add("Pop");
            }
        }
        return operations;
    }
}