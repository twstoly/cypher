import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cypher {
    public static void main(String[] args) throws IOException {

//        Getting the input from the terminal using Buffered reader with the help of InputStreamReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        Using console terminal to stop the loop.
        System.out.println("Choose the functionality you would like to perform .. \n\t 1. Encryption. \n\t 2. Decryption. \n\t 3. Change Options \n\t 4. Exit");

//        QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD

//        Storing the value from the terminal in a string variable

        String selectedChoice;
        do {
            selectedChoice = bufferedReader.readLine();
                if (selectedChoice.equals("1")) {
                    Encrypt encrypt = new Encrypt();

                    try {
                        System.out.println("Enter the values that you want to encrypt. . . ");
                        String terminalTextValue = bufferedReader.readLine();

                        System.out.println();
                        System.out.println("Enter key value that will help to encrypt. . .");

//            Passing the value from the terminal to our encryptionMaster method as a parameter.
                        String terminalKeyValue = bufferedReader.readLine();

//            converting the key value from the terminal into an integer
                        int integerKeyValue = Integer.parseInt(terminalKeyValue);

                        String encryptedText = encrypt.encryptionMaster(terminalTextValue, integerKeyValue);

                        System.out.println(encryptedText);

                        System.out.println("Choose the functionality you would like to perform .. \n\t 1. Encryption. \n\t 2. Decryption. \n\t 3. Change Options \n\t 4. Exit");
                    } catch (IOException exc) {
                        System.out.println(exc.getMessage());
                    }
                } else if (selectedChoice.equals("2")) {
                    Decrypt decrypt = new Decrypt();

                    try {
                        System.out.println("Enter the values that you want to decrypt. . . ");
                        String terminalTextValue = bufferedReader.readLine();

                        System.out.println();
                        System.out.println("Enter key value that will help to decrypt. . .");

//            Passing the value from the terminal to our encryptionMaster method as a parameter.
                        String terminalKeyValue = bufferedReader.readLine();

//            converting the key value from the terminal into an integer
                        int integerKeyValue = Integer.parseInt(terminalKeyValue);

                        String encryptedText = decrypt.decryptionMaster(terminalTextValue, integerKeyValue);

                        System.out.println(encryptedText);

                        System.out.println("Choose the functionality you would like to perform .. \n\t 1. Encryption. \n\t 2. Decryption. \n\t 3. Change Options \n\t 4. Exit");
                    } catch (IOException exc) {
                        System.out.println(exc.getMessage());
                    }
                } else if (selectedChoice.equals("3")) {
                    System.out.println("Choose the functionality you would like to perform .. \n\t 1. Encryption. \n\t 2. Decryption. \n\t 3. Change Options \n\t 4. Exit");
                }
        } while (!selectedChoice.equals("4"));

    }
}











































































