/*
PROBLEM LINK IN EXTENDED DESCRIPTION
For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371

Example 1:
Input: N = 153
Output: "Yes"
Explanation: 153 is an Armstrong number
since 13 + 53 + 33 = 153.
Hence answer is "Yes".
*/

class Solution {
    static String armstrongNumber(int n){
        // code here
        int sum=0,num=n;
        while(num>0){
            int mod = num%10;//3//5//1
            sum+= Math.pow(mod,3);//27//152//
            num=num/10;//15//1//0
        }
        if(sum==n){
            return "Yes";
        }
        return "No";
    }
}
