package patterns.number;
//    5
//   44
//  333
// 2222
//11111
// 2222
//  333
//   44
//    5

public class N3 {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            int print_val = row - i + 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(print_val + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= row - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            int print_val = i + 1;
            for (int j = 1; j <= row - i; j++) {
                System.out.print(print_val + " ");
            }
            System.out.println();
        }
    }
}
