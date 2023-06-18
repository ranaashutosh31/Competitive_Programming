/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Input Format
The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.
Output Format
There are three lines of output: 
For the first line, sum the lengths of A and B. 
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead. 
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
Sample Input 0
hello
java
Sample Output 0
9
No
Hello Java
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a = A.length();
        int b = B.length();
        System.out.println(a+b);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String C = A.substring(0,1);
        String D = B.substring(0,1);
        System.out.print(C.toUpperCase()+A.substring(1) +" "+ D.toUpperCase()+B.substring(1));
    }
}
