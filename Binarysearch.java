public class Binarysearch{
    public static void main(String args[])
    {
        int i=0;
        int j=8;
        int arr[]={2,4,6,8,10};
        int x=8;
        int result=binarysearch(arr,i,j,x);
        if(result==-1)
        {
            System.out.println("element has not found:");
        }
        else{
            System.out.println("element has founded at an array:"+result);
        }
    } 
    static int binarysearch(int a[],int i,int j,int x)
    {
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(a[mid]==x)
            {
                return mid;
            }
            if (a[mid]<x)
            {
                 i=mid+1;
            }
            else if(a[mid]>x)
            {
                 j=mid-1;
            }
        }
        return-1;

    }
}