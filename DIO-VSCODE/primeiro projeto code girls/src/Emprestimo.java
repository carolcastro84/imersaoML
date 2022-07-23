public class Emprestimo {
    
    private static double getTaxaJuros(int parcelas){
        if (parcelas > 5){
            return 1.25;
        }

        return 1.15;
    }
    public static void calcular(double valor, int parcelas){
        System.out.println("O Valor solicitado sera " + valor + ", pago em um total financiado de: " + (valor * getTaxaJuros(parcelas)));
    }
}
