public class ArrayExercise {
    public static void main(String[] arg) {
        new ArrayExercise().runApp();
    }
    /**
     * Complete the task in part1, part2, part3 and part4
     */
    void runApp() {
        System.out.println("Part 1:");
        part1();
        System.out.println("Part 2:");
        part2();
        System.out.println("Part 3:");
        part3();
        System.out.println("Part 4:");
        part4();
    }

    /** 
     * Given two arrays of char, create a new array that joins the two arrays one after another.
     */
    void part1() {
        char[] a = {'a', 'b', 'c'};
        char[] b = {'d', 'e', 'f', 'g'};
        char[] c; //it should = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        //TODO
        c = new char[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }  
        System.out.println(c);
    }

    /**
     * Given two array of the same size, create a new array that alternatively takes the elements from the two arrays.
     */
    void part2() {
        char[] a = {'a', 'b', 'c'};
        char[] b = {'d', 'e', 'f'};
        char[] c; //it should = {'a', 'd', 'b', 'e', 'c', 'f'};

        //TODO
        c = new char[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i * 2] = a[i];
            c[i * 2 + 1] = b[i];
        }
        System.out.println(c);
    }

    /**
     * Given an array of char, move the second half of the array to the first half. 
     */
    void part3() {
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f'};
        //it should be {'d', 'e', 'f', 'a', 'b', 'c'};

        //TODO
        for (int i = 0; i < a.length / 2; i++) {
            char temp = a[i];
            a[i] = a[a.length / 2 + i];
            a[a.length / 2 + i] = temp;
        }

        System.out.println(a);
    }

    /**
     * Turn part1 part2 and part3 into suitable methods according to the usage of the code.
     * You should not modify any part of part4
     */
    void part4() {
        char[] a = {'a', 'b', 'c'};
        char[] b = {'d', 'e', 'f', 'g'};
        char[] c = join(a, b);
        System.out.println(c); //it should = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        char[][] d = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
        c = alternate(d);
        System.out.println(c); //it should = {'a', 'd', 'b', 'e', 'c', 'f'};

        char[] e = {'a', 'b', 'c', 'd', 'e', 'f'};
        move(e);
        System.out.println(e); //it should be {'d', 'e', 'f', 'a', 'b', 'c'};
    }

    char[] join(char[] a, char[] b) {
        char[] c = new char[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }  
        return c;
    }
    
    char[] alternate(char[][] d) {
        char[] c = new char[d[0].length + d[1].length];
        for (int i = 0; i < d[0].length; i++) {
            c[i * 2] = d[0][i];
            c[i * 2 + 1] = d[1][i];
        }
        return c;
    }

    void move(char[] e) {
        for (int i = 0; i < e.length / 2; i++) {
            char temp = e[i];
            e[i] = e[e.length / 2 + i];
            e[e.length / 2 + i] = temp;
        }
    }
}
