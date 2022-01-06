public class Solution{
    public static void main(String args[]){
        Solution sol = new Solution();
        String[] bank = {"011001","000000","010100","001000"};
        System.out.print(sol.numberOfBeams(bank));
    }
    public int numberOfBeams(String[] bank){
        int beams = 0;
        int rows = bank.length;
        int columns = bank[0].length();
        int[] devices = new int[rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(bank[i].charAt(j) == '1'){
                devices[i]++;
                }
            }
        }
        int p1 = 0;
        int p2 = 1;
        for(int i = 0; i < rows; i++){
        if(p1 < devices.length && p2 < devices.length){
            if(devices[p1] != 0 && devices[p2] != 0){
                beams += devices[p1]*devices[p2];
                p1++;
                p2++;
            }
            else if(devices[p2] == 0){
                p2++;
                i--;
            }
            else if(devices[p1] == 0){
                p1++;
                if(p1 == p2){
                    p2++;
                }
                
            }
        }
        }

        return beams;
    }
}