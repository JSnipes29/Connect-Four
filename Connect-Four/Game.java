import java.util.Scanner;
public class Game
{
  private Player playerOne;
  private Player playerTwo;
  private Board board;
  public Game(Board board, Player p1, Player p2)
  {
    this.board = board;
    playerOne = p1;
    playerTwo = p2;
    
  
  }
  public void start()
  {
    System.out.println("Welcome to Connect Four!!!");
  }
  public void instructions()
  {
    System.out.println("Type the number where you would like to go.");
    board.instructBoard();
    board.printBoard();
    board.clearBoard();
    
    
  }
  public int[] choose(Player player)
  {
    System.out.println("Player " + player.getNumber() + " choose.");
    String choice = player.choose();
    while(!Functions.tryParseInt(choice) || (Integer.parseInt(choice) < 1 || Integer.parseInt(choice) > 7) || board.invalidChoice(Integer.parseInt(choice)))
    {
    
      System.out.println("Please enter a valid number between 1-7.");
      choice = player.choose();
    
    }
    int c = Integer.parseInt(choice) - 1;
    for(int i = board.getLength() - 1; i >= 0; i--)
    {
      if(board.getChoice(i,c))
      {
        continue;
      }
      board.setBoard(i,c,player.getPiece());
      return new int[] {i,c}; 
      
      
    }
    return null;
    
  
  
  }
  public boolean game()
  {
    board.clearBoard();
    instructions();
    while(true)
    {
      
      if(board.checkWinner(choose(playerOne)))
      {
        board.printBoard();
        System.out.println("Player 1 won!!!");
        break;
        
      }
      
      board.printBoard();
      if(isTie())
      {
        break;
      }
      if(board.checkWinner(choose(playerTwo)))
      {
        board.printBoard();
        System.out.println("Player 2 won!!!");
        break;
      }
      board.printBoard();
       if(isTie())
      {
        break;
      }
       
      
    
     
    }
    
    return playerOne.playAgain();
  }
  public boolean isTie()
  {
    for(int i = 1; i <= board.getLengthTwo(); i++)
    {
      if(!board.invalidChoice(i))
      {
        return false;
      }
    
    }
    System.out.println("Match ended in tie.");
    return true;
  
  
  }
 


}