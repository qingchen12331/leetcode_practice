class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char []crr1=s.toCharArray();
        char []crr2=p.toCharArray();
        int num=0;
        for(char c:crr2){
            num+=c-'a';
        }
        int right=0;
        int left=0;
        int ans=0;
        List<Integer> list=new ArrayList<>();
        while(right<crr1.length-1){
            ans+=crr1[right]-'a';
            if(ans==num){
                list.add(left);
                left++;
                ans=0;
            }
            if(ans<num){
                right++;
                ans+=crr1[right]-'a';
            }
            if(ans>num&&left!=0){
                left++;
                ans-=crr1[left-1]-'a';
            }
        }
        return list;




    }
}
//上面的代码是初次尝试失败的代码





//滑动窗口思路:
// 根据题目要求，我们需要在字符串 s 寻找字符串 p 的异位词。因为字符串 p 的异位词的长度一定与字符串 p 的长度相同，
// 所以我们可以在字符串 s 中构造一个长度为与字符串 p 的长度相同的滑动窗口，并在滑动中维护窗口中每种字母的数量；
// 当窗口中每种字母的数量与字符串 p 中每种字母的数量相同时，则说明当前窗口为字符串 p 的异位词
import java.util.ArrayList;
import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer>res=new ArrayList<>();
       int slen=s.length();
       int plen=p.length();
       int []srr=new int[26];
       int []prr=new int[26];
       if(slen<plen){
           return new ArrayList<Integer>();
       }
       for(int i=0;i<plen;i++){
           srr[s.charAt(i)-'a']++;
           prr[p.charAt(i)-'a']++;
       }
       if(Arrays.equals(srr,prr)){
           res.add(0);

       }
       for(int i=0;i<slen-plen;i++){
           srr[s.charAt(i)-'a']--;
           srr[s.charAt(i+plen)-'a']++;
           if(Arrays.equals(srr,prr)){
               res.add(i+1);
           }
       }
       return res;




    }
}
//leetcode submit region end(Prohibit modification and deletion)