
/**
 * 
 *
 * @SushamBhujel
 * 02-14-2019
 */


public class SavingsAccount
{
   private double Balance;
   public void SavingsAccount(double Bal)
   {
       Balance = Bal;
       
    }
   public void addInterest(double Int)
   {
       Balance= Balance+(Balance*Int);
    }
   public double getBalance()
   {
       return Balance;
    }
   
}
