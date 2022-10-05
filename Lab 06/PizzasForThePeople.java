/* Allen Tamrazian
 * Andy Boong
 * CS2011
 * Section 09 and 10
 * Description: The purpose of this class is to teach the basics of Java.
 * Other comments: This problem was similar to the problem that we discussed in class on Tuesday
 * The one difficulty that we had was getting the documents shared with Teletype since we had to find a way to get the link to the other person.
 */
import java.util.Scanner; //import scanner
public class PizzasForThePeople
{
  public static void main(String args[])
  {
    int numberOfPizzas;
    int slicesPerPizza;
    int numberOfPeople;
    int slicesLeftAfterServing;
    int wholePizzas;
    int slicesLeftAfterMakingPizza;
    Scanner input = new Scanner(System.in); //create scanner
    System.out.print("How many pizzas? ");  //ask user for amount of pizzas
    numberOfPizzas=input.nextInt(); //get number of pizzas from user
    System.out.print("How many slices per pizza? ");  //ask user for slices per pizza
    slicesPerPizza=input.nextInt(); //get number of pizzas from user
    System.out.print("How many people? "); //ask for amount of people
    numberOfPeople=input.nextInt(); //get number of people from user
    slicesLeftAfterServing=(numberOfPizzas*slicesPerPizza)%numberOfPeople;  //calculate the number of slices left
    wholePizzas=slicesLeftAfterServing/slicesPerPizza;    //pizzas you can make with remaining slices
    slicesLeftAfterMakingPizza=slicesLeftAfterServing%slicesPerPizza; //slices left after making a whole pizza
    System.out.println("If you split all this pizza evenly among "+numberOfPeople+" you will have "+wholePizzas+" whole pizzas and " + slicesLeftAfterMakingPizza +" slices left over. "); //final statements
    System.out.println("Mmmm! Cold pizza...");


  }
}
