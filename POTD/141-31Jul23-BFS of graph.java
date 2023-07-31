//PROBLEM LINK IN EXTENDED DESCRIPTION

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> traversal = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int size = adj.size();
        boolean[] visited = new boolean[size];
        queue.add(0);
        visited[0] = true;
        while(!queue.isEmpty()){
            int pop = queue.poll();
            traversal.add(pop);
            for(int i = 0 ; i < adj.get(pop).size() ; i++){
                int current = adj.get(pop).get(i);
                if(!traversal.contains(current) && visited[current] != true){
                    queue.add(current);
                    visited[current] = true;
                }
            }
        }
        return traversal;
    }
}
