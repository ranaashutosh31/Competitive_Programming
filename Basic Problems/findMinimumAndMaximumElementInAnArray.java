/*
LINK OF PROBLEM IN EXTENDED DESCRIPTION
Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min=a[0],max=a[0];
        for(int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }
        }
        pair p = new pair(min,max);
        return p;
    }
}
