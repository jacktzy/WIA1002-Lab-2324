package Lab1.Q2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadCharacters {
    public static void main(String[] args) {
        String[] fileNameArray = {
                "src/Lab1/Q2/text1.txt",
                "src/Lab1/Q2/text2.txt",
                "src/Lab1/Q2/text3.txt",
                "src/Lab1/Q2/text4.txt",
        };
        //text1.txt (character separated by comma)
        //text2.txt (numbers separated by comma and space)
        //text3.txt ((real numbers separated by semicolon and space)
        //text4.txt (alphabets separated by numbers)
        String[] delimiterArray = {",", ", ", "; ", "\\d+"};

        for (int i = 0; i < fileNameArray.length; i++) {
            System.out.println("Reading from text file: " + fileNameArray[i]);
            try {
                FileInputStream fileInputStream = new FileInputStream(fileNameArray[i]);
                Scanner inputStream = new Scanner(fileInputStream);
                while (inputStream.hasNextLine()) {
                    String line = inputStream.nextLine();
                    System.out.println("Line is " + line);
                    if (i == 3) {
                        splitApproach(line, delimiterArray[i]);
                    } else {
                        tokenizerApproach(line, delimiterArray[i]);
                    }
                }
                fileInputStream.close();
            } catch (Exception e) {
                System.out.println("Error while reading file: " + e);
            }
        }
    }

    public static void tokenizerApproach(String s, String delimiter) {
        System.out.println("Split using StringTokenizer: ");
        StringTokenizer st = new StringTokenizer(s, delimiter);
        int tokenCount = 0;
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
            tokenCount++;
        }
        System.out.println("Number of elements: " + tokenCount + " \n");
    }

    public static void splitApproach(String s, String delimiter) {
        System.out.println("Split using split method: ");
        String[] tokens = s.split(delimiter);
        int tokenCount = tokens.length;
        for (int i = 0; i < tokenCount; i++) {
            System.out.println(tokens[i]);
        }
        System.out.println("Number of elements: " + tokenCount + "\n");
    }
}
