/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

Example 1:
Input:
N = 5
Output: 1 1 2 3 5
*/

class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long a[] = new long[n];
        if(n==1){
            a[0]=1;
            return a;
        }
        else if(n==2){
            a[0]=1;
            a[1]=1;
            return a;
        }
        else{
            a[0]=1;
            a[1]=1;
            for(int i=2; i<n;i++){
                a[i]=a[i-1]+a[i-2];
            }
        }
        
        return a;
    }
}
