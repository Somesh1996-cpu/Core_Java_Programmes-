public class Diamond_Pattern {
    public static void main(String[] args) {
        int N=5;
        for (int i=0; i<N; i++) {
            for (int j=N-1; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++) {
                System.out.print("* ");
            }
            for (int l=N-i; l>=0; l--){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int m=0; m<=3; m++) {
            for (int o=0; o<=m;o++) {
                System.out.print(" ");
            }
            for (int p=3; p>=m; p--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
