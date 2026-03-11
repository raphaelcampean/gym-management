public class PlanoStandart extends Plano {
    public PlanoStandart(int idPlano, String nomePlano) {
        super(idPlano, nomePlano, 99.99, "Acesso aos equipamentos da academia, pode malhar em uma unidade, sem acesso ás aulas de dança.");
    }
    
    @Override
    public String getDetalhes() {
        return "Plano: " + getNomePlano() + "\nBenefícios: " + getBeneficios() + "\nValor Mensal: R$ " + getValorMensal();
    }
}
