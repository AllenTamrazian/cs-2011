public class LetsDoStuffWithCharacters
{
  public static void main(String[] args)
  {
    char bigA, smolA;
    bigA='A';//'u/0041';//0x41;//"A";//A
    smolA='a';//97;//"a";//a
    //System.out.print(0x41);
    System.out.print('u/263B');
    System.out.print("bigA is: "+bigA);
    System.out.print("smolA is: "+smolA);

    char letter = 'G';
    System.out.println("Let's start with"+letter);
    System.out.println("the next letter is "+ ++letter);

    char randomLetter=(char)('A'+Math.random() *('Z'-'A'+1));
    System.out.println("This program is brought to you by the letter "+randomLetter);
    System.out.println(bigA+smolA);
    System.out.println(""+bigA+smolA+'\u0050');
  }
}
