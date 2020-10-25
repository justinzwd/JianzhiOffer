public class Q5
{

    /**
     * 将字符串中的所有空格都替换成"%20"
     * @param chars 输入数组
     * @param length  数组初始化长度
     */
    public void replaceBlank(char[] chars,int length)
    {
        int numOfBlank = 0;
        int originalLength = 0;

        int i = 0;
        while(chars[i] != '\0')
        {
            originalLength++;
            if (chars[i] == ' ')
                numOfBlank++;

            i++;
        }

        int newLength = originalLength + numOfBlank * 2;

        int indexOf = originalLength - 1;
        int indexOfNew = newLength - 1;

        while(indexOf >= 0 && indexOf < indexOfNew)
        {
            //第一次错误原因是把chars[indexOf] == ' ' 写成了 indexOf == ' '
            if (chars[indexOf] == ' ')
            {
                chars[indexOfNew--] = '0';
                chars[indexOfNew--] = '2';
                chars[indexOfNew--] = '%';
            }
            else
            {
                chars[indexOfNew--] = chars[indexOf];
            }

            indexOf--;
        }

    }

    public static void main(String[] args)
    {
        char[] chars = new char[20];
        String str = "We are happy.";      //空格在字符串中间
        //String str = "Wearehappy. ";     //空格在字符串最后
        //String str = "We  are.";         //连续多个空格
        //String str = " We are.";         //空格在字符串最前面
        //String str = "WeAreHappy.";      //没有空格
        for (int i = 0; i < str.length(); i++)
        {
            chars[i] = str.charAt(i);
        }
        System.out.println("处理之前：");
        for (int i = 0; i < chars.length; i++)
            System.out.print(chars[i] + " ");
        System.out.println();

        /**
         * 调用处理方法
         */
        new Q5().replaceBlank(chars,20);

        System.out.println("处理之后：");
        for (int i = 0; i < chars.length; i++)
            System.out.print(chars[i] + " ");

    }
}
