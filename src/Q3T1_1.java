public class Q3T1_1
{
    public static boolean duplicate(int[] arr)
    {
        //判断数组是否为空
        if (arr.length < 0)
            return false;

        //判断数组元素是否非法
        for (int i = 0; i < arr.length; i++)
        {
            if (i < 0 || i > arr.length - 1)
                return false;
        }

        //判断是否有重复元素
        for (int i = 0; i < arr.length; i++)
        {
            while(arr[i] != i)
            {
                if (arr[i] == arr[arr[i]])
                {
                    System.out.println("重复的数字是 " + arr[i]);
                    return true;
                }

                //如果arr[i]和arr[arr[i]]不想等，则交换
                int temp = arr[i];
                arr[i] = arr[arr[i]];
                //这里的arr[temp]不能写成arr[arr[i]]
                //因为在上一步中，arr[i]的值已经改变了
                arr[temp] = temp;
             }
            //System.out.println("此时arr[" + i + "]=" + arr[i]);
        }

        return false;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,3,1,0,2,5,3};
        System.out.println(duplicate(arr));
    }
}
