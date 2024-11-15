package q1;

public class A1 {
    private String x;
    public A1(){
        this("");
    }
    public A1(String x){
        this.x = x;
    }
    public A1(A1 OrgX){
        this.x = OrgX.x;
    }
    public String toString(){
        return x;
    }
}
