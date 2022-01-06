import java.util.ArrayList;
import java.util.List;

public class Solution{
    public static void main(String args[]){
        Solution solution = new Solution();
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1 ,5}};
        solution.setZeroes(matrix);
        /*for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }*/

    }
    public int[][] setZeroes(int[][] matrix){
        List<int[]> indices = new ArrayList<int[]>();    //list of 2x1 arrays to record position of zeroes in matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    int[] index = {i,j};
                    indices.add(index);
                }
            }
        }
        for(int i = 0; i < indices.size(); i++){
            zeroRows(matrix, indices.get(i)[0]);
            zeroColumns(matrix, indices.get(i)[1]);
        }
        return matrix;
    }
    public int[][] zeroColumns(int[][] matrix, int column){    //this will zero the column in matrix relevant to the given position
        for(int i = 0; i < matrix.length; i++){
            matrix[i][column] = 0;
        }
        return matrix;
    }
    public int[][] zeroRows(int[][] matrix, int row){           //this will zero the row in matrix relevant to the given position
        for(int i = 0; i < matrix[0].length; i++){
            matrix[row][i] = 0;
        }
        return matrix;
    }
}