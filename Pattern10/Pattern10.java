public class Pattern10 {
    public static void main(String args[]) {
        int n = 5;
        
        
        //upper left
        for(int i = 1; i<=n; i++){
            //1st half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces print
            //spaces = 2 * n-i;
            for(int j = 1; j<=(2*(n-i)); j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i = n; i>=1; i--){
            //1st half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces print
            //spaces = 2 * n-i;
            for(int j = 1; j<=(2*(n-i)); j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
