import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date dataDeMatricula;


    public Matricula(Aluno aluno, Curso curso, Date dataDeMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDeMatricula = new Date();
    }
}
