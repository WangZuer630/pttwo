import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Complete the required method below. Don't change the runApp or main method.
 *
 * Each method worth 10%, total 30%
 *
 * Expected running result:
There are 9 rows in the picture1.txt file.
Print the picture!
           +...........
          ###..........
        =======........
         #####.........
         #####.........
      ###+++++###......
   ##+++++++++++++##...
 ##+               +##.
####               ####


Print the picture with its height doubled!
           +...........
           +...........
          ###..........
          ###..........
        =======........
        =======........
         #####.........
         #####.........
         #####.........
         #####.........
      ###+++++###......
      ###+++++###......
   ##+++++++++++++##...
   ##+++++++++++++##...
 ##+               +##.
 ##+               +##.
####               ####
####               ####


Print the picture with its width and height doubled!
                      ++......................
                      ++......................
                    ######....................
                    ######....................
                ==============................
                ==============................
                  ##########..................
                  ##########..................
                  ##########..................
                  ##########..................
            ######++++++++++######............
            ######++++++++++######............
      ####++++++++++++++++++++++++++####......
      ####++++++++++++++++++++++++++####......
  ####++                              ++####..
  ####++                              ++####..
########                              ########
########                              ########


------------------------------------------------------------------


There are 4 rows in the picture2.txt file.
Print the picture!
  ///||\\\\\\\
 *   o    o   *
 *     --     *
   **********


Print the picture with its height doubled!
  ///||\\\\\\\
  ///||\\\\\\\
 *   o    o   *
 *   o    o   *
 *     --     *
 *     --     *
   **********
   **********


Print the picture with its width and height doubled!
    //////||||\\\\\\\\\\\\\\
    //////||||\\\\\\\\\\\\\\
  **      oo        oo      **
  **      oo        oo      **
  **          ----          **
  **          ----          **
      ********************
      ********************


------------------------------------------------------------------


There are errors in reading the file: nosuchfile.txt
No output.

 */


public class Sketcher {
    public static void main(String[] args) {
        new Sketcher().runApp("picture1.txt");
        System.out.println("\n\n------------------------------------------------------------------\n\n");
        new Sketcher().runApp("picture2.txt");
        System.out.println("\n\n------------------------------------------------------------------\n\n");
        new Sketcher().runApp("nosuchfile.txt");
    }

    void runApp(String filename) {
        char[][] data = readData(filename);

        if (data == null) {
            System.out.printf("There are errors in reading the file: %s\n", filename);
            System.out.println("No output.");
            return;
        }
        System.out.printf("There are %d rows in the %s file.\n", data.length, filename);
        System.out.println("Print the picture!");
        print(data);

        data = doubleHeight(data);
        System.out.println("\n\nPrint the picture with its height doubled!");
        print(data);

        data = doubleWidth(data);
        System.out.println("\n\nPrint the picture with its width and height doubled!");
        print(data);

    }

    void print(char[][] data) {
        //TODO
        for (int i=0; i<data.length; i++) {
            for (int j=0; j<data[i].length; j++)
                System.out.print(data[i][j]);
            System.out.println();
        }
    }

    char[][] readData(String filename) {
        //TODO
        char[][] data = null;
        try {
            Scanner scanner = new Scanner(new File(filename));
            int r = Integer.parseInt(scanner.nextLine());

            data = new char[r][];
            for (int i=0; i<r; i++) {
                String line = scanner.nextLine();
                data[i] = new char[line.length()];
                for (int j=0; j<line.length();j++)
                    data[i][j] = line.charAt(j);
            }
        } catch (IOException ex) {
            return null;
        }
        return data;
    }

    char[][] doubleWidth(char[][] data) {
        //TODO
        char[][] result = new char[data.length][];
        for (int i=0; i<data.length; i++) {
            result[i] = new char[data[i].length * 2];
            for (int j=0; j<data[i].length; j++) {
                result[i][j*2] = data[i][j];
                result[i][j*2+1] = data[i][j];
            }
        }
        return result;
    }

    char[][] doubleHeight(char[][] data) {
        //TODO
        char[][] result = new char[data.length*2][];
        for (int i=0; i<data.length; i++) {
            result[i*2] = new char[data[i].length];
            result[i*2+1] = new char[data[i].length];
            for (int j=0; j<2; j++) {
                for (int k=0; k<data[i].length; k++) {
                    result[i*2+j][k] = data[i][k];
                }
            }
        }
        return result;
    }

}
