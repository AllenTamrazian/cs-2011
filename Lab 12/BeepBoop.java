import java.util.Scanner;

public class BeepBoop
{
  public static void main(String[] args)
  {
    for(int number=1;number<=100;number++) //for loop for going through numbers
    {
      if(number%3==0)  //if the number is divisible by 3
      {
        System.out.print("Beep"); //say beep
      }
      if(number%5==0) //if the number is divisible by 5
      {
        System.out.print("Boop"); //say boop
      }
      if(number%3!=0 && number%5!=0)  //if he number is not divisible by 3 or 5
      {
      System.out.print(number);  //print the number
      }
      System.out.println(""); //create new line for formatting
    }
  }
}
