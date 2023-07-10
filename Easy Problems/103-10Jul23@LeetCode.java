/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen=s.length(),tLen=t.length();
        int i=sLen-1,j=tLen-1;
        if(i!=j) return false;
        char[] S=s.toCharArray();
        char[] T=t.toCharArray();
        Arrays.sort(S); Arrays.sort(T);
        for(;i>=0;i--){
            if(S[i]!=T[i]) return false;
        }
        return true;
    }
}
