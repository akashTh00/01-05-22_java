//java program to find the prime factors of a given number

import java.util.Scanner;

public class PrimeFactors {
   public static void main(String args[]){
      int number;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number ::");
      number = sc.nextInt();

      for(int i = 2; i < number; i++){
         while( number % i == 0 ){
            System.out.println(i + " ");
            number = number / 2;
         }
      }
      if(number > 2)
         System.out.println(number);
   }
}

// prime factor is finding which prime numbers multiply together to make the original number.