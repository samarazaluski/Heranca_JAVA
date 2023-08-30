import java.util.Arrays;

public class projeto_pessoa_teste {
    public static void main(String[] args) {
        pessoa p1 = new pessoa();
        aluno p2 = new aluno();
        professor p3 = new professor();
        funcionario p4 = new funcionario();

        p1.setNome("Samara");
        p2.setNome("Paolla");
        p3.setNome("Diogo");
        p4.setNome("Giulia");

        p1.setIdade(18);
        p2.setIdade(26);
        p3.setIdade(21);
        p4.setIdade(25);

        p1.setSexo("F");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


    }
}
