/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a binary matrix your task is to find all unique rows of the given matrix in the order of their appearance in the matrix.

Example 1:
Input:
row = 3, col = 4 
M[][] = {{1 1 0 1},{1 0 0 1},{1 1 0 1}}
Output: $1 1 0 1 $1 0 0 1 $
Explanation: Above the matrix of size 3x4
looks like
1 1 0 1
1 0 0 1
1 1 0 1
The two unique rows are R1: {1 1 0 1} and R2: {1 0 0 1}. 
As R1 first appeared at row-0 and R2 appeared at row-1, in the resulting list, R1 is kept before R2.
*/

class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<r;i++){
            String res="";
            for(int j=0;j<c;j++){
                if(a[i][j]==0){
                    res+='0';
                }
                else{
                    res+='1';
                }
            }
            if(map.containsKey(res)){
                int val = map.get(res);
                val+=1;
                map.put(res,val);
            }
            else{
                map.put(res,1);
            }
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<r; i++){
            String res="";
            for(int j=0; j<c; j++){
                if(a[i][j]==0){
                    res+='0';
                }
                else{
                    res+='1';
                }
            }
            if(map.containsKey(res)){
                ArrayList<Integer> uniqueList = new ArrayList<>();
                for(int k=0; k<res.length();k++){
                    if(res.charAt(k)=='0'){
                        uniqueList.add(0);
                    }
                    else{
                        uniqueList.add(1);
                    }
                }
                    list.add(uniqueList);
                    map.remove(res);
            }    
        }
        return list;
    }
}
