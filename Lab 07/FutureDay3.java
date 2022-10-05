// Mark Familara
// Allen Tamrazian
//CS 2011
// Section 9 and 10
//Description: This program is based on the FutureDay code, but instead it prints out the day of the Week. We had to use
//else if statements for this problem.
//Other comments: We used two seperate if statements for days into the future to make it easier to read and manage.
// Only issue that is that since the program has a lot of lines, it was prone to bugs. So, we just debugged
// until our program was running correctly. We also had difficulty with initializing the String variable.
import java.util.Scanner;
public class FutureDay3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What day is it today?");
    System.out.println("Enter 0 for Sunday" +
                       "\n      1 for Monday" +
                       "\n      2 for Tuesday" +
                       "\n      3 for Wednesday" +
                       "\n      4 for Thursday" +
                       "\n      5 for Friday" +
                       "\n      6 for Saturday");
    System.out.print("\ntoday: ");
    int today = input.nextInt();
    if(today < 0 || today >6) //input validation for days into the future
    {
      System.out.println("Input is not avaliable");
      System.exit(1);
    }
    System.out.print("how many days into the future? ");
    int daysIntoFuture = input.nextInt();
    // int futureDay = (today + daysIntoFuture)
    //                  - ((today + daysIntoFuture)/7 * 7);
    int futureDay = (today + daysIntoFuture) % 7;
    String futureDayOfTheWeek;
    futureDayOfTheWeek="";  //variable to store the day of the week string
    if(daysIntoFuture < 0) {  //input validation for days into the future
      System.out.println("Input is not available");
      System.exit(2);
    }
    if(futureDay == 0)  //the day of the week is Sunday if the futureDay is 0
    {
      futureDayOfTheWeek= "Sunday";
    }
    else if(futureDay == 1)  //the day of the week is Monday if the futureDay is 1
    {
      futureDayOfTheWeek= "Monday";
    }
    else if(futureDay == 2)  //the day of the week is Tuesday if the futureDay is 2
    {
      futureDayOfTheWeek= "Tuesday";
    }
    else if(futureDay == 3)  //the day of the week is Wednesday if the futureDay is 3
    {
      futureDayOfTheWeek= "Wednesday";
    }
    else if(futureDay == 4)  //the day of the week is Thursday if the futureDay is 4
    {
      futureDayOfTheWeek= "Thursday";
    }
    else if(futureDay == 5)  //the day of the week is Friday if the futureDay is 5
    {
      futureDayOfTheWeek= "Friday";
    }
    else if(futureDay == 6)  //the day of the week is Saturday if the futureDay is 6
    {
      futureDayOfTheWeek= "Saturday";
    }

    System.out.println("In " + daysIntoFuture +
                      " days it will be " + futureDayOfTheWeek);
    input.close();
  }
}
