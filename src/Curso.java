import java.util.ArrayList;
import java.util.List;

public class Curso{
    private String nomeDoCurso;
    private int codigoDeCurso;
    private int qtdMaximaDeAlunos;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;



//    private String professorTitular;
//    private String professorAdjunto;
//    private String quantidadeMaximaDeAlunos;

    List<Aluno> alunosMatriculados = new ArrayList<>();




    //Método
    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (this.alunosMatriculados.size() < 30) {
            alunosMatriculados.add(umAluno);
            System.out.println("Aluno " + umAluno.getNome() + " adicionado ao curso.");
            return true;
        } else {
            System.out.println("Não foi possivel adicionar um novo aluno, vagas não disponiveis.");
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
            alunosMatriculados.remove(umAluno);
            System.out.println("Aluno " + umAluno.getNome() + " removido.");
    }




    //Construtor
    public Curso(String nomeDoCurso, int codigoDeCurso, int qtdMaximaDeAlunos) {
        this.nomeDoCurso = nomeDoCurso;
        this.codigoDeCurso = codigoDeCurso;
        this.qtdMaximaDeAlunos = qtdMaximaDeAlunos;
        this.professorAdjunto = professorAdjunto;
        this.professorTitular = professorTitular;
    }



    //Get e Set
    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public int getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void setCodigoDeCurso(int codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }


    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public int getQtdMaximaDeAlunos() {
        return qtdMaximaDeAlunos;
    }

    public void setQtdMaximaDeAlunos(int qtdMaximaDeAlunos) {
        this.qtdMaximaDeAlunos = qtdMaximaDeAlunos;
    }




    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
