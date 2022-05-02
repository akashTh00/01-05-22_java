// java program to find the Sum of N natural Numbers using Recursion--
import java.util.*;

class SumOfNum{
    public static void main(String args[]){
        int sum;  //variable declaration
        Scanner scan = new Scanner(System.in);
        //create a scanner object for input
        System.out.print("Enter the value for num: ");
        int num = scan.nextInt();
        sum = addNumbers(num);
        System.out.printf("Sum of N natural numbers is : %d", sum);
    }
        static int addNumbers(int num)
        {
            if(num != 0)
             return num + addNumbers(num-1);
            else
                return num;
        }
}