public class Instrutor extends Pessoa {
    private int idInstrutor;
    private String email;
    private String especialidade;
    private double salario;
    private int aulasMinistradas;

    public Instrutor(int idInstrutor, String nome, int idade, String sexo, String cpf, String email, String especialidade, double salario, int aulasMinistradas) {
        super(nome, idade, sexo, cpf);
        this.idInstrutor = idInstrutor;
        this.email = email;
        this.especialidade = especialidade;
        this.salario = salario;
        this.aulasMinistradas = aulasMinistradas;
    }

    public int getIdInstrutor() {
        return idInstrutor;
    }

    public void setIdInstrutor(int idInstrutor) {
        this.idInstrutor = idInstrutor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public int getAulasMinistradas() {
        return aulasMinistradas;
    }

    public void setAulasMinistradas(int aulasMinistradas) {
        this.aulasMinistradas = aulasMinistradas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void ministrarAula() {
        System.out.println("Instrutor " + getNome() + " ministrando aula de " + especialidade + ".");

        aulasMinistradas++;

        if (getAulasMinistradas() % 30 == 0) {
            aumentarSalario();
        }
    }

    private void aumentarSalario() {
        salario += salario * 0.3;
        System.out.println("Salário do instrutor " + getNome() + " aumentado para R$ " + salario);
    }
}