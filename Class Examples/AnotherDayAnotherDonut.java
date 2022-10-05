import java.util.Scanner;
public class AnotherDayAnotherDonut
{
  public static void main(String[] args)
  {
    final int MIN_PER_DAY=3;
    final int MAX_PER_DAY=12;
    final int TARGET = 2* BAKERS_DOZEN;

    System.out.println("\nLet's bake some donuts!\n");

    for(int day=1; day<=7; day++)
    {
      System.out.println("Day "+day+":");
      int numDonuts=(int)(MIN_PER_DAY+Math.random() * (MAX_PER_DAY-MIN_PER_DAY+1));
      // System.out.println("We baked "+numDonuts+" donuts");

      for(int d=numDonuts;d>0;d--)
      {
        System.out.print("o");
        donuts+="o";
      }
    }
    System.out.println();
    if(donuts.length()>=TARGET)
    {
      System.out.println("Woohoo! We hit the target for this week!!!");
      donuts="";
    }
    System.out.println("Number of timew we made target this week: "+targetCount);

    System.out.println("\nG R A N N Y' S    D O N U T S    F O R E V E R");
  }
}
