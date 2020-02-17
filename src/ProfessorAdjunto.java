public class ProfessorAdjunto extends Professor {
    private int horasDeMonitoria;




    //Get e Set
    public int getHorasDeMonitoria() {
        return horasDeMonitoria;
    }

    public void setHorasDeMonitoria(int horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }


    public ProfessorAdjunto(int horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }
}
