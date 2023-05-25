/*
PROBLEM LINK IN EXTENDED DESCRIPTION
For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.
 
Example 1:
Input:
N = 5
Output:
1
Explanation:
5 has 2 factors 1 and 5 only.
*/

class Solution{
    static int isPrime(int N){
        // code here
        if(N==0 || N==1){
            return 0;
        }
        for(int i=2; i<=Math.sqrt(N);i++){
            if(N%i==0 && N!=2){
                return 0;
            }
        }
        return 1;
    }
}
