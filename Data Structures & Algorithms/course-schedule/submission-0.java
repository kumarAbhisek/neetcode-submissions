class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> premap = new HashMap<>();
        Set<Integer> visiting = new HashSet<>();
        for(int i=0;i<numCourses;i++){
            premap.put(i,new ArrayList<>());
        }
        for(int [] pair:prerequisites) {
            premap.get(pair[0]).add(pair[1]);
        }

        for(int c=0;c<numCourses;c++){
            if(!dfs(c,premap,visiting)){
                return false;
            }
        }
        return true;
    }
    public boolean dfs(int c , Map<Integer,List<Integer>> premap , Set<Integer> visiting){
        if(premap.get(c).isEmpty()){
            return true;
        }
        if(visiting.contains(c)){
            return false;
        }
        visiting.add(c);

        for(int pre : premap.get(c)){
            if(!dfs(pre,premap,visiting)){
                return false;
            }
        }
        visiting.remove(c);
        premap.put(c,new ArrayList<>());
        return true;

    }
}
