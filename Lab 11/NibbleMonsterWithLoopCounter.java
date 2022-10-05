/* Sophia Liwag
 * Allen Tamrazian
 * CS 2011
 * Lecture Session 9 & Lab Section 10
 * Description: In this program, the user will be asked how many snack they have
   for the monster and depending on the number the user inputs, the program will
   run that specific number of times.
 * Problems: This problem didn't really give us any problems. It's just about
   getting the previous code and putting the if and else into a while loop
 */

import java.util.Scanner;

public class NibbleMonsterWithLoopCounter {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Monster hungry :E ");
      System.out.println("How many snacks do you have for the monster?");
      int numberOfSnacks=input.nextInt();
      int counter=0;

  // the monster will be happy when given any nibble in the following ranges
  // (0-9), (A-F), (a-f)
  while(counter<numberOfSnacks) //while loop that repeats as many times as user
                                //inputs
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
      counter++;  //update counter
  }
}
}
