import java.util.Scanner;
public class Player
{
  private Scanner input;
  private char piece;
  private int number;
  public Player(Scanner input, char piece, int x)
  {
    this.input = input;
    this.piece = piece;
    number = x;
  
  }
  public String choose()
  {
 
 /*   while(!Functions.tryParseInt(choice))
    {
      System.out.println("Please choice a valid number between 1-7");
      choice = input.nextLine();
    
    }
    return Integer.parseInt(choice);
   */
    return input.nextLine();
    
  }
  public char getPiece()
  {
    return piece;
  
  }
  public int getNumber()
  {
    return number;
  }
   public boolean playAgain()
  {
    System.out.println("Would you like to play again?");
    System.out.println("[Y/N]");
    String choice = input.nextLine().toLowerCase();
    while(choice.length() != 1 || (!choice.equals("y") && !choice.equals("n")))
    {
      System.out.println("Please enter a valid option [y/n].");
      choice = input.nextLine().toLowerCase();
    }
    return choice.equals("y");
    
    
  }

  
  
}