/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.

*/

HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<S.length();i++){
            if(!map.containsKey(S.charAt(i))){
                map.put(S.charAt(i), 1);
            }
            else{
                int val = map.get(S.charAt(i));
                map.put(S.charAt(i), val+1);
            }
        }
        for(char c: S.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }
        return '$';
