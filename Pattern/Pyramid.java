
public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        // Default Pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}