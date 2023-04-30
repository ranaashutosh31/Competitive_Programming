/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given an array A of N elements. The task is to count number of even and odd elements in the array.

Example 1:
Input:
5
1 2 3 4 5
Output:
3 2
Explanation:
In the given array, there are 3 odd elements 
(1, 3, 5) and 2 even elements (2 and 4).
*/

class Geeks {
    static void countOddEven(int a[], int n) {

        // Your code here
        int ce=0,co=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                ce++;
            }
            else{
                co++;
            }
        }
        System.out.print(co+" "+ce);
    }
}
