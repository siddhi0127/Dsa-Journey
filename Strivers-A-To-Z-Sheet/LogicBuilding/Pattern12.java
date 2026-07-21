public class Pattern12 {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 1; i <= n; i++) { // Loop for rows
            
            // 1. Prints the increasing number sequence
            for (int j = 1; j <= i; j++) { 
                System.out.print(j);
            }
            
            // 2. Prints the required spacing between numbers
            for (int k = 1; k <= 2 * (n - i); k++) { 
                System.out.print(" ");
            }
            
            // 3. Prints the decreasing number sequence
            for (int j = i; j >= 1; j--) { 
                System.out.print(j);
            }
            
            // Moves to the next line
            System.out.println(); 
        }
    }
}