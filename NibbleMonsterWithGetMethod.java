/* Allen Tamrazian
 * William Podevin
 * CS 2011
 * Lecture Session 9 & Lab Section 10
 * Description: This program is just like the NibbleMonsterWithForLoop, but we
 use a new method getResponse to return the monster's response in order to print
 it out.
 * Problems: We didn't have any problems.
 */

import java.util.Scanner;

public class NibbleMonsterWithGetMethod {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Monster hungry :E ");
      System.out.println("How many snacks do you have for the monster?");
      int numberOfSnacks=input.nextInt();

  // the monster will be happy when given any nibble in the following ranges
  // (0-9), (A-F), (a-f)
  //for loop that repeats as many times as userinputs
  for(int counter=1;counter<=numberOfSnacks; counter++)
  {
    System.out.println("Feed monster nibble :o");
    //get first character and assign it to nibble
    char nibble = input.next().charAt(0);
    //print the output from the getResponse method
    System.out.println(getResponse(nibble));
  }
}
  public static String getResponse(char offering)
  {
    //if the character is between 0 and 9
    if (offering >= '0' && offering <=  '9') {
      return "mo4r f00d";
    }
    //if the character is between A and F
    else if (offering >= 'A' && offering <= 'F' ) {
      return "YUM!";
    }
    //if the character is between a and f
    else if (offering >= 'a' && offering <= 'f') {
      return "yum!";
    }
    //if the character is disgusting
    else {
       return ("Ewww! :o=" + offering); // the monster will be unhappy
                                               // when fed any character that                                      // is not a nibble
    }
  }
}
