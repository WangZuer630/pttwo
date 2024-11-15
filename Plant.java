import java.util.ArrayList;
import java.util.List;

public class Plant {
    private static int count = 0;
    private final int id;
    private int length;

    public void growth() {
        length++;
    }
    public Plant() {
        id = count++;
        length = 0;
    }
    public String toString() {
        return "ID: " + id;
    }
    public int getLength() {
        return length;
    }

    public static void main(String args[]) {
        List<Plant> array = new ArrayList<>();
        System.out.println("---------Day 1---------");
        array.add(new RedBean());
        array.add(new Cabbage());
        for (Plant p : array) {
            p.growth();
            System.out.println(p + " ; lenght = " + p.getLength());
        }
        System.out.println("---------Day 2---------");
        array.add(new RedBean());
        array.add(new Cabbage());
        for (Plant p : array) {
            p.growth();
            System.out.println(p + " ; lenght = " + p.getLength());
        }
        System.out.println("---------Day 3---------");
        for (Plant p : array) {
            p.growth();
            System.out.println(p + " ; lenght = " + p.getLength());
        }

        System.out.println("---------Day 4---------");
        for (Plant p : array) {
            p.growth();
            System.out.println(p + " ; lenght = " + p.getLength());
        }
        System.out.println("---------Day 5---------");
        for (Plant p : array) {
            p.growth();
            System.out.println(p + " ; lenght = " + p.getLength());
        }
        System.out.println("---------Day 6---------");
        for (Plant p : array) {
            p.growth();
            System.out.println(p + " ; lenght = " + p.getLength());
        }


    }
}

/** Expected Output
---------Day 1---------
RedBean ID: 0 is plannted
Cabbage ID: 1 is plannted
RedBean ID: 0 ; lenght = 2
Cabbage ID: 1 ; lenght = 1
---------Day 2---------
RedBean ID: 2 is plannted
Cabbage ID: 3 is plannted
RedBean ID: 0 ; lenght = 4
Cabbage ID: 1 ; lenght = 2
RedBean ID: 2 ; lenght = 2
Cabbage ID: 3 ; lenght = 1
---------Day 3---------
RedBean ID: 0 ; lenght = 6
Cabbage ID: 1 ; lenght = 3
RedBean ID: 2 ; lenght = 4
Cabbage ID: 3 ; lenght = 2
---------Day 4---------
RedBean ID: 0 ; lenght = 8
Cabbage ID: 1 ; lenght = 4
RedBean ID: 2 ; lenght = 6
Cabbage ID: 3 ; lenght = 3
---------Day 5---------
RedBean ID: 0 is death ; lenght = 0
Cabbage ID: 1 ; lenght = 5
RedBean ID: 2 ; lenght = 8
Cabbage ID: 3 ; lenght = 4
---------Day 6---------
RedBean ID: 0 is death ; lenght = 0
Cabbage ID: 1 ; lenght = 5
RedBean ID: 2 is death ; lenght = 0
Cabbage ID: 3 ; lenght = 5 
 
 */