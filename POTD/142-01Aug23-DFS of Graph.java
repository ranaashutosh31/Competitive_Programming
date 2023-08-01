//PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution {
    
    public static boolean visited[];
    public static ArrayList<Integer> result;
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        visited = new boolean[V];
        result = new ArrayList<>();
        visited[0] = true;
        result.add(0);
 
        Iterator<Integer> i = adj.get(0).listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                dfs(n,adj);
            }
        }
        return result;
    }
    
    public void dfs(int x,ArrayList<ArrayList<Integer>> adj){
        visited[x] = true;
        result.add(x);
        Iterator<Integer> i = adj.get(x).listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                dfs(n,adj);
            }
        }
    }
}
