package Desafio2;
import java.util.Arrays;
import java.util.Scanner;

public class Q1D2 {
    public static void main(String[] args) {
        System.out.println("A entrada deve conter uma quantidade impar de elementos separados por virgula.\nExemplo: \"9,2,1,4,6\"\n");
        System.out.print("Entrada: ");
        String[] input = new Scanner(System.in).nextLine().replace(" ", "").split(",");
        int[] inputAsInt = new int[input.length];

        try {
            for (int i = 0; i < input.length; i++) {
                inputAsInt[i] = Integer.parseInt(input[i]);
            }
        }catch(Exception e) {
            System.out.println("Erro na conversão para inteiros");
        }
        finally {
            if(input.length % 2 != 0){
                Arrays.sort(inputAsInt);
                System.out.println("Saida: " + inputAsInt[inputAsInt.length / 2]);
            }else {
                System.out.println("A quantidade de elementos deve ser impar");
            }
        }
    }
}