//PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution {
    public boolean isPowerOfThree(int n) {
        return (n>0 && 1162261467%n==0);
    }
}

//EASY SOLUTION

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1) return true;
        int count = 0, i = 1;
        while(count == 0){
            if(Math.pow(3,i) == n) return true;
            if(Math.pow(3,i) < n) i++;
            if(Math.pow(3,i) > n) count++;
        }
        return false;
    }
}
