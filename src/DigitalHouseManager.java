import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {


    List<Professor> professorList = new ArrayList<>();
    List<Curso> cursoList = new ArrayList<>();
    List<Matricula> matriculaList = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoDoCurso, Integer quantidadeMaximaDeAlunos){
        Curso curso = new Curso(nome, codigoDoCurso, quantidadeMaximaDeAlunos);
        cursoList.add(curso);
    }

    public void excluirCurso(Integer codigoCurso){
        cursoList.remove(codigoCurso);
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer coidigoProfessor, Integer quantidadeDeHoras){
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(50)
    }


}
