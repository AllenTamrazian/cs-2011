// Mark Familara
// Allen Tamrazian
//CS 2011
// Section 9 and 10
//Description: This program is the fixed version of the LetterGrade code. We had to use if and else if statements for this code.
//We fixed the letter grades to have more specific parameters.
//Other comments: None.
// There were no issues to report. Everything went smoothly.
import java.util.Scanner;

public class LetterGrade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("What is your score out of 100? ");
    int score = input.nextInt();

    String letterGrade;
    letterGrade="";
    if (score <= 0){  //input validation for score being less than 0
      System.out.print("That score doesn't make sense.");
      System.exit(1);
    }
    if (score >= 60 && score < 70) {
      letterGrade = "D";
    }
    else if (score >= 70 && score<80) {
        letterGrade = "C";
    }
    else if (score >= 80 && score <90) {
      letterGrade = "B";
    }
    else if (score >=90) {
      letterGrade = "A";
    }
    else {
      letterGrade = "F";
    }

    System.out.println("Your grade is " + letterGrade); //tell user what letterGrade they have
  }
}
