public class MethodMan
{
  public static void main(String[] args)
  {
    // System.out.print("Hello World!");
    displayHelloWorld(3);
    String msg = getHelloWorldMsg();
    System.out.print(msg);
  }
  public static String getHelloWorldMsg()  //without void, you can return a value
  {
    return "HELLO WORLD!";  //only for string data type methods
  }
  public static void displayHelloWorld(int times)  //without void, you can return a value
  {
    for(int i=0; i<times; i++)
    {
      displayHelloWorld();
    }
  }
  public static void displayHelloWorld()  //without void, you can return a value
  {
    System.out.println("Hello World!");
    //return;
  }
}
