public abstract class Plano {
    private int idPlano;
    private String nomePlano;
    private double valorMensal;
    private String beneficios;

    public Plano(int idPlano, String nomePlano, double valorMensal, String beneficios) {
        this.idPlano = idPlano;
        this.nomePlano = nomePlano;
        this.valorMensal = valorMensal;
        this.beneficios = beneficios;
    }

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public abstract String getDetalhes();
}
