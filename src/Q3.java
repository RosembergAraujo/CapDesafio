import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        System.out.print("Entrada: ");
        String stringInput = new Scanner(System.in).next();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < stringInput.length(); i++) {
            for (int j = i; j < stringInput.length(); j++) {
                char[] stringInputChars = stringInput.substring(i, j + 1).toCharArray();
                Arrays.sort(stringInputChars);
                String newString = new String(stringInputChars);
                if (map.containsKey(newString))
                    map.put(newString, map.get(newString) + 1);
                else
                    map.put(newString, 1);
            }
        }
        int counter = 0;
        for (String key : map.keySet()) {
            int n = map.get(key);
            counter += (n * (n - 1)) / 2;
        }
        System.out.println("Saida: " + counter);
    }
}
