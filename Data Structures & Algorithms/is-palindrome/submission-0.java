class Solution {
    public boolean isPalindrome(String s) {
        String a=s.toLowerCase();
        StringBuilder str= new StringBuilder();
        for(char ch:a.toCharArray()){
        if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
            str.append(ch);
        }
        }
        String str1=str.toString();
        
        int left=0;
        int right=str1.length()-1;
        while(left<right){
            if(str1.charAt(left)==str1.charAt(right)){
                left++;
                right--;
            }else return false;
        }

        if(left>right || left==right){
            return true;
        }else return false;
    }
}
