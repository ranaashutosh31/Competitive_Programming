//PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution {
    public void reverseString(char[] s) {
        int len = s.length, j= len-1;
        for(int i=0;i<len/2;i++){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
    }
}
