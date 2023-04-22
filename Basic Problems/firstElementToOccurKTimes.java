/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given an array of N integers. Find the first element that occurs at least K number of times.
 

Example 1:
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
4
Explanation:
Both 7 and 4 occur 2 times. 
But 4 is first that occurs 2 times
As at index = 4, 4 has occurred 
atleast 2 times whereas at index = 6,
7 has occurred atleast 2 times.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/

class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!count.containsKey(a[i])){
                if(k==1){
                    return a[i];
                }
                count.put(a[i],1);
            }
            else{
                if(count.get(a[i])+1==k){
                    return a[i];
                }
                count.put(a[i],count.get(a[i])+1);
            }
        }
        return -1;
    } 
}
