public class Suma {

    private double num;
    private double num2;

    public Suma(double num, double num2){
        this.num = num;
        this.num2 = num2;
    }

    public void setNum(double num) {
        this.num = num;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum() {
        return num;
    }

    public double getNum2() {
        return num2;
    }

    @Override
    public String toString(){
        return "Suma: " + (num + num2);
    }

}
