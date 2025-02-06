import java.util.Scanner;

public class Odd_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number to print the odd_series number for the same: ");
        int User_Number = scan.nextInt();
        for (int i=1; i<=User_Number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
