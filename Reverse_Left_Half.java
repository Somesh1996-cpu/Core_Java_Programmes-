public class Reverse_Left_Half {
        public static void main(String[] args) {
            for (int i=5; i>=1; i--) {
                for (int j=1; j<=5-i; j++) {
                    System.out.print("  "); // Firstly, printing spaces from the outer-loop.
                }
                for (int k=1; k<=i; k++) {
                    System.out.print("* "); // Printing stars and spaces from the inner-loop.
                }
                System.out.println(); // taking curser to the nextline after printing stars and spaces.
            }
        }
    }
