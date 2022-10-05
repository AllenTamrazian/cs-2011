import java.util.Scanner;

public class GoneBits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt user to enter a number in Java short range
    System.out.print("Enter a number in [" + Short.MIN_VALUE +
                     ", " + Short.MAX_VALUE + "] interval:  ");

    // Read short value
    short sixteenBits= input.nextShort();

    // Cast from short to byte
    byte eightBits = (byte) sixteenBits;

    // Show the result of casting
    System.out.println("Here is your number after I cast it to byte: " +
                        eightBits);
  }
}
