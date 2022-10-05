/* Allen Tamrazian
 * Mark Familara
 * CS2011
 * Section 09 and 10
 * Description: This is the PizzaAndPeopleValidaiton problem, but with input validation using if statements and the System.exit() function
 * Other comments: We decided to use the second method of validation described to us in class on Tuesday.
 * We didn't really have any difficulty with this problem since we understood what was explained in class on Tuesday.
 */
import java.util.Scanner; //import scanner
public class PizzasAndPeopleValidation
{
  public static void main(String args[])
  {
    int numberOfPizzas;
    int slicesPerPizza;
    int numberOfPeople;
    int slicesLeft;
    Scanner input = new Scanner(System.in); //create scanner

    System.out.print("How many pizzas? ");  //ask user for amount of pizzas
    numberOfPizzas=input.nextInt(); //get number of pizzas from user
    if (numberOfPizzas <= 0) {
      //checks the input for the number of pizzas if it is less than or equal to 0
      System.out.println("Not a real number for the number of pizzas.");
      System.exit(1);
    }
    System.out.print("How many slices per pizza? ");  //ask user for slices per pizza
    slicesPerPizza=input.nextInt(); //get number of pizzas from user
    if (slicesPerPizza <= 0) {
      //checks the input for the number of slices if it is less than or equal to 0
      System.out.println("Not a real number for slices per pizza.");
      System.exit(2);
    }
    System.out.print("How many people? "); //ask for amount of people
    numberOfPeople=input.nextInt(); //get number of people from user
    if (numberOfPeople <= 0) {
      //checks the input for number of peole if it is less than or equal to 0
      System.out.println("Not a real number for the number of people.");
      System.exit(3);
    }
    slicesLeft=(numberOfPizzas*slicesPerPizza)%numberOfPeople;  //calculate the number of slices left
    System.out.println("If you split all this pizza evenly among "+numberOfPeople+" you will have "+slicesLeft+" slices left over. "); //final statements
    System.out.println("Mmmm! Cold pizza...");
  }
}
