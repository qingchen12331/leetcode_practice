import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][]visited=new int[rows][cols];
        int[][]dir=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
         List<Integer> list=new ArrayList<>();
         int total=rows*cols;
         int row=0,col=0;
         int dirIdx=0;
         for(int i=0;i<total;i++){
             list.add(matrix[row][col]);
             visited[row][col]=1;
             int nextRow=row+dir[dirIdx][0];
             int nextCol=col+dir[dirIdx][1];
             if(nextRow<0||nextRow>=rows||nextCol<0||nextCol>=cols||visited[nextRow][nextCol]==1){
                 dirIdx=(dirIdx+1)%4;
                 
             }
             row=row+dir[dirIdx][0];
             col=col+dir[dirIdx][1];
         }
         return list;
     }

    }