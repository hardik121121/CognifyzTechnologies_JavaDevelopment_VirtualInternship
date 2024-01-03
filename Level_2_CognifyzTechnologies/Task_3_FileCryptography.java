package Level_2_CognifyzTechnologies;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3_FileCryptography {
    public static void main(String[] args) {
      try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            
            System.out.print("Choose operation (1 for encryption, 2 for decryption): ");
            int choice = Integer.parseInt(reader.readLine());

            
            System.out.print("Enter the file name or path: ");
            String fileName = reader.readLine();

    
            System.out.print("Enter the key (an integer): ");
            int key = Integer.parseInt(reader.readLine());

            
            if (choice == 1) {
                encryptFile(fileName, key);
            } else if (choice == 2) {
                decryptFile(fileName, key);
            } else {
                System.out.println("Invalid choice. Please choose 1 for encryption or 2 for decryption.");
            }

            System.out.println("Operation completed successfully!");

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void encryptFile(String fileName, int key) throws IOException {
        processFile(fileName, key, true);
    }

    private static void decryptFile(String fileName, int key) throws IOException {
        processFile(fileName, key, false);
    }

    private static void processFile(String fileName, int key, boolean encrypt) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(getOutputFileName(fileName, encrypt)))) {

            int ch;
            while ((ch = reader.read()) != -1) {
                char processedChar = (char) (encrypt ? (ch + key) : (ch - key));
                writer.write(processedChar);
            }
        }
    }

    private static String getOutputFileName(String fileName, boolean encrypt) {
        String prefix = encrypt ? "encrypted_" : "decrypted_";
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex == -1) {
            return prefix + fileName;
        } else {
            return fileName.substring(0, dotIndex) + "_" + prefix + fileName.substring(dotIndex + 1);
        }
    }
    
}
