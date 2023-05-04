/*
PROBLEM LINK IN EXTENDED DESCRIPTION (https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=false)

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints
A will consist at most 50 lower case english letters.

Sample Input
madam
Sample Output
Yes
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length();
        String result = "Yes";
        int i = 0,n=0;
        int j = A.length()-1;
        while(n<=len/2){
            if(A.charAt(i)==A.charAt(j)){
                i++;
                j--;
                n++;
                continue;
            }
            else{
                result = "No";
                break;
            }        
        }
        System.out.print(result);
    }
}
