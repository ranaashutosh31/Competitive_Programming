/*
PROBLEM LINK IN DESCRIPTION
Given a sentence in the form of a string in uppercase, convert it into its equivalent mobile numeric keypad sequence. Please note there might be spaces in between the words in a sentence and we can print spaces by pressing 0.

Example 1:
Input:
S = "GFG"
Output: 43334
Explanation: For 'G' press '4' one time.
For 'F' press '3' three times.
Expected Time Complexity: O(Length of String)
Expected Auxiliary Space: O(Length of String)
*/

class Solution 
{ 
    String printSequence(String S) 
    { 
        // code here
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='A'){
                System.out.print("2");
            }
            if(S.charAt(i)=='B'){
                System.out.print("22");
            }
            if(S.charAt(i)=='C'){
                System.out.print("222");
            }
            if(S.charAt(i)=='D'){
                System.out.print("3");
            }
            if(S.charAt(i)=='E'){
                System.out.print("33");
            }
            if(S.charAt(i)=='F'){
                System.out.print("333");
            }
            if(S.charAt(i)=='G'){
                System.out.print("4");
            }
            if(S.charAt(i)=='H'){
                System.out.print("44");
            }
            if(S.charAt(i)=='I'){
                System.out.print("444");
            }
            if(S.charAt(i)=='J'){
                System.out.print("5");
            }
            if(S.charAt(i)=='K'){
                System.out.print("55");
            }
            if(S.charAt(i)=='L'){
                System.out.print("555");
            }
            if(S.charAt(i)=='M'){
                System.out.print("6");
            }
            if(S.charAt(i)=='N'){
                System.out.print("66");
            }
            if(S.charAt(i)=='O'){
                System.out.print("666");
            }
            if(S.charAt(i)=='P'){
                System.out.print("7");
            }
            if(S.charAt(i)=='Q'){
                System.out.print("77");
            }
            if(S.charAt(i)=='R'){
                System.out.print("777");
            }
            if(S.charAt(i)=='S'){
                System.out.print("7777");
            }
            if(S.charAt(i)=='T'){
                System.out.print("8");
            }
            if(S.charAt(i)=='U'){
                System.out.print("88");
            }
            if(S.charAt(i)=='V'){
                System.out.print("888");
            }
            if(S.charAt(i)=='W'){
                System.out.print("9");
            }
            if(S.charAt(i)=='X'){
                System.out.print("99");
            }
            if(S.charAt(i)=='Y'){
                System.out.print("999");
            }
            if(S.charAt(i)=='Z'){
                System.out.print("9999");
            }
            if(S.charAt(i)==' '){
                System.out.print("0");
            }
            
        }
        return "";
    }
}
