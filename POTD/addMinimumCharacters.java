/*
Given a string str, find the minimum characters to be added at front of the string to make it a palindrome.
Example 1:

Input:
str = ABCD
Output: 3
Explanation: The resultant string 
after adding 3 characters is DCBABCD.
The minimum possible answer is 3.
*/

class Solution
{
	public static int addMinChar(String str){
		//code here
		int start=0, end=str.length()-1;
		int lastInd = str.length()-1;
		while(start<=end){
		    if(str.charAt(start)==str.charAt(end)){
		        start++;
		        end--;
		    }
		    else{
		        start=0;
		        lastInd--;
		        end=lastInd;
		    }
		}
		return str.length()-1-lastInd;
	}
}
