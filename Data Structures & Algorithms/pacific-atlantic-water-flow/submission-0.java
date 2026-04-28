class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        Set<Integer> pac = new HashSet<>();
        Set<Integer> atl = new HashSet<>();
        for(int i =0;i<rows;i++){
            dfs(i,0,pac,heights[i][0],rows,cols,heights);
            dfs(i,cols-1,atl,heights[i][cols-1],rows,cols,heights);

        }
        for(int j =0;j<cols;j++){
            dfs(0,j,pac,heights[0][j],rows,cols,heights);
            dfs(rows-1,j,atl,heights[rows-1][j],rows,cols,heights);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int cord = i*cols+j;
                if(pac.contains(cord) && atl.contains(cord)){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }

    public void dfs(int r ,int c, Set<Integer> l,int visited ,int rows,int cols,int [][]heights){
       int cord =r*cols + c;
        if(r<0||c<0|| r>=rows || c>=cols || heights[r][c]<visited || l.contains(cord)){
            return;
        }
        l.add(cord);
        dfs(r+1,c,l,heights[r][c],rows,cols,heights);
        dfs(r,c+1,l,heights[r][c],rows,cols,heights);
        dfs(r-1,c,l,heights[r][c],rows,cols,heights);
        dfs(r,c-1,l,heights[r][c],rows,cols,heights);
    }
}
