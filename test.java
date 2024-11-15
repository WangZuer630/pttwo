package q1;

public class test {
    public static void main(String[] args) {
        A1[] arr = new A1[3];
        arr[0] = new A1("A1-1");
        arr[1] = new A2();
        arr[2] = new A2();
        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
