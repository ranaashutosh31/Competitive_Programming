/*
Given an array of negative and non-negative integers. You have to make the array beautiful. An array is beautiful if two adjacent integers, arr[i] and arr[i+1] are either negative or non-negative. And you can do the following operation any number of times until the array becomes beautiful.

If two adjacent integers are different i.e. one of them is negative and other is non-negative, remove them.
Return the beautiful array after performing the above operation.

Note:An empty array is also a beautiful array. There can be many adjacent integers which are different as stated above. So remove different adjacent integers as described above from left to right.

Example 1:

Input: 4 2 -2 1
Output: 4 1
Explanation: As at indices 1 and 2 , 2 and -2 have
different sign, they are removed. And the  the final
array is: 4 1.
*/

class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        Stack<Integer> stk=new Stack<>();
       for(int a:arr){
           if(stk.size()==0 || (stk.peek()<0 && a<0) || (stk.peek()>=0 && a>=0) ){
               stk.push(a);
           }
           else{
               stk.pop();
           }
       }
        return new ArrayList<>(stk);
    }
}
