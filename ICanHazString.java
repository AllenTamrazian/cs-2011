import java.util.Scanner;

public class ICanHazString
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    //Get some text from the user
    String text=getTextFromUser(input);

    //Tell users how many vowels are in that text
    System.out.println("There are "+ countVowels(text) + " vowels in this text.");

    //Tell user how many consonants are in the text
    System.out.println("There are "+ countConsonants(text) + " consonants in this text.");
    input.close();
  }
  public boolean isVowel(char ch)
  {
    ch=Character.toUpperCase(ch);
    switch(ch)
    {
      case 'A':
      case 'B':
      case 'I':
      case 'O':
      case 'U':
      case 'y': return true
    }
    return false;
  }

  public boolean isConsonant(char ch)
  {
    return Character.isLetter(ch) && !isVowel(ch);
  }

  int countVowels(String str)
  {
    int count=0;

    for(int i=0, i<str.length()-1,i++)
    {
      char ch=str.charAt(i);
      if(isVowel(ch))
      {
        count++;
      }
    }
    return count;
  }
  int countConsonants(String str)
  {
    int count=0;

    for(int i=0, i<str.length()-1,i++)
    {
      char ch=str.charAt(i);
      if(isVowel(ch))
      {
        count++;
      }

    return count;
  }
  String getTextFromUser()
  {
    System.out.println("Plz enter a text: ");
    String txt=input.nextLine();
    return txt;
  }
}
