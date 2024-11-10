import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals, new Comparator<int[]>() {
          @Override
          public int compare(int[] o1, int[] o2) {
              return o1[0]-o2[0];
          }
      });
      List<int[]> res = new ArrayList<>();
      for(int i=0;i<intervals.length;i++){
          int left = intervals[i][0];
          int right= intervals[i][1];
          if(res.size()==0||res.get(res.size()-1)[1]<left){
              res.add(new int[]{left,right});
          }
          else{
              res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],right);
          }
      }
      return res.toArray(new int[res.size()][]);

    }
}