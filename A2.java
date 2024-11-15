package q1;

public class A2 extends A1{
    private static int y = 0;
    public A2(){
        super("Nie Jiayi");
        y++;
    }
    public static int getY(){
        return y;
    }

    @Override
    public String toString() {
        return "A2 " + super.toString();
    }
}
