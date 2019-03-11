import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class LargestInArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LargestInArray
{ 
   public static void main(String[]args)throws IOException
   {
       final int LENGTH=100;
       int[] values = new int[LENGTH];
       int currentSize=0;
       
       Scanner in = new Scanner(System.in);
       System.out.println("Enter integer numbers, Q to quit");
       while (in.hasNextInt() && currentSize<values.length)
       {
        values[currentSize]= in.nextInt();
        currentSize++;
    }
    int largest = values[0];
    for(int i=1; i<currentSize; i++)
    {
        System.out.println(values[i]);
        if(values[i]==largest)
        {
        System.out.println("<== largest value");
    }
        System.out.println();
    }
}
}
