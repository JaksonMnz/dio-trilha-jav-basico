import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        //criando o objeto scanner
        Scanner iscanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = iscanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = iscanner.next();

        System.out.println("Digite sua idade");
        int idade = iscanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = iscanner.nextDouble();


        // String nome = args [0];
        // String  sobrenome = args [1];
        // int idade = Integer.valueOf(args[2]);
        // double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
    }
}
