package Classes;

public class Circle {
    protected int r;
    final double pi = Math.PI;
    public int getR() {
        return r;
    }

    public void setR(int r) {
        if(r >= 1){
            this.r = r;
        }
        else{
            this.r = 1;
        }
    }

    public Circle(int r) {
        this.setR(r);
    }

    public double getS(){
        return pi*(r*r);
    }

    public double getL(){
        return 2*pi*r;
    }

    @Override
    public String toString() {
        return  this.getClass().getName().split("\\.")[1] +
                ", R= " + this.getR() +
                ", S=" + this.getS() +
                ", l= " + this.getL() +
                '}';
    }
}
