//PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code hereint shortestDistance(int N, int M, int A[][], int X, int Y) {
        int [][] vis = new int[N][M];
        if(A[0][0] == 0){return -1;}
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,0});
        vis[0][0] = 1;
        
        while(!q.isEmpty()){
            int temp[] = q.poll();
            int i = temp[0], j = temp[1], dist = temp[2];
            
            if(i == X && j == Y){return dist;}
            
            if(i+1 < N && vis[i+1][j] == 0 && A[i+1][j] == 1){q.add(new int[]{i+1,j,dist+1}); vis[i+1][j] = 1;}
            if(j+1 < M && vis[i][j+1] == 0 && A[i][j+1] == 1){q.add(new int[]{i,j+1,dist+1}); vis[i][j+1] = 1;}
            if(i-1 >= 0 && vis[i-1][j] == 0 && A[i-1][j] == 1){q.add(new int[]{i-1,j,dist+1}); vis[i-1][j] = 1;}
            if(j-1 >= 0 && vis[i][j-1] == 0 && A[i][j-1] == 1){q.add(new int[]{i,j-1,dist+1}); vis[i][j-1] = 1;}

        }
        return -1; 
    }
};
