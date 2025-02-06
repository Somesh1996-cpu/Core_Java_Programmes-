import java.util.Scanner;

public class Factorial_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number for the factorial: ");
        int num = scan.nextInt();
        // 1. Using for loop to find the factorial number.
//        int fact = 1;
//        for (int i = num; i >= 1; i--) {
//            if (num == 0)
//                break;
//            else {
//                fact *= i;
//            }
//        }
//        System.out.println(fact);
       // Using while_loop to find out the factorial number.
//        int i = num;
//        int fact = 1;
//        while (i >= 1)
//        if (num == 0)
//        break;
//        else
//        {
//            fact *= i;
//            i--;
//        }
//        System.out.println(fact);
//        // Use do_while loop to find out the factorial of the number.
//        int i = num;
//        int fact = 1;
//        do {
//            if (num == 0)
//                break;
//            else
//            fact *= i; // here assume if num is 10 it will be multiplied with fact i.e 1 = 10*1= 10 then number
//            // will be reduced by 1, so previous 10 will be multiplied with current number i.e 9.
//            i--;
//        } while (i >= 1);
//        System.out.println(fact);
    }
}