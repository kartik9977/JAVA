import java.util.*;
import java.lang.String;
class Book
{
    int book_no;
    int book_price;
    String book_title;
    int cost;
    int n;
    Scanner sc=new Scanner(System.in);

    public void input()
    {
      System.out.println("Enter the  Title Book:");
      book_title=sc.nextLine();
      System.out.println("Enter the no. of Book:");
      book_no=sc.nextInt();
      System.out.println("Enter the price of Book:");
      book_price=sc.nextInt();
    }
    public void purchase()
    {
        System.out.println("Enter the no. of copies:");
        n=sc.nextInt();
        cost=n*book_price;
        System.out.println("The total cost of books is :"+cost);

    }
}
class Main
{
    public static void main(String a[])
    {
        Book obj=new Book();
        obj.input();
        obj.purchase();
    }

}