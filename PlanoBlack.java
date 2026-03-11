public class PlanoBlack extends Plano {
    public PlanoBlack(int idPlano, String nomePlano) {
        super(idPlano, nomePlano, 199.99, "Acesso aos equipamentos da academia, pode malhar em todas as unidades, acesso ás aulas de dança, acesso a personal trainer e pré-treinos 2x por semana.");
    }

    @Override
    public String getDetalhes() {
        return "Plano: " + getNomePlano() + "\nBenefícios: " + getBeneficios() + "\nValor Mensal: R$ " + getValorMensal();
    }
}
