public class Frame {
    private char rowChar;
    private char colChar;
    private Picture picture;

    public Frame(char rowChar,char colChar){
        this.rowChar = rowChar;
        this.colChar = colChar;
    }

    public void setPicture(Picture p){
        picture = p;
    }
    public void print(){
        if(picture == null)
            System.out.println("No picture to print");
        else {
            for (int i = 0; i < picture.getMap()[0].length + 2; i++) //top row
                System.out.print(rowChar);
            System.out.println();

            for (int i = 0; i < picture.getMap().length; i++) {
                System.out.print(colChar);
                System.out.print(picture.getMap()[i]);  //print a row. Printing a char array is the same as printing it using a loop
                System.out.println(colChar);
            }


            for (int i = 0; i < picture.getMap()[0].length + 2; i++) //bottom row
                System.out.print(rowChar);
            System.out.println();
        }
    }
}
