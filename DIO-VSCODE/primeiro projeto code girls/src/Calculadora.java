public class Calculadora {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        soma(5,1);
    }

    public static void soma(double numero1, double numero2){
        System.out.println("Soma: " + (numero1 + numero2));
    }

    public static void subtracao(double numero1, double numero2){
        System.out.println("Subtracao: " + (numero1 - numero2));
    }

    public static void multiplicacao(double numero1, double numero2){
        System.out.println("Multiplicacao: " + (numero1 * numero2));
    }

    public static void divisao(double numero1, double numero2){
        System.out.println("Divisao: " + (numero1 / numero2));
    }
}
