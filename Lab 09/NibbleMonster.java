//Code made by Allen Tamrazian and Anthony Padilla
//CS 2011
// Section 9 and 10
//Description: This program takes the input from the user and then feeds it to
// the Nibble Monster and they tell us if the first character of the input is
//great or disgusting.
//Other comments: This coding problem was very unique and it had character.
//We had issues with getting the code to compile for inputs of A,F,a, and f. We
//also had problems with the code for the character being a number
import java.util.Scanner;
public class NibbleMonster
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Feed monster nibble :o  ");
    char nibbleFood=input.next().charAt(0);   //get first letter of input
    if(nibbleFood>='0' && nibbleFood<='9')  //if the input is between 0 and 9
    {
       System.out.println("m04r fOOd!");
    }
    else if (nibbleFood >= 'a' && nibbleFood <= 'f')  //if the input is between
                                                      //or equal to a and f
       System.out.println("yum!");
    else if (nibbleFood >= 'A' && nibbleFood<='F')  //if the input is between
                                                      //or equal to A and F
      System.out.println("YUM!");
    else  //any other input
      System.out.print("This is not food.");
      }
    }
