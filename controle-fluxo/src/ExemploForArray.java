public class ExemploForArray {
    public static void main(String[] args) {


        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCUS" };

        // Forma abreviada
        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

        
        // em arrays o indice inicia em 0
        // String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCUS" };

        // for ( int x=0; x < alunos.length; x++) {
        //     System.out.println("O aluno no indice x= " + x + " é " + alunos [ x ]);
        // }
        
    }
}
