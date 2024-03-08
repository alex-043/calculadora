public class Resta {

    private double num;
    private double num2;

    public static double Resta(double num, double num2){
        double resultado = num - num2;
        return resultado;
    }

    @Override
    public String toString(){
        return "Resta: " + (num - num2);
    }
}
