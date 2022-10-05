/* Weronika Cwir
Jorge Arias
Allen Tamrazian
CS 2011
Sections 09 & 10
This program asks the user to enter a random set of 4 characters. If program
also lets the user know if the user's input is exactly equal to the generated
string, has the first letter lowercase instead of uppercase, or typed the whole
string wrong.
We had trouble with checking if the first letter of the user's input was just
the first letter, but lowercase.
*/
import java.util.Scanner;

public class TypingTutor
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);

    /*Randomply generates a letter to make up a 4 letter phrase*/
    char ch1 = (char)('A' + (Math.random() * ('Z' - 'A' + 1)));
    char ch2 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
    char ch3 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
    char ch4 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
    String word = "" + ch1 + ch2 + ch3 + ch4;

    /*prints out the word the user needs to input back*/
    System.out.println("Type in the following: \n"+word);
    String answer = input.nextLine();

    if(answer.equals(word)) //if the answer matches exactly what is typed
    {
      System.out.println("Correct!");
    }
    else if(answer.equals(word.toLowerCase())) //if the first letter is the same but
                                          //lowercase
    {
      System.out.println("Watch the case!");
    }
    else  //if the whole phrase is wrong
    {
      System.out.println("Wrong!");
    }

  }
}
