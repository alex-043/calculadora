public class Suma {

    private double num;
    private double num2;

    public static double Suma(double num, double num2){
        double resultado = num + num2;
        return resultado;
    }


    @Override
    public String toString(){
        return "Suma: " + (num + num2);
    }

}
