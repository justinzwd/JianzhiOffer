import java.util.HashMap;
import java.util.Map;

public class Q3T1
{

    /**
     * 返回数组arr中重复的数字
     * @param arr  输入数组，其中含有重复的数字
     * @return 重复的数字
     * 时间复杂度是O(n)，可以进一步优化
     */
    public static int duplicate(int[] arr)
    {
        Map map = new HashMap<Integer, Integer>();

        //在代码1.0版本中，没有对空数组或者不合法的值进行验证
        if (arr.length < 0)
        {
            return -1;
        }

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] < 0 || arr[i] >= arr.length)
            {
                return -1;
            }
        }

        for (int i=0;i<arr.length;i++)
        {
            //如果map里面不包含此元素，就添加进去
            if (!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            //如果map中已经包含了此元素，就说明存在重复数字，直接返回即可
            else
            {
                return arr[i];
            }
        }

        //如果没有重复的元素，就返回-1
        return -1;
    }

    public static void main(String[] args)
    {
        //int[] arr = {5,1,0,-2,1,2,3};
        //int[] arr = {5,1,0,7,1,2,3};
        //int[] arr = {5,1,0,1,2,3};
        int[] arr = {5,1,0,0,2,3};
        System.out.println(duplicate(arr));
    }


}
