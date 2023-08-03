//PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution {

 

 public int[] shortestPath(int N,int M, int[][] e) {

  //Code here

  int a[]=new int[N];

  boolean vis[]=new boolean[N];

  a[0]=0;

  for(int i=0;i<M;i++){

      if(vis[e[i][0]]==true){ // if we have already visited it via source

          vis[e[i][1]]=true; // marking the the element true as it is connected to the source through its parent

         if(a[e[i][1]]==0) a[e[i][1]]=a[e[i][0]]+e[i][2]; // we are checking whether we have not modified the a[position] then new value is assigned 

         else a[e[i][1]]=Math.min(a[e[i][1]],a[e[i][0]]+e[i][2]); // if the a[position] has already been Modified before then we will choose the minimum value

      }else if(e[i][0]==0){ //if source is connected to a element

          vis[e[i][1]]=true;// it's connected to the source

          a[e[i][1]]=e[i][2]; //we assign the a[position] as the weight between the source and destination 

      }

  }

  for(int i=1;i<N;i++) if(a[i]==0) a[i]=-1; // we are checking if there is no connection with source whether directly or indirectly 

  return a;

 }

}
