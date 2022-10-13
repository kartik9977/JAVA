import java.util.*;
class Table
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        System.out.println("The table of "+n+" is:");

        for(int i=1; i<=10; i++)
        { 
            System.out.println(n+"*"+i+"="+(n*i));           
        }
    }
}