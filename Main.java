import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList<String> words = new ArrayList<String>;


    while (!input.equals("STOP"))
    {
      System.out.println("In the loop. Enter a word");
      input = sc.nextLine();
      words.add(input);
      System.out.println("The ArraList is now " + words);
    }
  }
}
