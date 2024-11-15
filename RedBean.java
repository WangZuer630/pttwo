public class RedBean extends Plant{
    private boolean isDie = false;

    public RedBean(){
        super();
        System.out.println(this + " is Plannted");
    }

    @Override
    public void growth() {
        if(getLength()< 8) {
            super.growth();
            super.growth();
        }
        else{
            isDie = true;
        }
    }

    @Override
    public int getLength() {
        if(isDie)
            return 0;
        return super.getLength();
    }

    @Override
    public String toString() {
        if(isDie){
            return "RedBean " + super.toString() + " is death";
        }
        return "RedBean " + super.toString();
    }
}
