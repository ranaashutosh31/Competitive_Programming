//PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution {
    public boolean isPowerOfTwo(int n) {
        int count=0,i=0;
        while(count==0){
            if(Math.pow(2,i)==n) return true;
            if(Math.pow(2,i)<n) i++;
            if(Math.pow(2,i)>n) count++;
        }
        return false;
    }
}
