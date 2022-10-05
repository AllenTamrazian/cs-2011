/* Weronika Cwir
Jorge Arias
Allen Tamrazian
CS 2011
Sections 09 & 10
This program asks the user to enter what they want to echo. The program gets the
user's input and checks if the input is less than 3 characters and if the first
three characters are actually numbers.
We had trouble with checking if all of the characters in the string were
numbers.
*/
import java.util.Scanner;
public class Echo
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Say something: ");
    String somethingSaid = input.nextLine();

    /*Checks if the user inputted a string longer or equal to 3 chars*/
    if(somethingSaid.length()<3)
    {
      System.out.println("Please enter a string longer than 3");
    }

    /*Checks the 1st 3 chars in the user input to make sure its a string*/
    else if(!Character.isLetter(somethingSaid.charAt(somethingSaid.length()-3))
    && !Character.isLetter(somethingSaid.charAt(somethingSaid.length()-2)) &&
    !Character.isLetter(somethingSaid.charAt(somethingSaid.length()-1)))
    {
      System.out.println("Please enter a char string");
    }
    else
    {
      System.out.println(somethingSaid.substring(somethingSaid.length()-3,
      somethingSaid.length()).toUpperCase()); //print last 3 letters uppercase
      System.out.println(somethingSaid.substring(somethingSaid.length()-3,
      somethingSaid.length())); //print last 3 letters
      System.out.println(somethingSaid.substring(somethingSaid.length()-2,
      somethingSaid.length())); //print last 2 letters
      System.out.println(somethingSaid.substring(somethingSaid.length()-1,
      somethingSaid.length())); //print last letter
    }
  }
}
