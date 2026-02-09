package patterns.number;

public class N6 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
