import java.util.Objects;

public class Professor {
    private String nome;
    private String sobrenome;
    private int tempoDeCasa;
    private int codigoDeProfessor;



    //Método


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return codigoDeProfessor == professor.codigoDeProfessor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDeProfessor);
    }

    //Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getCodigoDeProfessor() {
        return codigoDeProfessor;
    }

    public void setCodigoDeProfessor(int codigoDeProfessor) {
        this.codigoDeProfessor = codigoDeProfessor;
    }
}
