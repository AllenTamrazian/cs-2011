/* Sophia Liwag
 * Allen Tamrazian
 * CS 2011
 * Lecture Session 9 & Lab Section 10
 * Description: In this program, the nibble monster will keep asking the user
  for nibbles until the user enters 'Q' or 'q'. The 'Q' and 'q' will tell the
  monster that the user is out of snacks.
  Problems: We didn't have any problems with this code.
 */

 import java.util.Scanner;

 public class NibbleMonsterWithSentinelControlledLoop {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Monster hungry :E ");
       boolean quit=false; //create boolean variable for user quit
       System.out.println("Enter 'Q' when you run out of snacks.");
       
   // (0-9), (A-F), (a-f)
   do{ //do while user doesn't press 'q' or 'Q' to quit
       System.out.print("Feed moster nibble :o ");
       char nibble = input.next().charAt(0); //get user input
       if (nibble >= '0' && nibble <=  '9') {
         System.out.println("mo4r f00d");
         quit=false; //user doesn't want to quit
       }
       else if (nibble >= 'A' && nibble <= 'F' ) {  //for nibbles between A and F
         System.out.println("YUM!");
         quit=false; //user doesn't want to quit
       }
       else if (nibble >= 'a' && nibble <= 'f') {  //for nibbles between a and f
         System.out.println("yum!");
         quit=false; //user doesn't want to quit
       }
       else if(nibble=='q' || nibble=='Q')
       {
         quit=true; //user wants to quit
         System.out.print("Bye quitter.");
       }
       else {
         quit=false;  //user doesn't want to quit
         System.out.println("Ewww! :o=" + nibble);
       }
     } while(quit==false);
   }
 }
