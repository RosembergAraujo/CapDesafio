package Desafio2;
import java.util.Scanner;

public class Q3D2 {

    public static void main(String[] args) {
        System.out.print("Entrada: ");
        String stringInput = new Scanner(System.in).nextLine().replace(" ", "");
        int size = (int) Math.ceil(Math.sqrt(stringInput.length()));
        char[][] matrix = new char[size][size];

        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(counter < stringInput.length()) matrix[i][j] = stringInput.charAt(counter);
                else matrix[i][j] = ' ';
                counter++;
            }
        }
        System.out.print("Saida: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.print(" ");
        }

    }
}
