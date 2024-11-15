import PTest1.Picture;
public class Cabbage extends Plant{
    public Cabbage(){
        super();
        System.out.println(this + " is plannted");
    }

    @Override
    public void growth() {
        if(getLength() < 5)
            super.growth();
    }

    @Override
    public String toString() {
        return "Cabbage " + super.toString();
    }
}
