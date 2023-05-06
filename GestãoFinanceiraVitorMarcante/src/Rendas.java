public class Rendas {
    private String[] nomeRenda = new String[100];
    private String[] tipoRenda = new String[100];
    private double[] valorRenda = new double[100];

    public Rendas(){}

    public String getNomeRenda(int i){

        return this.nomeRenda[i];
    }
    public String getTipoRenda(int i){

        return this.tipoRenda[i];
    }
    public double getValorRenda(int i){

        return this.valorRenda[i];
    }


    public void setNomeRenda(String nomeRenda, int i){
        this.nomeRenda[i] = nomeRenda;
    }
    public void setTipoRenda(String tipoRenda, int i){
        this.tipoRenda[i] = tipoRenda;
    }
    public void setValorRenda(double valorRenda, int i){
        this.valorRenda[i] = valorRenda;
    }
}
