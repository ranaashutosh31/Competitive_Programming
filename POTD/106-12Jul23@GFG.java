/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a number and its reverse. Find that number raised to the power of its own reverse.
Note: As answers can be very large, print the result modulo 109 + 7.

Example 1:
Input:
N = 2
Output: 4
Explanation: The reverse of 2 is 2 and after raising power of 2 by 2 we get 4 which gives remainder as 4 when divided by 1000000007.
*/

class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        long mod = 1000000007;  
        
        if(R==0){
            return 1;
        }
        long t=power(N,R/2);
        t=(t*t)%mod;
        if(R%2==0){
            return t;
        }
        else{
            return (t*N)%mod;
        }
    }

}
