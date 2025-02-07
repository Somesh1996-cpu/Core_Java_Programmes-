public class Diamond_Pattern {
    public static void main(String[] args) {
        int N=5;
        for (int i=0; i<N; i++) {  // Printing first 5 rows from the outer loop
            for (int j=N-1; j>=i; j--) {
                System.out.print(" ");  // Printing spaces from the inner-loop
            }
            for (int k=0; k<=i; k++) {  // Printing stars from the inner-loop
                System.out.print("* ");
            }
            System.out.println(); //taking curser to the nextline.
            }
         for (int m=0; m<=3; m++) {   //printing last 4 rows from the outerloop
            for (int o=0; o<=m;o++) {
                System.out.print(" ");  //printing spaces from the inner-loop
            }
            for (int p=3; p>=m; p--) {  //printing stars & spaces from the innerloop 
                System.out.print(" *");
            }
            System.out.println(); //taking curser to the nextline.
        }
    }
}


// Output as mentioned below.

     *       
    * *      
   * * *     
  * * * *    
 * * * * *   
  * * * *
   * * *
    * *
     *
