package patterns.number;

public class N2 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
