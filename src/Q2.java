import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.print("Entrada: ");
        String input = new Scanner(System.in).next();
        int charsToAdd = 0;
        boolean addSpecialChar = true;
        boolean addNumber = true;
        boolean addUpper = true;
        boolean addLower = true;
        char[] specialChar = {'!','@','#','$','%','^','&','*','(',')','-','+'};

        for (char character : input.toCharArray()) {
            for (char c : specialChar) {
                if (c == character) {
                    addSpecialChar = false;
                    break;
                }
            }
            if(Character.isDigit(character)) addNumber = false;
            if(Character.isUpperCase(character)) addUpper = false;
            if(Character.isLowerCase(character)) addLower = false;
        }

        if(addSpecialChar) charsToAdd++;
        if(addNumber) charsToAdd++;
        if(addUpper) charsToAdd++;
        if(addLower) charsToAdd++;

        if (input.length() + charsToAdd < 6){
            charsToAdd = 6 - (input.length() + charsToAdd) + charsToAdd;
        }

        System.out.println("Saida: " + charsToAdd);
    }
}
