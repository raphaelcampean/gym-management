public class Aluno extends Pessoa {
    private String email;
    private int idAluno;
    private String numMatricula;
    private boolean matriculado;
    private Plano plano;
    private int aulasRealizadas;

    public Aluno(int idAluno, String nome, int idade, String sexo, String cpf, String email, String numMatricula, Plano plano, int aulasRealizadas) {
        super(nome, idade, sexo, cpf);
        this.idAluno = idAluno;
        this.email = email;
        this.numMatricula = numMatricula;
        this.matriculado = false;
        this.aulasRealizadas = 0;
        this.plano = plano;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAulasRealizadas() {
        return aulasRealizadas;
    }

    public void setAulasRealizadas(int aulasRealizadas) {
        this.aulasRealizadas = aulasRealizadas;
    }

    public void matricular() {
        if (!matriculado) {
            this.matriculado = true;
            System.out.println("Aluno " + getNome() + " matriculado com sucesso.");
        } else {
            System.out.println("Aluno " + getNome() + " já está matriculado.");
        }
    }

    public void cancelarMatricula() {
        if (matriculado) {
            this.matriculado = false;
            this.plano = null;
            System.out.println("Matrícula do aluno " + getNome() + " cancelada com sucesso.");
        } else {
            System.out.println("Aluno " + getNome() + " não está matriculado.");
        }
    }

    public double calcularValorMensal() {
        if (plano != null) {
            return plano.getValorMensal();
        }
        return 0.0;
    }

    public void realizarAula() {
        if (matriculado) {
            aulasRealizadas++;
            System.out.println("Aluno " + getNome() + " realizou uma aula. Total de aulas realizadas: " + aulasRealizadas);
        } else {
            System.out.println("Aluno " + getNome() + " não está matriculado e não pode realizar aulas.");
        }
    }
}
