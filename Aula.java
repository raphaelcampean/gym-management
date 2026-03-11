import java.util.ArrayList;

public class Aula {
    private Instrutor instrutor;
    private ArrayList<Aluno> alunos;
    private String horario;
    private boolean aulaRealizada;

    public Aula(Instrutor instrutor, ArrayList<Aluno> alunos, String horario) {
        this.instrutor = instrutor;
        this.alunos = alunos;
        this.horario = horario;
        this.aulaRealizada = false;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public ArrayList<Aluno> getAluno() {
        return alunos;
    }

    public void setAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isAulaRealizada() {
        return aulaRealizada;
    }

    public void realizarAula() {
        if (!aulaRealizada) {
            this.aulaRealizada = true;
            System.out.println("Aula realizada com sucesso! Instrutor: " + instrutor.getNome() + ", Horário: " + horario);
            instrutor.ministrarAula();
            for (Aluno a : alunos) {
                a.realizarAula();
            }
        } else {
            System.out.println("Aula já foi realizada.");
        }
    }
}
