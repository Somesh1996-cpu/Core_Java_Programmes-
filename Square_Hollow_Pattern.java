public class Square_Hollow_Pattern {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            for (int j=1; j<=N; j++) {
                if (i == 1 || i == 5 || j == 1 || j ==5) { // 5*5 Pattern targeting stars condition.
                    System.out.print("* "); // printing stars.
                }
                else {
                     System.out.print("  "); // printing spaces.
                     }
                }
            System.out.println(); //taking curser to the nextline.
           }
       }
    }
