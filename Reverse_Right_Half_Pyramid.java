public class Reverse_Right_Half_Pyramid {
    public static void main(String[] args) {
        for (int i=5; i>=1; i--) {  //printing 5 stars and decrementing by 1 in each row.
            for (int j=1; j<=i; j++) { //printing columns.
                System.out.print("* "); //printing stars with space.
            }
            System.out.println(); //taking curser to the nextline.
        }
    }
}
