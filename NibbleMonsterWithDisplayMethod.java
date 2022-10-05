/* Allen Tamrazian
 * William Podevin
 * CS 2011
 * Lecture Session 9 & Lab Section 10
 * Description: This program is just like the NibbleMonsterWithForLoop, but we
 use a new method displayResponse to display the monster's response.
 * Problems: We had some problems understanding how to pass arguments between 
  methods.
 */

import java.util.Scanner;

public class NibbleMonsterWithDisplayMethod {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Monster hungry :E ");
      System.out.println("How many snacks do you have for the monster?");
      int numberOfSnacks=input.nextInt();

  // the monster will be happy when given any nibble in the following ranges
  // (0-9), (A-F), (a-f)
  //for loop that repeats as many times as user inputs
  for(int counter=1;counter<=numberOfSnacks; counter++)
  {
    System.out.println("Feed monster nibble :o");
    char nibble = input.next().charAt(0);
    //call displayResponse method and pass on nibble variable
    displayResponse(nibble);
  }
}
  public static void displayResponse(char offering)
  {
    //if offering is betwen 0 and 9
    if (offering >= '0' && offering <=  '9') {
      System.out.println("mo4r f00d");
    }
    //if offering is betwen A and F
    else if (offering >= 'A' && offering <= 'F' ) {
      System.out.println("YUM!");
    }
    //if offering is betwen a and f
    else if (offering >= 'a' && offering <= 'f') {
      System.out.println("yum!");
    }
    //if offering is not acceptable
    else {
      System.out.println("Ewww! :o=" + offering);
    }
  }
}
