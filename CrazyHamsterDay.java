/* Sophia Liwag
   William Podevin
   Allen Tamrazian
   CS 2011
   Lecture Session 9 & Lab Section 10
   Description: This program is our final project. It is a combination of our
   ideas for the adventure game homework assignment. This program follows a
   young hamster, who is a criminal and is robbing multiple stores in a mall.
   The player is playing as the hamster and must compelete multiple minigames in
   order to complete the game. It's a very fun and hilarious adventure.
   Problems: Two problems that we had with this project was making the code
   not go over the line on the right and making the text easy to read as
   compared to having the terminal throw lots of text at the player.
*/

import java.util.Scanner;
import java.util.Arrays;

public class CrazyHamsterDay
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    //code for -help option
    if(args.length != 0 && args[0].equals("-help")) {
      displayHelp();
    }
    //The introduction to the story behind this project.
    else{
    type("You are a mischevious little hamster named Hamson" +
    " whose up to no good. As a notorious theif throughout the city of" +
    " Hamsterdelphia the cops are hot on your hamster tail...You've decided" +
    " to lay low by hiding out at the local mall...the last place the cops" +
    " would look for a high end theif...You arrive at busy mall amid the hustle"
    + " and bustle of daily shoppers. You told yourself you were gonna lay low "
    + "and off the radar of the police but after noticing all the shops and" +
    " people a sudden itch comes over you...maybe you won't lay low after" +
    " all...maybe you will get up to some of your old tricks instead...");
    //ask player if they want to go through with the heist
    System.out.println();
    System.out.println("Do you want to go through with the heist? Type Y/N");
    String yesOrNoMall="";
    yesOrNoMall = input.next(); //get if player says yes or no
    if(yesOrNoMall.equals("Y") || yesOrNoMall.equals("y"))
    {
      //method for robbing the ice cream store
      robIceCreamStore();
      //method for robbing the pet store
      robPetStore();
      //method for robbing the bakery
      robBakery();
      //method for robbing the gym and clothing stores
      gymAndClothingStore();
      //method for the clothing display minigame
      clothingDisplay();
    }
    else if(yesOrNoMall.equals("N") || yesOrNoMall.equals("n"))
    //user refuses to go to the mall
    {
      System.out.println("You are going to miss out on a lot of fun.");
    }
    else
    //if the user puts an unvalid input
    {
      System.out.println("That is not a valid value!");
    }
   }
 }
  //method for displaying help
  public static void displayHelp() {
    System.out.println("Each game within the Hamster Adventure is explained" +
    " with all the rules before you are prompted to perform the game. If you " +
    " still can't figure it out...We...the creators of this game suggest that" +
    " direct all further inquires to Speedy the Tortoise at "+
    "wpodevin@gmail.com");
  }

  /////////////////////////////////////////////////////////////////////////////
  //new game module
  public static String robIceCreamStore()
  {
    String moneyTaken="";
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println();
    System.out.println("You have now entered Hammy's Ice Cream Shop");
    // Initialize variables and create a random string of letters
    char ch1 = (char) ('a' + (Math.random() * ('z' - 'a' +1)));
    char ch2 = (char)('A' + (Math.random() * ('Z' - 'A' + 1)));
    char ch3 = (char) ('a' + (Math.random() * ('z' - 'a' +1)));
    char ch4 = (char)('a' + (Math.random() * ('Z' - 'a' + 1)));
    char ch5 = (char)('a' + (Math.random() * ('c' - 'y' + 1)));
    char ch6 = (char)('a' + (Math.random() * ('s' - 'V' + 1)));

    String word = "" + ch1 + ch2 + ch3 + ch4 + ch5 + ch6;

    // Get user input and initialize variable
    type("To open the register: Enter the 6 character "+
    "authtication code");
    System.out.println(word);

    String userInput = input.nextLine();

    // Will let the user know if they matched the message or not
    if (userInput.equals(word)) {
      type("Welcome Hammy's Ice Employee! Welcome Back." +
      " Register is now open.");
      type("How much money would you like to take from the shop's"
      + " register?");
      moneyTaken = input.nextLine();
      type("Now that I have stolen money lets see what else I can steal");
    } else {
      type("INTRUDER ALERT!!! Mall cops have been notified! You" +
      " run out of the Ice Cream store and put on a mustache disguise"+
      "...narrowly evading security...looks like that didn't work "+
      "out lets try another store.");
    }
    return moneyTaken;
  }

  //get each character in string talk and print it out at a easier speed to read
  public static void rando(String talk) {
    char[] chars = new char[talk.length()];
    for (int i=0; i < talk.length(); i++) {
      chars[i] = talk.charAt(i);
      }
    int randnum = 0;  //create randnum variable
    char temp = 'a';  //create a temporary char variable
    //print out each character in a string
    for (int i = 0; i < chars.length; i++) {
      pause((int)(Math.random() * 100));  //randomize characters except spaces
      //and question marks.
      randnum = (int)(Math.random()*chars.length);
      if (chars[i] == ' ' || chars[randnum] == ' '
      || chars[i] == '?' || chars[randnum] == '?' )
        continue;
      temp =  chars[i];
      chars[i] = chars[randnum];
      chars[randnum] = temp;
      }
    System.out.print(chars);
    }

  //method for generating a random amount of time for the text to type out for
  //the player
  public static void type(String str) {
    for(int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i));
      pause((int)(Math.random() * 1));
    }
    System.out.println(" ");
  }

  //method for generating a random amount of time between chars to type out for
  //Speedy the tortoise
  public static void torttype(String str) {
    //print out each character in a string
    for(int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i));
      pause(2 + (int)(Math.random() * 4));  //random, but a slow speed
    }
    System.out.println(" ");
  }
  //method that can create a delay in order to make text more readable
  public static void pause(int millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {}
  }
  //////////////////////////////////////////////////////////////////////////////
  // new game module
  public static void robPetStore()
  {
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println();
    type(" Walking through the mall you notice a Pet Store...The sign reads "+
    "Crazy Carl's Critter Collection...from within you hear the cries of your "+
    "brother hamsters in captivity longing for freedom...Not on my watch...you"+
    " say to yourself. You sneak past a horde of customers and a sleazy "+
    "looking iguana trying to sell a tortoise...must be Crazy Carl...in the "+
    "back of the store there is a isle of cages with various rodents " +
    "you are ready to unlock their cages using your lockpicks when one "+
    "of the hamsters yells at you with a wild look in his eye... ");

    System.out.println("                                                     ");

    rando("HELLO ");
    rando("can ");
    rando("you ");
    rando("understand ");
    rando("what ");
    rando("I ");
    rando("am ");
    rando("saying?");

    System.out.println("                                                     ");

    type("You realize that years of captivity have rendered the " +
    "hamsters feral and unintelligible...now you are weary of opening their"+
    " cages...can you decipher what the wild hamsters are saying so that" +
    " you can be sure its safe to let them out");

    System.out.println("                                                     ");

    type("Hello, you tell the hamster i'm here to free you what is" +
    " your name? The Hamster replies...");

    System.out.println("                                                     ");

    rando("Hello ");
    rando("my ");
    rando("name ");
    rando("is ");
    rando("benedict ");
    rando("hamsterbatch");

    System.out.println("                                                     ");

    type("Can you tell what the name of the Hamster is...if so reply " +
    "to the hamster by entering the hamsters first and last name");

    String reply = input.nextLine();
    //check if player typed in the correct name of the hamster
    while (!reply.equalsIgnoreCase("benedict hamsterbatch")) {
      System.out.println("Sorry that wasn't his name...here's a hint he looks" +
      " like that actor who plays Dr. Strange in the marvel universe but a "+
      "hamster...try again");
      //get player's input
      reply = input.nextLine();
    }

    System.out.println("                                                     ");

    type("The hamster does a little dance...you guessed his name!");

    System.out.println("                                                     ");

    type("Just to make sure that it wasn't a random guess you decide to try" +
    " deciphering something else the hamster says in order to make sure he's" +
    " friendly");

    System.out.println("                                                     ");

    type("You ask the hamster are you friendly...the hamster replies");

    System.out.println("                                                     ");

    rando("im");
    rando(" the");
    rando(" sweetest");
    rando(" hamster");
    rando(" this");
    rando(" side");
    rando(" of");
    rando(" the");
    rando(" mississippi");

    System.out.println("                                                     ");

    type("the hamster says hes the sweetest hamster this side of the...but "+
    "you can't quite make out the rest...what is the last word the hamster "+
    "is saying");

    System.out.println("                                                     ");

    String reply2 = input.nextLine();
    //if player doesn't the word mississippi
    while (!reply2.equalsIgnoreCase("mississippi")) {
      System.out.println("Sorry that's not the word...try again. Here's a hint"+
      " its both a state and and river");
      reply2 = input.nextLine();
    }

    System.out.println("                                                     ");

    type("You are sure of the hamsters friendliness and release him suddenly "+
    "you are fully able to understand their strange dialict");

    System.out.println("                                                     ");

    type("The hamster you released tells you that you need to release" +
    " the other animals too...but watch out for the tortoises they can "+
    "be slow");

    System.out.println("                                                     ");

    type("you go to the tortoise cage and say hello, don't be crazy " +
    "im trying to let you out of the cage...the tortoise replies");

    System.out.println("                                                     ");

    torttype("Hello there my name is Speedy");

    System.out.println("                                                     ");

    type("Dear God you say to yourself...I don't have time for this..."+
    "you look up the isle and notice the iguana squinting to see whats going"+
    " on in the back of the store...he's starting to notice something is "+
    "going on");

    System.out.println("                                                    ");

    type("try to finish the tortoises sentences so that you can speed up " +
    "the conversation and get out of the store before Crazy Carl notices");

    System.out.println("                                                     ");

    torttype(" It's me again speedy the....");

    System.out.println("                                                     ");

    String reply3 = input.nextLine();
    //while player doesn't input the word tortoise
    while (!reply3.equalsIgnoreCase("tortoise")) {
      System.out.println("He's a tortoise...c'mon we've established this"+
      "...try again");
      reply3 = input.nextLine();
    }

    System.out.println("                                                     ");

    System.out.println("The tortoise starts to say something else...you "+
    "look at your watch");

    torttype("My favorite food is");

    String reply4 = input.nextLine();
    //if player doesn't type in "biscuits and gravy"
    while (!reply4.equalsIgnoreCase("biscuits and gravy")) {
      System.out.println("There's no way you could have known this...turns "+
      "out his favorite food is biscuits and gravy...guess hes a southern "+
      "tortoise just type in bicuits and gravy");
      reply4 = input.nextLine();
    }

    System.out.println("                                                     ");

    type("The tortoise starts to say something else but you cut him off, "+
    "unlock the cage and pull him out...but its too late...you turn around "+
    "and there's Crazy Carl...and he's lookin pretty crazy");

    System.out.println("                                                     ");

    type("Crazy Carl the iguana comes at you with a barage of insults his"+
    " tounge flails wildly snapping next to you as you dodge his attacks");

    System.out.println("                                                     ");

    type("Suddenly you realize that if you can make Crazy Carl mad enough you "+
    "might be able to get him tongue tied so that you can make your escape");

    System.out.println("                                                     ");

    type(" Try to insult Crazy Carl so that he gets toungue tied...you're "+
    "gonna have to be fast though.....Call Carl a fart face in "+
    "under 3 seconds");

    double start = System.currentTimeMillis();

    pause(4000);

    String reply5 = "";
    //while the player doesn't type in fart face within 3 seconds
    while (System.currentTimeMillis() - start > 3000
    || !reply5.equalsIgnoreCase("fart face")) {
      System.out.println("you have 3 seconds to tell of this dirty"+
      " iguana he's a fart face");
      //get current time to time 3 seconds
      start = System.currentTimeMillis();
      //get input from user
      reply5 = input.nextLine();
      }

    type("congrats you did it in less than 3 seconds....Carl's tongue "+
    "get tied into one knot");

    System.out.println("                                                     ");

    type("Hes almost completely tongue tied now...this time call him a "+
    "premadona iguana in 7 seconds");

    String reply6 = "";
    //while the player doesn't type in premodona iguana within 5 seconds
    while (System.currentTimeMillis() - start > 7000
    || !reply6.equalsIgnoreCase("premadona iguana")) {
      System.out.println("you have 7 seconds to tell off this dirty iguana"+
      " he's a premadona iguana");
      //get current time to time 3 seconds
      start = System.currentTimeMillis();
      //get input from user
      reply6 = input.nextLine();
      }
    type("congrats you did it in less than 7 seconds....Carl's tougue get " +
    "is completely tied up.....his toungue starts flailing so wildly that " +
    "it hits the ceiling fan and hes sucked up into the air");

    System.out.println("                                                     ");

    type("You and all the other pet store animals run for the exit...your're"+
    " free and have successfully escaped the Pet Store... All the animals cheer"+
    " for you as their savior.....");

    System.out.println("                                                     ");

    type("Speedy the tortoise pokes his head out of his shell" +
    " and everyone quietly listens");

    System.out.println("                                                     ");

    torttype("Welll Hooray, we're finally free...that reminds me of a "+
    "story...");

    System.out.println("                                                     ");

    type("All the animals roll their eyes and look at their watches and "+
    "quietly shuffle away as speedy keeps talking...you slink away as "+
    "well...off to your next adventure");
  }
  ////////////////////////////////////////////////////////////////////////////
  // new game module
  public static void robBakery()
  {
    Scanner input = new Scanner(System.in);

    System.out.println("You have now successfully freed some of your other" +
    " friends. You are now illegally taking over the bakery and posing as" +
    " the cashier with a fake mustahce." + "Try to not get caught!");
    System.out.println();
    System.out.println();
    System.out.println("Welcome to HamVille Bakery! I am Hamson the cashier");
    System.out.println("What dessert are you in the mood for today?");

    System.out.println("");
    System.out.println("Enter 0 for Pie" +
                       "\n      1 for Cupcake" +
                       "\n      2 for Brownie" +
                       "\n      3 for Muffin" +
                       "\n      4 for Cookie" +
                       "\n      5 for Cake" );

   System.out.print("\nChosen Dessert: ");
   int dessertChoice=input.nextInt();

  // program will exit if the user enters a number that is not on the menu
   if (dessertChoice < 0 || dessertChoice > 5) {
     System.out.println("That is not on the menu!");
     System.exit(0);
      }

     System.out.println("Good choice! How many of those would you like?" +
     " Unfortunately it is only me in the kitchen so the maximum desserts a "
   + "customer can buy is a dozen. ");

  // the user can only order a dozen or less of their desired dessert
  // if the user follows this rule, they will be entered into the raffle
   int numOfDesserts = input.nextInt();
   if (numOfDesserts <= 12) {
     System.out.println("Perfect! I will take care of your order now.");
     System.out.println("Congratulations! You've been entered in our " +
     "bakery raffle! Let's see if you won a free treat!");
   }
   else {
      System.out.print("Please respect our bakery policies. " +  // system exits
      "Get out of my bakery!");                                  // if user
      System.exit(1);                                            // orders more
                                                                 // than a dozen
   }
   int rafflePrize = (Math.random() <= 0.5) ? 1 : 10;          // if user's
   if (rafflePrize == 1) {                                    // raffle number
     System.out.println("Yay! You just won a free brownie."); // is 1, they will
   }                                                          // get a free
   if (rafflePrize >= 2) {                                    // treat
     System.out.println("Sorry! You didn't win the raffle and you cannot leave"
     + " this store with the desserts you just bought. GIVE THEM TO ME NOW!");
   }                                                          // if user's
                                                              // raffle number
                                                             // is 2, they will
                                                             // leave empty
                                                              // handed


  type("All of a sudden, the police all come into the bakery asking if anyone"+
  " has seen the criminal. Everyone and yourself all shrug their sholders, "+
  "but you feel a sneeze coming on. ah, AH, AHHH, AHHHHHH, ACHOOOOOOOOOOOO!!!"+
  " Your mustache disguise falls off, showing your beautiful, but wanted face "+
  "to the police. KEEP YOUR HANDS UP as the police hit you with the "+
  "baguettes they find in the bakery. You've been caught. It's all over."+
  "They're going to give you the cheese sentence, where you have to eat some "+
  "cheese, but you are tired of eating cheese. You plead with the police "+
  "officers if you can do anything else, but eat cheese. The police chief"+
  ", who hates doing chores for his wife, says you can be free if you do "+
  "some errands for him, while also helping out the mall. That's way better "+
  "than being forced to eat cheese, so you accept. You must go to the gym and"+
  " clothing stores to do some errands.");

  }
  /////////////////////////////////////////////////////////////////////////////
  // new game module
  public static void gymAndClothingStore()
  {
    Scanner input = new Scanner(System.in);
    type("You are now at the gym.");
    type("You have to lift a weight 10 times. You must lift"+
    " a 100 gram weight. Type in the amount of weight you are going to lift");
    int liftCount=0;  //counter to count amount of lifts
    int liftMass; //mass of the weight you are going to be lifting
      while(liftCount!=10)  //you have to lift 10 times
      {
        System.out.print("Lift that weight you filthy rodent!");
        liftMass=input.nextInt(); //get mass of lifting weight
        if(liftMass==100)//if the weight mass is 100
        {
          pause(2000);  //time it takes to lift the weight
          type("Look at that weight go!");//when you lift a weight
          liftCount++;  //increase amount of lifts completed
          liftMass=0; //reset the mass of the lifting weight
        }
        else if(liftMass>=500)//when the mass of the lifting weight is more than
                              //the record for hamsters
        {
          type("That weight is more than the weight lifting "+
          "record for hamsters. The weight falls on you and you can't get up.");
          //wait 1 second for the hamster to make it easy to read
          pause(1000);
          type("The police make fun of your jello body and pure idiocy.");
        }
        //when the player puts in a number other than 100, they must restart
        //the whole set of lifts
        else  //the rest of the outcomes
        {
          type("Wrong mass! Start over!");
          liftMass=0; //reset lift mass
          liftCount=0;  //reset amount of lifts
        }
      }
      type("Nice work you criminal! Now that we think about it,"+
      " this prepared you for some time in the slammer! We didn't think that "+
      "through, oops!");


      //clothing store
      //the criminal must fix 3 diplays, each consisting of 3 pieces of clothing
      //that must be folded. The program will show the display the player made
      //at the end
      int foldsInDisplay=0;
      String display="";
      int amountOfDisplays=0;

      while(amountOfDisplays<3)
      {
        System.out.print("We've now moved on to the clothing store.");
        System.out.println("Fold like your life depends on it by typing in"+
        " letters in the word fold!");
        char fold = input.next().charAt(0);
        //variable to tell player if the display is perfect or not
        boolean perfectDisplay=true;
        //check if player puts in characters in the word fold
          if (fold == 'f' || fold == 'o' ||fold == 'l' ||fold == 'd'
          || fold == 'F' || fold == 'O' || fold == 'L' || fold == 'D') {
            type("Nice folding");
            foldsInDisplay++;
            display=display+fold; //add characters to display String
          }
          else {
            type("Horrible folding");
            //the display is not perfect
            perfectDisplay=false;
            display=display+fold; //add characters to display String
          }
          if(foldsInDisplay==3) //when one display is complete
          {
          System.out.println();
          System.out.println("Your "+perfectDisplay+"-ly beautiful display:");
          System.out.println();
          System.out.println(display);
          System.out.println();
          System.out.println();
          foldsInDisplay=0;
          amountOfDisplays++; //increase the amount of displays made
          display=""; //clear the display String variable
          }
      }
      pause(1000);
  }
