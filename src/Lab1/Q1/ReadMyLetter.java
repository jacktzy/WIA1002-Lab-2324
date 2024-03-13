package Lab1.Q1;

import java.io.*;
import java.util.Scanner;

public class ReadMyLetter {

    public static void main(String[] args) {

        // Part 1

        // Name of the file
        String fileName = "src/Lab1/Q1/ZiYang_U2102745.txt";

        try {
            /*
             * Read first part of the letter from text file
             */

//            // METHOD 1: USING SCANNER
//
//            // Create object of FileInputStream
//            FileInputStream fileInputStream = new FileInputStream(fileName);
//
//            // Create object of Scanner
//            Scanner inputStream = new Scanner(fileInputStream);
//
//            // Read file line by line and print each line on the console
//            while (inputStream.hasNextLine()) {
//                System.out.println(inputStream.nextLine());
//            }
//
//            // Close the scanner
//            inputStream.close();

            // METHOD 2: USING FILEREADER
            // Create object of FileReader
            FileReader fileReader = new FileReader(fileName);

            // Create BufferedReader object with fileReader object
            BufferedReader inputStream = new BufferedReader(fileReader);

            // Variable to hold the one line data
            String line;

            // Read file line by line and print on the console
            while ((line = inputStream.readLine()) != null) {
                System.out.println(line);
            }

            // Close the bufferedReader
            inputStream.close();

            // PART 2
            /*
             * Read the second part of the letter from user input, and write to the text file
             */
            Scanner input = new Scanner(System.in);

            System.out.println("\n\nEnter your second part of your letter: ");
            String inputStr = input.nextLine();

//            // METHOD 1: USING PRINTWRITER
//            // Create FileOutputStream object
//            FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
//
//            // Create PrintWrite object
//            PrintWriter outputStream = new PrintWriter(fileOutputStream);
//
//            // Write the input string into the text file
//            outputStream.println(inputStr);
//
//            // Close the PrintWriter
//            outputStream.close();

            // METHOD 2: USING BUFFEREDWRITER
            // Create FileWriter object
            FileWriter fileWriter = new FileWriter(fileName, true);

            // Create BufferedWriter object
            BufferedWriter outputStream = new BufferedWriter(fileWriter);

            // Write the input string into the text file
            outputStream.write(inputStr);

            // Close the BufferedWriter
            outputStream.close();

            /*
             * Read the first and second part of the letter from text file
             */
            FileInputStream fileInputStream = new FileInputStream(fileName);
            Scanner inputStreamAfterAppend = new Scanner(fileInputStream);

            System.out.println("\nYour complete letter: ");
            while (inputStreamAfterAppend.hasNextLine()) {
                System.out.println(inputStreamAfterAppend.nextLine());
            }

            inputStreamAfterAppend.close();

        } catch (Exception e) {
            System.out.println("Error while reading file: " + e);
        }
    }
}

/*
My name is Zi Yang with matrix number, UXXXXXXX. I am
majoring in Software Engineering. This is my first time taking the
Data Structure subject. At the moment, I am feeling happy about taking this
subject. This is because I am quite interested to know more about data structure.
I acquired A for my previous Programming 1 course. It’s not too bad. So, I
think I can manage to get A for this DS subject this term. In order
to do well in the subject, I will study hard. Wish me luck!!!

 */
