public class Resta {

    private double num;
    private double num2;

    public static double Resta(double num, double num2){
        double resultado = num - num2;
        return resultado;
    }
    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    @Override
    public String toString(){
        return "Resta: " + (num - num2);
    }
}
