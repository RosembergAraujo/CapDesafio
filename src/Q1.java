import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.print("Entrada: ");
        int n = Integer.parseInt(new Scanner(System.in).next());
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= 0; j--) {
                char s = j > i ? ' ' : '*';
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
