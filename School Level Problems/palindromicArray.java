/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

Example 1:
Input:
5
111 222 333 444 555

Output:
1

Explanation:
A[0] = 111 //which is a palindrome number.
A[1] = 222 //which is a palindrome number.
A[2] = 333 //which is a palindrome number.
A[3] = 444 //which is a palindrome number.
A[4] = 555 //which is a palindrome number.
As all numbers are palindrome so This will return 1.

*/

class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  
                  for(int i=0;i<n;i++){
                      int temp=a[i];
                      int sum=0, r=0;
                      while(a[i]>0){
                          r = a[i]%10;
                          sum = (sum*10)+r;
                          a[i] = a[i]/10;
                      }
                      if(temp!=sum){
                          return 0;
                      }
                  }
                  return 1;
           }
}
