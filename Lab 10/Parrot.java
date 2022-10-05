/* Weronika Cwir
Jorge Arias
Allen Tamrazian
CS 2011
Sections 09 & 10
This program asks the user to enter anything. Then the "parrot" repeats it
back mockingly.
We didn't have any problems.
*/

import java.util.Scanner;

public class Parrot
{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);
  /*asks user for something*/
  System.out.print("Say something: ");
  String parrotRepeats = input.nextLine();  //assign input to string
                                            //parrotRepeats
  /*prints out the user in put just with an ! at the end*/
  System.out.println(parrotRepeats+"!");

  input.close();  //close input
  }
}
