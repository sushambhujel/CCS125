import java.util.Scanner;
/**
 * Write a description of class Curfew here.
 *
 * SBhujel
 * 03-10-2019
 */

public class Curfew
{
public static void main(String[]args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter Your Age");
int age = input.nextInt();

if(age <= 13)
{
    System.out.println("Sorry! You can not attend the Party.");
}
if(age>13 && age<=16)
{
    System.out.println("You can attend the party but you have a curfew of 10:00 pm to return home.");
}
if(age>16)
{
    System.out.println("You can attend thr party but you have a curfew of Midnight to return home.");
}

}
}

