import java.util.ArrayList;
public class Functions
{
  public static boolean tryParseInt(String number)
  {
    try
    {
      int test = Integer.parseInt(number);
    
    }
    catch(Exception e)
    {
      return false;
    
    }
    
    return true;
  
  
  }
  public static int[] toArray(ArrayList<Integer> list)
  {
    int[] array = new int[list.size()];
      for(int i = 0; i < array.length; i++)
    {
      array[i] = list.get(i);
    
    }
    return array;
  }


}