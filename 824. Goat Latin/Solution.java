class Solution {
    public String toGoatLatin(String sentence) {
        String strArray[] = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int r = 1;
        
        for(int i = 0; i < strArray.length; i++){
            char c = strArray[i].charAt(0);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                stringBuilder.append(strArray[i]).append("ma").append("a".repeat(r++)).append(" ");
            }
            else{
                stringBuilder.append(strArray[i].substring(1)).append(strArray[i].charAt(0)).append("ma").append("a".repeat(r++)).append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
}
