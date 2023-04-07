/*
Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.
Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
*/

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        int i=0,min=(n<m)?n:m;
        HashSet<Integer> set= new HashSet<>();
        for(i=0;i<min;i++){
            set.add(a[i]);
            set.add(b[i]);
        }
        if(n>m){
            for(i=0;i<n;i++){
                set.add(a[i]);
            }
        }
        else{
            for(i=0;i<m;i++){
                set.add(b[i]);
            }
        }
        return set.size();
    }
}
