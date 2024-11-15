import java.util.Scanner;
import java.io.File;

public class Q3 {
    public static void main(String[] args) {

        Frame frame1 = new Frame('*', '-');
        Frame frame2 = new Frame('#', '+');
        Picture picture1 = new Picture("picture1.txt");
        Picture picture2 = new Picture("picture2.txt");
        frame1.setPicture(picture1);
        frame2.setPicture(picture2);
        frame1.print();
        frame2.print();
        System.out.println("------------swap----------------");
        frame1.setPicture(picture2);
        frame2.setPicture(picture1);
        frame1.print();
        frame2.print();
        System.out.println("----------set null--------------");
        frame1.setPicture(null);
        frame1.print();
    }
}
/** Expected Output
************
-          -
-     *    -
-    +*    -
-     o    -
-    o    +-
-          -
-          -
-    +     -
************
############################
+O     O           ,       +
+  o o          .:/        +
+    o      ,,///;,   ,;/  +
+      o   o)::::::;;///   +
+         >::::::::;;\\\   +
+           ''\\\\\'" ';\  +
+              ';\         +
+                          +
############################
------------swap----------------
****************************
-O     O           ,       -
-  o o          .:/        -
-    o      ,,///;,   ,;/  -
-      o   o)::::::;;///   -
-         >::::::::;;\\\   -
-           ''\\\\\'" ';\  -
-              ';\         -
-                          -
****************************
############
+          +
+     *    +
+    +*    +
+     o    +
+    o    ++
+          +
+          +
+    +     +
############
----------set null--------------
No picture to print

 */