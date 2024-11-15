package PTest1;// This is a solution of PTest 1.
// You can use this for your PTest 2 if you think it is releveant.

import java.util.Scanner;
import java.io.File;
/**
 * Complete the required method below. Don't change the runApp or main method
 * 
 * Each method worth 10%, total 30%
 * 
 * Expected running result:
There are 10 rows in the file.
The size of picture is: 8 by 10
Printing the picture out!

     *
    +*
     o
    o    +


    +

Print the picture with a different frame!
oooooooooooo
+          +
+     *    +
+    +*    +
+     o    +
+    o    ++
+          +
+          +
+    +     +
oooooooooooo

Print the picture with a different frame!
************
u          u
u     *    u
u    +*    u
u     o    u
u    o    +u
u          u
u          u
u    +     u
************



-------------------------------------



There are 10 rows in the file.
The size of picture is: 8 by 26
Printing the picture out!
O     O           ,
  o o          .:/
    o      ,,///;,   ,;/
      o   o)::::::;;///
         >::::::::;;\\\
           ''\\\\\'" ';\
              ';\


Print the picture with a different frame!
oooooooooooooooooooooooooooo
+O     O           ,       +
+  o o          .:/        +
+    o      ,,///;,   ,;/  +
+      o   o)::::::;;///   +
+         >::::::::;;\\\   +
+           ''\\\\\'" ';\  +
+              ';\         +
+                          +
oooooooooooooooooooooooooooo

Print the picture with a different frame!
****************************
uO     O           ,       u
u  o o          .:/        u
u    o      ,,///;,   ,;/  u
u      o   o)::::::;;///   u
u         >::::::::;;\\\   u
u           ''\\\\\'" ';\  u
u              ';\         u
u                          u
****************************



-------------------------------------



There are errors in reading the file: nosuchfile.txt
Invalid file format
 */
public class Picture {
    public static void main(String[] args) {
        new Picture().runApp("picture1.txt");
        System.out.println("\n\n\n-------------------------------------\n\n\n");
        new Picture().runApp("picture2.txt");
        System.out.println("\n\n\n-------------------------------------\n\n\n");
        new Picture().runApp("nosuchfile.txt");
    }

    /**
     * This method is to compute the number of rows in the given file.
     * There should be 10 rows in the given file picture1.txt
     */
    int numberOfRows(String filename) {
        int i = 0;
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                i++;
                scanner.nextLine(); //many student miss this one
            }
        } catch (Exception e) {
            System.out.println("There are errors in reading the file: " + filename);
        }
        return i;
    }

    /**
     * This method is to read the picture from the given file and return the picture.
     * You will need to exclude the frame of the picture.
     * There is always a frame given in the picture file. 
     * The frame is always a rectangle, with one character wide.
     * The returned array must be rectangular, i.e. each row has the same length. 
     * 
     * When there is a file reading error, return null.
     */
    char[][] readData(String filename) {
        
        try (Scanner scanner = new Scanner(new File(filename))) {
           
            int totalRow = numberOfRows(filename) - 2; //-2 because removing the top and bottom of the frame
            char[][] result = new char[totalRow][];
            scanner.nextLine(); //skip one line on purpose
            for (int row = 0; row < totalRow; row++) {
                String line = scanner.nextLine();
                result[row] = new char[line.length() - 2];
                for (int i = 0; i < line.length() - 2; i++)  //always play your loop from 0, easier for everyone
                    result[row][i] = line.charAt(i + 1);   //+1 to skip the left frame
            }
            return result;
        } catch (Exception e) {
            System.out.println("Error reading lines");
            return null;
        }
    }
    /**
     * This method is to print the picture with the given frame characters.
     * @rowChar refers to the character used to print the top and bottom frame.
     * @colChar refers to the character used to print the left and right frame.
     * 
     * Suppose your rowChar is -, colChar is |, then a picture with frame will be printed as:
     * 
     -----------
     |         |
     |    **** |
     | **+*    |
     |    o    |
     |   ov vv+|
     ----------- 
     *
     * Noted that the four corners of rectangle should be the rowChar.
     */
    void printPicture(char[][] picture, char rowChar, char colChar) {
        for (int i = 0; i < picture[0].length + 2; i++) //top row
            System.out.print(rowChar);
        System.out.println();

        for (int i = 0; i < picture.length; i++) {
            System.out.print(colChar);
            System.out.print(picture[i]);  //print a row. Printing a char array is the same as printing it using a loop
            System.out.println(colChar);
        }


        for (int i = 0; i < picture[0].length + 2; i++) //bottom row
            System.out.print(rowChar);
        System.out.println();
    }
    void runApp(String filename) {
        int row = numberOfRows(filename);
        if (row <= 1) {
            System.out.println("Invalid file format");
            return;
        }
        System.out.printf("There are %d rows in the file.\n", numberOfRows(filename));
        char[][] picture = readData(filename);
        System.out.printf("The size of picture is: %d by %d\n", picture.length , picture[0].length);
        System.out.println("Printing the picture out!");        
        for (int i = 0; i < picture.length; i++) 
            System.out.println(picture[i]);

        System.out.println("\nPrint the picture with a different frame!");
        printPicture(picture, 'o', '+');
        System.out.println("\nPrint the picture with a different frame!");
        printPicture(picture, '*', 'u');

    }
}