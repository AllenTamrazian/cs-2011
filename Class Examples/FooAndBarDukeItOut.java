import java.util.Scanner;
public class FooAndBareDukeItOut
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an int and a double");
    int foo = input.nextInt();
    double bar = input.nextDouble();

    boolean isFooSmallerThanBar=false;

    /*if(foo<bar)
    {
      isFooSmallerThanBar=true;
    }
    /*else if(foo>bar)
    {
      isFooSmallerThanBar=false;
    }
    else(foo==bar)
    {
      isFooSmallerThanBar=false;
    }*/

    isFooSmallerThanBar=foo<bar;

    System.out.print("It is ");
    System.out.print(isFooSmallerThanBar);
    System.out.print(" that the first one of these is smaller");
    input.close();
  }
}
