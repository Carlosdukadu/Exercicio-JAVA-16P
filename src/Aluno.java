public class Aluno {
    //Parte A
    private String nome;
    private String sobrenome;
    private int codigoDealuno;






    //Construtor
    public Aluno(String nome, String sobrenome, int codigoDealuno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoDealuno = codigoDealuno;
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

    public int getCodigoDealuno() {
        return codigoDealuno;
    }

    public void setCodigoDealuno(int codigoDealuno) {
        this.codigoDealuno = codigoDealuno;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", codigoDealuno=" + codigoDealuno;
    }
}