///////////////////////////////////////////////////////////////////////////////
// new game module
  public static void clothingDisplay() {

    type("As part of your punishment for stealing you must now go to" +
    " the clothing store and run errands for the cheif's wife...when you "+
    "arrive the clothing store owner...a rather large and well dressed "+
    "possum...tells you that he wont do anything for you untill you help "+
    "him rearrange his clothing displays ...you sigh and agree...");

    // create scanner object
    Scanner input = new Scanner(System.in);
    // create 3x3 array for beginning clothing display
    char[][] carray = {
     {'Y','B', 'B'},
     {'B','B','G'},
     {'G', 'G', 'G'}
    };

    // Create 3x3 array for updated clothing displaying
    char[][] uparray = new char[3][3];

    // Create 3x3 array for what the final display should be
    char[][] farray =
    {
     {'B','G', 'B'},
     {'G','Y','G'},
     {'B', 'G', 'B'}
    };
    type("This is what the possum wants:");
    printArray(farray);

    System.out.println();

    type("This is the display looks like currently");
    createArray(carray);
    // while loop that keeps going as long as updated array does not equal the
    // final array
    while (!Arrays.deepEquals(uparray, farray)) {

      type("swap the clothes around so that it matches the description" +
      "...you can swap the clothes by entering the row and column of your "+
      "first display ...then the row and column of your second display that"+
      " you want to switch" );
      // prompt input for row of

        System.out.println("Enter number from 0-2 for row of first index");
        int row1 = input.nextInt();




        System.out.println("Enter number from 0-2 for column of first index");
        int col1 = input.nextInt();


        System.out.println("Enter number from 0-2 for the row of the"+
        " second index");
        int row2 = input.nextInt();

        System.out.println("Enter number from 0-2 for the column of the "+
        "second index");
        int col2 = input.nextInt();

      swapArray(uparray, carray, row1, col1, row2, col2);

      printArray(uparray);
      }

      type("OHHhhhhhhh Yea... you did it...the possum giddly claps" +
      " his hands and tells you that you can have anything in the store"+
      "...You take the items the cheif wanted and leave the store...after "+
      "giving the clothes to the cheif...he grunts and says your lucky I "+
      "didn't give you the cheese punishment...the cheif takes out a sharp "+
      "stick and peirces a peice of salami from a deli platter on his desk..."+
      "he then dips it into a large fondue bowl and eats it....tastes like "+
      "justice...now get outta here ya filthy rodent!");

      System.out.println();

      type(" You leave the store with your head hung low...at least you" +
      " got out in one peice...but you didn't really get to "+
      "steal anything...... or did you....you pull out your pockets and all"+
      " the chiefs deli meats are in your hands...looks like you got "+
      "something after all...you book it outta there on to your next "+
      "adventure.");

      }
    //THE FOLLOWING METHODS ARE FROM THE BOOK

    //method for creating array
    public static void createArray(char[][] carray) {

      for (int row = 0; row < carray.length; row++) {
        for (int column = 0; column < carray[row].length; column++) {



          System.out.printf("%2s", carray[row][column]);
        }
        System.out.println();
      }

    }
    //method for swapping arays
    public static char[][] swapArray(char[][] uparray, char[][] carray,
    int rowswap1, int colswap1, int rowswap2, int colswap2) {

          char temp = carray[rowswap1][colswap1];
          carray[rowswap1][colswap1] = carray[rowswap2][colswap2];
          carray[rowswap2][colswap2] = temp;

          for (int row = 0; row < carray.length; row++) {
            for (int column = 0; column < carray[row].length; column++) {

            uparray[row][column] = carray[row][column];
          }
        }
      return uparray;
    }

    //method to print arrays
    public static void printArray(char[][] uparray) {

    for (int row = 0; row < uparray.length; row++) {
      for (int column = 0; column < uparray[row].length; column++) {

        System.out.printf("%2s", uparray[row][column]);
        }
          System.out.println();
      }
    }

}
