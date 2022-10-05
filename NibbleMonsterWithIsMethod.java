/* William Podevin
 * Allen Tamrazian
 * CS 2011
 * Lecture Session 9 & Lab Section 10
 * Description: This program is just like the NibbleMonsterWithLoopWhileHappy
  but the loop continuation uses the new method isNibble to display the
  monster's response.
 * Problems: We didn't have any problems.
 */

import java.util.Scanner;

public class NibbleMonsterWithIsMethod {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Monster hungry :E ");
      boolean happy=true; //create boolean variable for monster happiness

  // the monster will be happy when given any nibble in the following ranges
  // (0-9), (A-F), (a-f)
  do{ //do while monster is happy
    System.out.print("Feed monster nibble :o ");
    char nibble = input.next().charAt(0);
    happy=isNibble(nibble);
    } while(happy==true);
  }
  public static boolean isNibble(char offering)
  {
    //if the character is acceptable
    if (offering >= '0' && offering <=  '9' ||
    (offering >= 'A' && offering <= 'F' ) ||
    (offering >= 'a' && offering <= 'f')) {
      System.out.println("mo4r f00d");
      //monster is happy and passes true to the do while loop
      return true;
    }
    //if the character is unacceptable
    else {
      System.out.println("Ewww! :o=" + offering);
      System.out.println("You tried to poison me!");
      System.out.println("Go away!");
      //monster is happy and passes true to the do while loop
      return false;
  }
}
}
