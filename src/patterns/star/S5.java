package patterns.star;

public class S5 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i < rows + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = rows - i + 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
