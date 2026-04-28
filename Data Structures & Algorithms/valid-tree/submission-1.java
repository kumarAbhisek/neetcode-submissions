class Solution {
    public boolean validTree(int n, int[][] edges) {
        Map <Integer ,List<Integer>> al = new HashMap<>();
        Set <Integer> visited = new HashSet<>();
        //al.clear();
        if(n==0) return true;
        if(n==1) return edges.length ==0;
        if(edges.length ==0) return false;
        for(int []edge:edges){
            int node1 = edge[0];
            int node2 = edge[1];
            al.putIfAbsent(node1,new ArrayList<>());
            al.putIfAbsent(node2,new ArrayList<>());
            al.get(node1).add(node2);
            al.get(node2).add(node1);

}
            if(!dfs(edges[0][0],visited,al,-1)){

return false;
            } 
            
        return visited.size() == n;
        
    }
    private boolean dfs(int node,Set<Integer> visited , Map <Integer ,List<Integer>> al,int previous){
        if(visited.contains(node)) return false;
        
        visited.add(node);

        for(int l :al.get(node)){
            System.out.println(l);
            if(l==previous)
            continue;
            if(!dfs(l,visited,al,node))
            return false;
        }
        return true;
    }
}
