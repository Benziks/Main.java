package Classes;

public class Cilinder extends Circle {
    private int h;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        if(h >= 1){
            this.h = h;
        }
        else{
            this.h = 1;
        }
    }

    public Cilinder(int r, int h) {
        super(r);
        this.setH(h);
    }

    public double getS(){
        return (2*super.getS()) + (2*pi*this.getR() * this.getH());
    }

    public double getV(){
        return super.getS() * this.getH();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", h= " + this.getH() +
                ", V= " + this.getV();
    }
}
