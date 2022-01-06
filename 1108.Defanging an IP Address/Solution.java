public class Solution{
    public static void main(String args[]){
        Solution sol = new Solution();
        System.out.print(sol.defangIPaddr("255.100.50.0"));
    }
    public String defangIPaddr(String address){
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                address = address.substring(0, i) + "[.]" + address.substring(i + 1);
                i += 2;
            }
        }
        return address;
    }
}