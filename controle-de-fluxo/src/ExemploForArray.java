public class ExemploForArray {
    public static void main(String[] args) {

        //EXEMPLO DE UTILIZAÇÃO DE FOR USANDO ARRAYS:
        String alunos [] = {"PEDRO", "FERNANDA", "MARCELO", "LUARA" , "COUTINHO", "JOTINHA"};
        for (int x=0; x <alunos.length; x++)
        {
            System.out.println("O aluno do índice x = " + x + " é " + alunos [ x ]);
        }

        System.out.println("Todos os " + alunos.length + " alunos foram contados.");
    }
}