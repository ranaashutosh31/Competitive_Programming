// PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution {
    public int firstUniqChar(String s) {
       char[] arr = s.toCharArray();
       if(arr.length==1) return 0;
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
               if(arr[i]==arr[j] && i!=j) break;
               if(j==arr.length-1) return i;
           }
       }
       return -1;
    }
}
