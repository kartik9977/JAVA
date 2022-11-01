import java.util.*;
class Array_sort

{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        int temp;
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("1. Sort in ascending order");
        System.out.println("2. Sort in descending order");
        int ch=sc.nextInt();
        switch(ch)
        {
          case 1:
           
          for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[j]<a[i])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The sorted array in ascending order is");
        for(int i=0; i<n; i++)
        {
        System.out.print(a[i]+" ");
        }   
        break;

        case 2:

        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[j]>a[i])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println("The sorted array in descending order is");
        for(int i=0; i<n; i++)
        {
        System.out.print(a[i]+" ");
        }   
        break;
          
        default: 
         System.out.println("Invalid choice");
        break;
        }
      
    }
}