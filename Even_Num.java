import java.util.Scanner;
public class Even_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number: " );
        int N = scan.nextInt();
        //Please print even numbers within the range of 1 to N
        int i = 1; // as given in the instruction starts from 1.
        while(i <= N) { // adding range to print even numbers only as long as the condition is true.
            if (i % 2 == 0) {
                System.out.println(i); //printing even number within the range.
            }
            i++; // incrementing the numbers from 1 to N
        }
    }
}