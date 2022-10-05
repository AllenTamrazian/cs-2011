import java.util.Scanner;

public class LiveBravelyAndBeautifully
{
  public static void main(String[] args)
  {
    boolean keepGoing=true;
    int sum=0;

    while (sum<20)
    {
      System.out.println("I will as live bravely and beautifully as I can");
      sum+=(int) (Math.random() * 10);
    }
    System.out.println("Sum is"+sum);




    // while (keepGoing){
    //   System.out.println("I will as live bravely and beautifully as I can");
    //   System.out.print("Do you want to see this phrase againt? (Y/N)");
    //   char seeAgain=input.nextCharAt(0);
    //   keepGoing=(seeAgain!='N' && seeAgain1='n');
    // }


    // while(keepGoing)
    // {
    //   System.out.println("I will as live bravely and beautifully as I can");
    //   keepGoing= Math.random()>0.1;
    // }
    // System.out.println("loop is done!");

    // Scanner input=new Scanner(System.in);
    // char seeAgain=;
    // do
    // {
    //   System.out.println("I will as live bravely and beautifully as I can");
    //   System.out.print("Do you want to see this phrase againt? (Y/N)");
    //   seeAgain=input.nextCharAt(0);
    // } while(seeAgain!='N' && seeAgain!='n');


    // int counter =0;
    // while(counter++<=5)//while(counter-->0) not while(counter-->=0) -> off by one error
    // {
    //   System.out.println("I will as live bravely and beautifully as I can");
    //   //counter++;  //increase counter by 1
    //   ++counter
    // }
    //System.out.println("loop is done!");
    // System.out.println("I will live bravely and beautifully");
    // System.out.println("I will live bravely and beautifully");
    // System.out.println("I will live bravely and beautifully");
    // System.out.println("I will live bravely and beautifully");
  }
}
