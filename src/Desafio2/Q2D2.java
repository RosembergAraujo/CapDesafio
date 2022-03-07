package Desafio2;
import java.util.Scanner;

public class Q2D2 {
    public static void main(String[] args) {
        System.out.println("A entrada deve conter uma quantidade impar de elementos separados por virgula.\nExemplo: \"1,5,3,4,2\"\n");
        System.out.print("Entrada: ");
        String[] input = new Scanner(System.in).nextLine().replace(" ", "").split(",");
        System.out.print("X: ");
        int x = new Scanner(System.in).nextInt();

        int[] inputAsInt = new int[input.length];

        try {
            for (int i = 0; i < input.length; i++) {
                inputAsInt[i] = Integer.parseInt(input[i]);
            }
        }catch(Exception e) {
            System.out.println("Erro na conversão para inteiros");
        }
        finally {
            int counter = 0;
            for (int i: inputAsInt) {
                for (int j : inputAsInt) {
                    if (i - j == x) counter++;
                }
            }
            System.out.println("Saida: " + counter);
        }
    }
}
