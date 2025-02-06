import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the Number 1: ");
        double num1 = scan.nextDouble();
        System.out.print("Please enter the Number 2: ");
        double num2 = scan.nextDouble();
        System.out.print("Please enter the Operator: ");
        System.out.println("(+) for Addition, (-) for Subtraction, (*) for Multiplication & (/) for Division");
        char input = scan.next().charAt(0);
        scan.close();

        switch (input) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid Operator!");
        }
    }
}
