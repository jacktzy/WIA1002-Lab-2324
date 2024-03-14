package Lab1.Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Q2a {
    public static void main(String[] args) {
        try {
            String fileName = "src/Lab1/Q2/text1.txt";
            FileReader fileReader = new FileReader(fileName);
            BufferedReader inputStream = new BufferedReader(fileReader);
            System.out.println("Reading from file: " + fileName);

            String line;
            int counter = 0;
            while ((line = inputStream.readLine()) != null) {
                System.out.println("\nLine " + (counter++ + 1) + " is: " + line);

                // Approach 1: use StringTokenizer
                System.out.println("Approach 1: using StringTokenizer");
                StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
                int count1 = 0;
                while (stringTokenizer.hasMoreElements()) {
                    System.out.println(stringTokenizer.nextElement());
                    count1++;
                }
                System.out.println("Number of characters: " + count1);

                // Approach 2: use split method
                System.out.println("Approach 2: using split method");
                String[] chars = line.split(",");
                int count2 = chars.length;
                for (String s : chars) {
                    System.out.println(s);
                }
                System.out.println("Number of characters: " + count2);
            }

            inputStream.close();
        } catch (Exception e) {
            System.out.println("Error while reading file: " + e);
        }

    }
}
