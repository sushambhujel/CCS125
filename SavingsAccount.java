
/**
 * 
 *
 * @SushamBhujel
 * 02-14-2019
 */


public class SavingsAccount
{
   private double balance;
   public SavingsAccount(double Bal)
   {
       balance = Bal;
       
    }
   public void addInterest(double Int)
   {
       balance= balance+(balance*Int);
    }
   public double getBalance()
   {
       return balance;
    }
   
}
