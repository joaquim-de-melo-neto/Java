import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PhoneNumberCombinations {
    private static final String[] MAPPING = {
            "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
    };

    public static void main(String[] args) {
        int[] phoneNumber = {2, 3, 4, 5, 6, 7, 8}; // Número de telefone de sete dígitos

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("combinations.txt");
            PrintStream printStream = new PrintStream(fileOutputStream);

            generateCombinations(phoneNumber, 0, new StringBuilder(), printStream);

            printStream.close();
            fileOutputStream.close();

            System.out.println("As combinações foram gravadas no arquivo combinations.txt.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao gravar as combinações no arquivo.");
            e.printStackTrace();
        }
    }

    private static void generateCombinations(int[] phoneNumber, int index, StringBuilder combination, PrintStream printStream) {
        if (index == phoneNumber.length) {
            printStream.println(combination.toString());
            return;
        }

        int digit = phoneNumber[index];
        String mapping = MAPPING[digit];

        for (int i = 0; i < mapping.length(); i++) {
            char letter = mapping.charAt(i);
            combination.append(letter);
            generateCombinations(phoneNumber, index + 1, combination, printStream);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
