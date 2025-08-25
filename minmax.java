public class minmax
{
    public static void main(String args[])
    {
        int arr[]={3,4,5,6,7,8,9};
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
            min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}