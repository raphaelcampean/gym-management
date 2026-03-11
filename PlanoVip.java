public class PlanoVip extends Plano {
    public PlanoVip(int idPlano, String nomePlano) {
        super(idPlano, nomePlano, 149.99, "Acesso aos equipamentos da academia, pode malhar unidades da mesma cidade, acesso ás aulas de dança.");
    }

    @Override
    public String getDetalhes() {
        return "Plano: " + getNomePlano() + "\nBenefícios: " + getBeneficios() + "\nValor Mensal: R$ " + getValorMensal();
    }
}
