/* William Podevin
 * Allen Tamrazian
 * CS 2011
 * Lecture Session 9 & Lab Section 10
 * Description: This program is just like the NibbleMonsterWithLoopWhileHappy
  but the loop continuation uses the new method isNibble to display the
  monster's response and uses the isNibble method for the monster to continue
  asking for nibbles.
 * Problems:
 */

import java.util.Scanner;

public class NibbleMonsterWithDisplayAndIsMethods {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    char nibble;
    System.out.println("Monster hungry :E ");

    do{ //do while monster is happy
      System.out.print("Feed monster nibble :o ");
      nibble = input.next().charAt(0);
      displayResponse(nibble);
    } while(isNibble(nibble));
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
  public static boolean isNibble(char offering)
  {
    //boolean statement if the character is acceptable
    if (offering >= '0' && offering <=  '9' ||
    (offering >= 'A' && offering <= 'F' ) ||
    (offering >= 'a' && offering <= 'f')) {
      return true; //monster is happy and passes true to to while loop
    }
    //boolean statement if the character is unacceptable
    else {
       return false;
       //monster is mad and passes false to to while loop
  }
  }
}
