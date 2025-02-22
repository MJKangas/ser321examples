import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
     if (args.length == 2) {
        int numerator = 0;
        int denominator = 0;
        try {
          numerator = Integer.parseInt(args[0]);
          denominator = Integer.parseInt(args[1]);
        } catch (Exception e) {
          System.out.println("Arguments: " + args[0] + ", " + args[1] + " must be integers.");
          System.exit(1);
        }
        Fraction fraction = new Fraction();
        fraction.setNumerator(numerator);
        fraction.setDenominator(denominator);
        System.out.println("The fraction is: " + fraction.print);
      } else {
          System.out.println("Exactly 2 arguments should be provided.");
      }
      }
   }
}

