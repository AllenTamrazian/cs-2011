/* Sophia Liwag
 * Allen Tamrazian
 * CS 2011
 * Lecture Session 9 & Lab Section 10
 * Description: In this program, the user will be asked to feed the monster
   until the monster's hunger level reaches zero. The monster's hunger level can
   vary from [0,500]. Each time the user feeds the monster a nibble, hunger
   decreases by the decimal value of the character. When the user feeds the
   monster a nible that is not an appropriate character, the hunger increases by
   the decimal value of the character.
 * Problems: We didn't have any problems with this code.
 */

import java.util.Scanner;

public class NibbleMonsterWithLoopTillFull {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      System.out.println("Monster hungry :E ");
      System.out.print("Feed moster nibble :o ");
      int hungerLevel = (int)(Math.random() * 501); //generate random number
                                                    //between 0 and 500
      System.out.println("H U N G E R: " + hungerLevel);
  // the monster will be happy when given any nibble in the following ranges
  // (0-9), (A-F), (a-f)
    while(hungerLevel > 0) {
      System.out.println("H U N G E R: " + hungerLevel);  //show hunger level
      System.out.print("Feed moster nibble :o ");
      char nibble = input.next().charAt(0); //get character from input
      int characterHungerValue=(int)(nibble); //get the integer value of nibble
                                              //character

      if (nibble >= '0' && nibble <=  '9') {  //if character is a number
        System.out.println("mo4r f00d");
        hungerLevel=hungerLevel-characterHungerValue; //lower hunger
      }
      else if (nibble >= 'A' && nibble <= 'F' ) { //if character  betwen A and F
        System.out.println("YUM!");
        hungerLevel=hungerLevel-characterHungerValue; //lower hunger
      }
      else if (nibble >= 'a' && nibble <= 'f') { //if character  betwen a and f
        System.out.println("yum!");
        hungerLevel=hungerLevel-characterHungerValue; //lower hunger
      }
      else {
        System.out.println("Ewww! :o=" + nibble);
        hungerLevel=hungerLevel+characterHungerValue; //increase hunger
      }
    }
    System.out.println("Monster is full!");
    System.out.println("You may go.");
  }
}
