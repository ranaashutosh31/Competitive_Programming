/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
Sample Input 1
anagramm
marganaa
Sample Output 1
Not Anagrams

Sample Input 2
Hello
hello
Sample Output 2
Anagrams
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int m=a.length(),n=b.length();
        String ans = "Anagrams";
        String c = a.toLowerCase();
        String d = b.toLowerCase();
        char []arr = c.toCharArray();
        char []brr = d.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        if(m!=n){
            ans="Not Anagrams";
        }
        else{
            if(Arrays.equals(arr,brr)){
                ans = "Anagrams";
            }
            else{
                ans="Not Anagrams";
            }
        }
        System.out.print(ans);
    }
}
