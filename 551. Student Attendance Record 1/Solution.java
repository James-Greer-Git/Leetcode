public class Solution{
    public static void main(String args[]){
        String s = "PPALLP";
        Solution sol = new Solution();
        System.out.print(sol.checkRecord(s));
    }
    public boolean checkRecord(String s){
        int absentCount = 0;
        int lateCount = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == 'A'){
                absentCount++;
            }
            if(absentCount > 1){
                return false;
            }
            if(chars[i] == 'L'){
                lateCount++;
                while(i + 1 < chars.length && chars[i + 1] == 'L'){
                    lateCount++;
                    i++;
                }
                if(lateCount > 2){
                    return false;
                }
            }
            lateCount = 0;
        }
        return true;
    }
}
