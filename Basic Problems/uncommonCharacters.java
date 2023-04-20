/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given two strings A and B. Find the characters that are not common in the two strings. 

Note :- Return the string in sorted order.

Example 1:
Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz
Explanation: 
The characters 'f', 'i', 'o', 'q', 'r', 'u','z' 
are either present in A or B, but not in both.

Expected Time Complexity: O(M+N) where M and N are the sizes of A and B respectively.
Expected Auxiliary Space: O(M+N)
*/

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        String uncommon="";
        int i=0;
        while(i<A.length()){
            if(!B.contains(Character.toString(A.charAt(i)))){
                if(!uncommon.contains(Character.toString(A.charAt(i)))){
                    uncommon+=A.charAt(i);
                }
            }
            i++;
        }
        i=0;
        while(i<B.length()){
            if(!A.contains(Character.toString(B.charAt(i)))){
                if(!uncommon.contains(Character.toString(B.charAt(i)))){
                    uncommon+=B.charAt(i);
                }
            }
            i++;
        }
        if(uncommon==""){
            return "-1";
        }
        char a[] = uncommon.toCharArray();
        Arrays.sort(a);
        String str = new String(a); 
        return str;
    }
}
