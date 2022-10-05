/* Allen Tamrazian
 * CS 2011
 * Lecture Session 9 & Lab Section 10
 * Description: This program asks the user how many snacks they have, asks the
 user to input snacks, and then make a salad from that. If the snack is
 disgusting, the snack isn't put in the salad. After 3 snacks are made into a
 salad the program prints out the salad. At the end of the program, the program
 tells the user how many salads they made.
 * Problems: I didn't have any problems with this code
 */

import java.util.Scanner;

public class NibbleMonsterMakesSalads {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Monster hungry :E ");
      System.out.println("How many snacks do you have for the monster?");
      int numberOfSnacks=input.nextInt();
      System.out.println("If they are all nibbles, I'll make "+numberOfSnacks/3+
      " salads.");
      int snacksInSalad=0;  //variable counting snacks in a salad
      String salad="";  //string for combining characters into salad
      int amountOfSalads=0; //create a variable counting the salads made

  // the monster will be happy when given any nibble in the following ranges
  // (0-9), (A-F), (a-f)
  for(int counter=1;counter<=numberOfSnacks; counter++) //for loop that repeats
                                                  // as many times as userinputs
  {
    System.out.println("Feed monster nibble :o");
    char nibble = input.next().charAt(0);
      if (nibble >= '0' && nibble <=  '9') {
        System.out.println("mo4r f00d");
        snacksInSalad++;
        salad=salad+nibble;
      }
      else if (nibble >= 'A' && nibble <= 'F' ) {
        System.out.println("YUM!");
        snacksInSalad++;
        salad=salad+nibble;
      }
      else if (nibble >= 'a' && nibble <= 'f') {
        System.out.println("yum!");
        snacksInSalad++;
        salad=salad+nibble;
      }
      else {
        System.out.println("Ewww! :o=" + nibble);
        System.out.println("We are not using this in the salad!");
                                              // is not a nibble
      }
      if(salad.length()==3) //when one salad is complete
      {
      System.out.println();
      System.out.println("<3 <3 <3 <3 <3 <3 Salad Time <3 <3 <3 <3 <3 <3 <3 ");
      System.out.println("                   "+salad);
      System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 ");
      System.out.println();
      amountOfSalads++; //increase the amount of salads made
      salad=""; //clear the salad variable
      }
  }
  System.out.print("We made "+amountOfSalads+" salads together.");
}
}
