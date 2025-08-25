
import java.util.Arrays;

public class Sorting 
{
    public static void main(String args[])
    {
        int arr[]={1,4,5,7,3,2};
       /* 
       we can do in this process  for loop (or) we can do by using Array.sort(arr);
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int temp=0;
                if(arr[j]<arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
            */
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
    }
}