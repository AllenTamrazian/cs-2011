public class HowCoolAmI
{
  public static void main(String args)
  {
    //int randomNum=(int)(5+Math.random() * 5) //gets range of numbers from 5 to 9
    //random values in [min, max]
    //=(int)(min+Math.random()*(max-min))
    //System.out.print(randomNum);
    int coolnessScore = (int)(Math.random() * 101);
    System.out.println("You are" +coolnessScore+"out of 100.");

    String msg;

    //need to assign the right value to msg.
    switch(coolnessScore/10)
    {
      case 0:
      case 10: //msg="Cool as ice. "; break;
      case 9: //msg="Cool as ice. "; break;
      case 8: msg="Cool as ice. "; break;
      case 7: //msg="Just lukewarm..."; break;
      case 6: //msg="Just lukewarm..."; break;
      case 5: msg="Just lukewarm..."; break;
      default: msg="Sorry: NOT AT ALL :(";
    }
    // if(coolnessScore<=80)
    // {
    //   msg="Cool as ice. ";
    // }
    // else if(coolnessScore>=50)
    // {
    //   msg="Just lukewarm... ";
    // }
    // else
    // {
    //   msg="Sorry: NOT AT ALL :(";
    // }
    System.out.println("How cool is that? " + msg);

  }
}
