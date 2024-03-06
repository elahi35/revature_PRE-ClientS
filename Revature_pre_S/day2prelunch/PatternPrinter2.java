
public class PatternPrinter2 {
    public static void main(String[] args) {
        
        int rows = 4;

        
        for (int i = rows; i >= 1; i--) {
           
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
        
            System.out.println();
        }
    }
}
