public class LinearSum
{
    public LinearSum()
    {}

    public int linearSum(int[] arr)
    {
        int sum = 0;
        int[] var5 = arr;
        int var4 = arr.length;

        for(int var3 = 0; var3 < var4; ++var3)
        {
            int value = var5[var3];
            sum += value;
        }
        return sum;
        }
        public void main(String[] args)
        {
            int[] arr = new int[]{2, 4, 6};
            System.out.println(linearSum(arr));
        }
}
