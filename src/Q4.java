public class Q4
{
    public boolean contains(int[] arr, int rows, int columns, int number)
    {
        //判断是否为空
        if (arr.length < 0)
            return false;

        boolean found = false;

        if (rows > 0 && columns > 0)
        {
            int row = 0;
            int column = columns - 1;
            while(row < rows && column >= 0)
            {
                if (arr[row * columns + column] == number)
                {
                    found = true;
                    break;
                }
                else if (arr[row * columns + column] > number)
                    column--;
                else
                    row++;
            }
        }
        return found;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,8,9,2,4,9,12,4,7,10,13,6,8,11,15};

        System.out.println(new Q4().contains(arr,4,4,7));
    }

}
