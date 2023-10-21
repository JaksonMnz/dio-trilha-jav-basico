package escola;

public class Escola {
    public static void main(String[] args) {
      Aluno felipe = new Aluno();

      felipe.setNome("felipe jose");
      felipe.setIdade(17);
      felipe.setSexo("masculino");
    //   felipe.setNome("felipe junior");
    //   felipe.setIdade(12);

      System.out.println("o aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos" + " e é do sexo " + felipe.getSexo());
    }
}