import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] x={12,53,44,45,56};
        int[] y={22}; //Arrays.copyOf(x,x.length);
        //比较两个数组的值是否完全相同
        //返回一个boolean类型值,如果两个数组相同 true ,否则false
        //boolean b = Arrays.equals(x, y);
        //System.out.println("b = " + b);//soutv
        //将数组元素按字典顺序比较，相同，返回0，如果前面比后面的小，返回负数
        //如果前面比后面的大，返回正数
        int i = Arrays.compare(y,x );
        System.out.println("i = " + i);
    }
}