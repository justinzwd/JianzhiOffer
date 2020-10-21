public class Q3T2
{
    //这种方法时间花销大，以时间换空间
    //而且这种方法不能找出所有重复数字
    public static int duplicate(int[] arr)
    {
        //判断数组是否为空
        if (arr.length < 0)
            return -1;

        //检查输入是否合法
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < 1 || arr[i] > arr.length - 1)
                return -1;
        }

        int start = 1;
        int end = arr.length - 1;

        while(end >= start)
        {
            int middle = start + (end - start) / 2;
            int count = countRange(arr,start,middle);
            
            //如果其中一半数字出现的次数超过区间范围，说明此区间就存在重复的数字
            if (count > (middle - start + 1))
                end = middle;
            else
                start = middle + 1;

            //临界条件，end == start
            //如果这时出现重复数字，那就没有了，停止判断
            if (end == start)
            {
                if (count > 1)
                    return start;
                else
                    break;
            }
        }

        return -1;
    }

    public static int countRange(int[] arr, int start, int end)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= start && arr[i] <= end)
                count++;
        }

        return count;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,3,5,4,3,2,6,7};
        System.out.println(duplicate(arr));     //输出3
    }

}
