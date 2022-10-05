/* Allen Tamrazian
 *
 * CS2011
 * Section 09 and 10
 * Description:
 * Other comments:
 * The one difficulty that we had was 
 */
import java.util.Scanner; //import scanner
public class PizzasAndPeople
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
    System.out.print("How many slices per pizza? ");  //ask user for slices per pizza
    slicesPerPizza=input.nextInt(); //get number of pizzas from user
    System.out.print("How many people? "); //ask for amount of people
    numberOfPeople=input.nextInt(); //get number of people from user
    slicesLeft=(numberOfPizzas*slicesPerPizza)%numberOfPeople;  //calculate the number of slices left
    System.out.println("If you split all this pizza evenly among "+numberOfPeople+" you will have "+slicesLeft+" slices left over. "); //final statements
    System.out.println("Mmmm! Cold pizza...");
  }
}
