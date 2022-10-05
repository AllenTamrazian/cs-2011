import java.util.Scanner;

public class FutureDay5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What day is it today?");
    int today=input.nextInt();
    System.out.println("Enter 0 for Sunday" +
                       "\n      1 for Monday" +
                       "\n      2 for Tuesday" +
                       "\n      3 for Wednesday" +
                       "\n      4 for Thursday" +
                       "\n      5 for Friday" +
                       "\n      6 for Saturday");
    System.out.print("\ntoday: ");
    System.out.print("how many days into the future? ");
    int daysIntoFuture = input.nextInt();
    // int futureDay = (today + daysIntoFuture)
    //                  - ((today + daysIntoFuture)/7 * 7);

    int futureDay = (today + daysIntoFuture) % 7;

    // this will convert the day of the week number into a string
    String futureDayOfTheWeek = "";

    switch(futureDay) {
    case 0: futureDayOfTheWeek = "Weekend"; break;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5: futureDayOfTheWeek="Weekday"; break;
    case 6: futureDayOfTheWeek= "Weekend"; break;
    default: futureDayOfTheWeek = "This should not happen.";
  }
    // if (futureDay == 0) {
    //     futureDayOfTheWeek = "Sunday";
    // }  else if (futureDay == 1) {
    //     futureDayOfTheWeek = "Monday";
    // }  else if (futureDay == 2) {
    //      futureDayOfTheWeek = "Tuesday";
    // }  else if (futureDay == 3) {
    //    futureDayOfTheWeek = "Wednesday";
    // }  else if (futureDay == 4) {
    //      futureDayOfTheWeek = "Thursday";
    // }  else if (futureDay == 5) {
    //      futureDayOfTheWeek = "Friday";
    // }  else {
    //      futureDayOfTheWeek = "Saturday";
    // }


    System.out.println("In " + daysIntoFuture +
                        " days it will be " + futureDayOfTheWeek);
    input.close();
  }
}
