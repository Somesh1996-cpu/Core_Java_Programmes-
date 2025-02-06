public class Right_Half_Pyramid_Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // row condition
            for (int j = 1; j <= i; j++) { // column printing
                System.out.print("* "); // incrementing the stars by 1 in each row as long as the condition is true.
            }
            System.out.println(); //taking curser to nextline after printing stars.
        }
    }
}
