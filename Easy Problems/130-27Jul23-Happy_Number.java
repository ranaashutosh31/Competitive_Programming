/*
PROBLEM LINK IN EXTENDED DESCRIPTION
*/

class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7) return true;
        if(n>9){
            int res=0;
            while(n>0){
                res+=(n%10)*(n%10); //1
                n=n/10; //0
            }
            return isHappy(res);
        }
        return false;
    }
}
