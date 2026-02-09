package patterns.number;

public class N4 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = rows - 1; j > i; j--) {
                System.out.print("  ");
            }
            int printVal = rows - i;
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(" " + printVal + "  ");
            }
            System.out.println();
        }
    }
}
