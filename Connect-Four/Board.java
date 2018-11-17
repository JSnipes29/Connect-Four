public class Board
{
  private char[][] board;
  private boolean[][] boolBoard;
  
  public Board()
  {
    board = new char[6][7];
    boolBoard = new boolean[6][7];
   // clearBoard();
  
  
  }
  public void instructBoard()
  {
    for(int i = 0; i < board[5].length; i++)
    {
    
      board[5][i] = (char)((i+1)+ '0');
    
    }
    
    
  }
  public void clearBoard()
  {
    for(int i = 0; i < board.length; i++)
    {
    
      for(int j = 0; j < board[i].length; j++)
      {
      
        board[i][j] = ' ';
        boolBoard[i][j] = false;
      }
    }
  
  
  }
  public void printBoard()
  {
    for(int i = 0; i < board.length; i++)
    {
    
      for(int j = 0; j < board[i].length; j++)
      {
        System.out.print("|" + board[i][j]);
        if(j == board[i].length - 1)
        {
          System.out.print("|");
        }
        
        
      }
      System.out.println();
    
    }
  
  }
  public boolean invalidChoice(int choice)
  {
    return boolBoard[0][choice - 1];
   
    
    
  }
  public boolean getChoice(int r, int c)
  {
    return boolBoard[r][c];
  }
  public int getLength()
  {
    return board.length;
  }
  public int getLengthTwo()
  {
    return board[0].length;
  
  }
  public void setBoard(int r, int c, char piece)
  {
    board[r][c] = piece;
    boolBoard[r][c] = true;
  }
  public boolean checkWinner(int[] point)
  {
    return checkHorizontal(point) || checkVertical(point) || checkLeftDiagonal(point) || checkRightDiagonal(point);
  }
  public boolean checkRightDiagonal(int[] point)
  {
    int count = 0;
     for(int i = 1; i <= 3; i++)
    {
      if(point[0] - i == -1 || point[1] + i == 7)
      {
        break;
      }
      if(board[point[0]][point[1]] != board[point[0] - i][point[1] + i])
      {
        break;
      }
      else
      {
        count++;
        if(count >= 3)
        {
          return true;
        }
      
      }
      
    }
       for(int i = 1; i <= 3; i++)
    {
      if(point[0] + i == 6 || point[1] - i == -1)
      {
        break;
      }
      if(board[point[0]][point[1]] != board[point[0] + i][point[1] - i])
      {
        break;
      }
      else
      {
        count++;
        if(count >= 3)
        {
          return true;
        }
      
      }
      
    }
     return false;
  }
  public boolean checkLeftDiagonal(int[] point)
  {
    int count = 0;
    for(int i = 1; i <= 3; i++)
    {
      if(point[0] + i == 6 || point[1] + i == 7)
      {
        break;
      }
      if(board[point[0]][point[1]] != board[point[0] + i][point[1] + i])
      {
        break;
      }
      else
      {
        count++;
        if(count >= 3)
        {
          return true;
        }
      
      }
      
    }
     for(int i = 1; i <= 3; i++)
    {
      if(point[0] - i == -1 || point[1] - i == -1)
      {
        break;
      }
      if(board[point[0]][point[1]] != board[point[0] - i][point[1] - i])
      {
        break;
      }
      else
      {
        count++;
        if(count >= 3)
        {
          return true;
        }
      
      }
      
    }
    return false;
    
  }

  public boolean checkVertical(int[] point)
  {
    int count = 0;
      for(int i = 1; i <= 3; i++)
    {
      
      if(point[0] + i == 6)
      {
        break;
      
      }
      if(board[point[0]][point[1]] != board[point[0] + i][point[1]])
      {
        break;
        
      
      }
      
      else
      {
        count++;
        if(count >= 3)
        {
          return true;
        }
      }
      
      
    }
       for(int i = 1; i <= 3; i++)
    {
      
      if(point[0] - i == -1)
      {
        break;
      
      }
      if(board[point[0]][point[1]] != board[point[0] - i][point[1]])
      {
        break;
        
      
      }
      
      else
      {
        count++;
        if(count >= 3)
        {
          return true;
        }
      }
      
      
    }
       return false;
    
    
  }
  public boolean checkHorizontal(int[] point)
  {
    int count = 0;
    for(int i = 1; i <= 3; i++)
    {
      
      if(point[1] + i == 7)
      {
        break;
      
      }
      if(board[point[0]][point[1]] != board[point[0]][point[1] + i])
      {
        break;
        
      
      }
      
      else
      {
        count++;
        if(count >= 3)
        {
          return true;
        }
      }
      
      
    }
      for(int i = 1; i <= 3; i++)
    {
      
      if(point[1] - i == -1)
      {
        break;
      
      }
      if(board[point[0]][point[1]] != board[point[0]][point[1] - i])
      {
        break;
        
      
      }
      
      else
      {
        count++;
        if(count >= 3)
        {
          return true;
        }
      }
      
      
    }
    
    return false;
    
  }


}