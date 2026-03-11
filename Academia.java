import java.util.ArrayList;

public class Academia {
    private ArrayList<Aluno> alunos;
    private ArrayList<Instrutor> instrutores;
    private ArrayList<Aula> aulas;
    private ArrayList<Plano> planos;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Academia(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.alunos = new ArrayList<>();
        this.instrutores = new ArrayList<>();
        this.aulas = new ArrayList<>();
        this.planos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.matricular();
        System.out.println("Aluno " + aluno.getNome() + " matriculado com sucesso!");
    }

    public void adicionarInstrutor(Instrutor instrutor) {
        instrutores.add(instrutor);
        System.out.println("Instrutor " + instrutor.getNome() + " adicionado com sucesso!");
    }

    public void adicionarAula(Aula aula) {
        aulas.add(aula);
        System.out.println("Aula adicionada com sucesso!");
    }

    public void adicionarPlano(Plano plano) {
        planos.add(plano);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Instrutor> getInstrutores() {
        return instrutores;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public ArrayList<Plano> getPlanos() {
        return planos;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}
