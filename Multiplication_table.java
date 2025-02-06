import java.util.Scanner;

public class Multiplication_table{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the Number: ");
        int Number = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(Number + " * " + i + " = " + (Number*i));
        }
    }
}
