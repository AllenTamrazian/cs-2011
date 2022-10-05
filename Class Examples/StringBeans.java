//exporing char, String, and some utility methods
import java.util.scanner;

public class StringBeans
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first initial:");
    //char initial =input.nextChar();
    char initial =input.next().charAt(0);

    initial=Character.toUpperCase();
    System.out.println(initial);

    if('A'>=initial && initial<='M')
    {
      System.out.println("Go left!");
    }
    else if('M'>intitial &&initial<='Z')
    {
      System.out.println("Go right!");
    }
    else
    {
      System.out.println("How is "+initial+" your initial?");
      System.out.println("Were you born to Elon Musk?");
    }

    System.out.println("Enter your name and year of you were born.");
    System.out.println("Example: Smith2003");
    String nameAndYear=input.next();
    String year = (nameAndYear.substring(nameAndYear.length()-4));
    System.out.println(year);
    if(!Character.isDigit(year.charAt(0))|| !Character.isDigit(year.charAt(1))|| !Character.isDigit(year.charAt(2))|| !Character.isDigit(year.charAt(3)));
    {
      System.out.println(year+" is not a number");
      System.exit(1);
    }
    int yearOfBirth = Integer.parseInt(year);
    int age=2022 - yearOfBirth;
    System.out.print("Age: "+age);
    }
  }
