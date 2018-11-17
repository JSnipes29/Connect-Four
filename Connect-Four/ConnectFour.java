import java.util.Scanner;
public class ConnectFour
{

  public static void main(String[] args)
  {
    Game game = new Game(new Board(),new Player(new Scanner(System.in),'x',1),new Player(new Scanner(System.in),'o',2));
    game.start();
    while(game.game())
    {
      
      
    }
    System.out.println("!!!Bye!!!");
    
  
  }



}