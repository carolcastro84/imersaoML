import javax.lang.model.util.ElementScanner6;

public class Mensagem {
    public static void obterMensagem(int hora){
        System.out.print("Horari nformado: " + hora + " " );
        if(hora > 4 && hora < 13) {
            System.out.println("Bom dia!");
        }else if (hora >= 13 && hora < 20){
            System.out.println("Boa tarde!");
        }else {
            System.out.println("Boa noite!");
        }
    }
}
