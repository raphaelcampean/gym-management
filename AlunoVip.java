public class AlunoVip extends Aluno {
    public AlunoVip(int idAluno, String nome, int idade, String sexo, String cpf, String email, String numMatricula, Plano plano, int aulasRealizadas) {
        super(idAluno, nome, idade, sexo, cpf, email, numMatricula, plano, aulasRealizadas);
    }

    @Override
    public double calcularValorMensal() {
        return getPlano().getValorMensal() * 0.9;
    }
}
