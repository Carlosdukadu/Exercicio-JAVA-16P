public class Main{
    
    public static void main(String[] args) {
        Aluno alunoCarlos = new Aluno("Carlos", "Eduardo", 2020);
        Aluno alunoJoao = new Aluno("João", "Eduardo", 2020);
        Aluno alunoEduardo = new Aluno("Eduardo", "Teixeira", 2020);
        Curso cursoJAVA = new Curso("Curso de JAVA", 4, 30);

        cursoJAVA.adicionarUmAluno(alunoCarlos);
        cursoJAVA.adicionarUmAluno(alunoEduardo);
        cursoJAVA.adicionarUmAluno(alunoJoao);


        cursoJAVA.excluirAluno(alunoCarlos);

        for (Aluno aluno : cursoJAVA.alunosMatriculados) {
            System.out.println(aluno);
        }

        cursoJAVA.alunosMatriculados.forEach( aluno -> System.out.println(aluno));
    }
}

