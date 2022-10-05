/* Allen Tamrazian
 * CS 2011
 * Lecture Session 9 & Lab Section 10
 * Description: This program gets asks the user how many snacks the user has and
 then gives a response basaed on what the user inputs. This time, I used a for
 loop.
 * Problems: I didn't have any problems.
 */

import java.util.Scanner;

public class NibbleMonsterWithForLoop {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Monster hungry :E ");
      System.out.println("How many snacks do you have for the monster?");
      int numberOfSnacks=input.nextInt();

  // the monster will be happy when given any nibble in the following ranges
  // (0-9), (A-F), (a-f)
  for(int counter=1;counter<=numberOfSnacks; counter++) //for loop that repeats
                                                  // as many times as userinputs
  {
    System.out.println("Feed monster nibble :o");
    char nibble = input.next().charAt(0);
      if (nibble >= '0' && nibble <=  '9') {
        System.out.println("mo4r f00d");
      }
      else if (nibble >= 'A' && nibble <= 'F' ) {
        System.out.println("YUM!");
      }
      else if (nibble >= 'a' && nibble <= 'f') {
        System.out.println("yum!");
      }
      else {
        System.out.println("Ewww! :o=" + nibble); // the monster will be unhappy
                                                 // when fed any character that                                      // is not a nibble
      }
  }
}
}
