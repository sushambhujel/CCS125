
/**
 *
 * SBhujel
 * 03-11-2019
 */
public class SumAndAverage
{
  static int sum;
  static double avg;
  public static void main(String[] args) 
  {
    for(int i = 0; i < 101; i += 1) 
    {
      sum += i;
    }
    avg = sum / 100.0;
    System.out.println("The sum is "+sum);
    System.out.println("The average is "+avg);
  }
}
        
        

