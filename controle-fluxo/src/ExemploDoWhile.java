import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("DISCANDO...");
        do {
            //executando repetidas vezes até alguém atender
            System.out.println("TELEFONE TOCANDO");

        }while(tocando());

        System.out.println("ALÔ !!!");   
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("ATENDEU? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
