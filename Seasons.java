import java.util.Scanner;

public class Seasons
 {
  public static void main(String[] args) {
    System.out.print("Enter month as a number: ");
    Scanner input = new Scanner(System.in);
    int numOfMonth=input.nextInt();
    String nameOfMonth="";
    String seasonOfTheYear="";

    switch(numOfMonth){
    case 1: nameOfMonth= "January"; break;
    case 2: nameOfMonth= "February"; break;
    case 3: nameOfMonth= "March"; break;
    case 4: nameOfMonth= "April"; break;
    case 5: nameOfMonth= "May"; break;
    case 6: nameOfMonth= "June"; break;
    case 7: nameOfMonth= "July"; break;
    case 8: nameOfMonth= "August"; break;
    case 9: nameOfMonth= "September"; break;
    case 10: nameOfMonth= "October"; break;
    case 11: nameOfMonth= "November"; break;
    case 12: nameOfMonth= "December"; break;
    default: System.out.print("That's not a realistic number."); System.exit(0);
    }
    switch(numOfMonth){
      case 12:
      case 1:
      case 2: seasonOfTheYear="Winter"; break;
      case 3:
      case 4:
      case 5: seasonOfTheYear="Spring"; break;
      case 6:
      case 7:
      case 8: seasonOfTheYear="Summer"; break;
      case 9:
      case 10:
      case 11: seasonOfTheYear="Autumn"; break;
    }
    System.out.println(nameOfMonth+"is in "+seasonOfTheYear);
  }
}
