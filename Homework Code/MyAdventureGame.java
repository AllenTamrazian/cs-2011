/*Code made by Allen Tamrazian
CS 2011
Section 9 and 10
Description: This program is an adventure game. It
asks the user what chances they get a good outcome and asks if they want to go
to the mall. The user chooses to go to the pet store or the ice cream shop.
Based on the probability, there is an outcome that is based on the chances they
input at the beginning.
Other comments: I had a really great time with this homework assignment.
Issues: I didn't have any issues with this program.
*/
import java.util.Scanner;
public class MyAdventureGame
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How nice do you want the world to be? ");
    System.out.println("Enter the percentage just as a number");
    int percentNice=input.nextInt();  //get odds from user
    System.out.println("Do you want to go to the mall? Type Y/N");  /*ask user
                                                    if they want to go to mall*/
    String yesOrNoMall="";
    yesOrNoMall = input.next(); //get if player says yes or no
    if(yesOrNoMall.equals("Y") || yesOrNoMall.equals("y"))/*if user wants to go
                                                              to the mall*/
    {
      System.out.println("You are at the mall. Where do you want to go?");
      System.out.println("Type [1] for the ice cream shop or type [2]"+
      " for the pet shop.");
      int storeAtMall=input.nextInt();
      //get which store user wants to go to
      if(storeAtMall==1)  //if the user chooses to go to the ice cream shop
      {
        System.out.println("You go to the ice cream shop.");
        if(Math.random()< (percentNice/100.0))  //nice outcome
        {
          System.out.println("The person in front of you paid for your "+
          "ice cream!");
          System.out.print("You go home after a fun day at the mall");
        }
        else    //mean outcome
        {
          System.out.println("You dropped your ice cream! You have to go buy "+
          "another, but you have no money!");
          System.out.println("You go home after a disappointing day"+
          " at the mall");
        }
      }
      else if(storeAtMall==2) //if user wants to go to pet shop
      {
        System.out.println("You go to the pet shop.");
        System.out.println("What kind of pets do you prefer? "+
        "Type [1] for dogs or type [2] for cats");
        int petNumber = input.nextInt();  //get if user prefers cats or dogs
        String petType="";
        if(petNumber==1)//if the user prefers dogs
        {
          petType="dog";
          System.out.println("You pet some "+petType+"s!");
          //tells user that they petted their preferred pet
        }
        else if(petNumber==2)//if the user prefers cats
        {
          petType="cat";
          System.out.println("You pet some "+petType+"s!");
          //tells user that they petted their preferred pet
        }
        else  //if user puts in unvalid input
        {
          System.out.println("That is not a valid option!");
        }
        if(Math.random()< (percentNice/100.0) && (petNumber==1 || petNumber==2))
        //nice outcome
        {
          System.out.println("The manager let you play with a "+petType+"!");
          System.out.print("You go home after a fun day at the mall");
        }
        if(Math.random()> (percentNice/100.0) && (petNumber==1 || petNumber==2))
        //mean outcome
        {
          System.out.println("You got crazy "+petType+" disease!");
          System.out.println("You go to the hosiptal.");
        }
      }
      else  //if user puts in unvalid input
      {
        System.out.println("That is not a valid option");
      }
    }
    else if(yesOrNoMall.equals("N") || yesOrNoMall.equals("n"))
    //user refuses to go to the mall
    {
      System.out.println("Too bad, too sad.");
    }
    else
    //if the user puts in unvalid input
    {
      System.out.println("That is not a valid value!");
    }
  }
}
