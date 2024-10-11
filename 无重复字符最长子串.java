
import java.util.HashSet;
//滑动窗口习题一
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
    //定义右指针
    int right=-1;
    //定义窗口内无重复子串的最大长度,初始为0
    int ans=0;
    //用set集合来存储窗口内元素
        HashSet<Character>set=new HashSet<>();
    for(int i=0;i<s.length();++i)
    {
        //去掉上一个元素
        if(i!=0){
            set.remove(s.charAt(i-1));
        }

        //当无重复时向右扩大窗口
        while(right+1<s.length()&&!set.contains(s.charAt(right+1))){
            set.add(s.charAt(right+1));
            right++;
        }
        ans=Math.max(ans,right-i+1);

    }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)