/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a positive integer, N. Find the factorial of N.
 
Example 1:
Input:
N = 5
Output:
120
Explanation:
*/
class Solution{
    static long factorial(int N){
        // code here
        long fact = 1;
        if(N==0 || N==1){
            fact = fact*1;
        }
        for(int i=2;i<=N;i++){
            fact = fact*i;
        }
        return fact;
    }
}
