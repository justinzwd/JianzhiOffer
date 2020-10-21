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
        for (int i=0;i<arr.length;i++)
        {
            if (!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else
            {
                map.replace(arr[i],map.get(arr[i]),(int)(map.get(arr[i]))+1);
            }
        }

        for (int i=0;i<arr.length;i++)
        {
            if ((int)map.get(arr[i]) > 1)
            {
                //返回第一个重复的元素
                return arr[i];
            }
        }

        //如果没有重复的元素，就返回-1
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {4,4,3,0,1,2,3};
        System.out.println(duplicate(arr));
    }


}
