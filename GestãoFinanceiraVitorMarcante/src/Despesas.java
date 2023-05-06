public class Despesas {
    private String[] nomeDespesa = new String[100];
    private String[] tipoDespesa= new String[100];
    private double[] valorDespesa= new double[100];
    private int[] pagamentoDespesa= new int[100];

    public Despesas(){}

    public String getNomeDespesa(int i){

        return this.nomeDespesa[i];
    }
    public String getTipoDespesa(int i){

        return this.tipoDespesa[i];
    }
    public double getValorDespesa(int i){

        return this.valorDespesa[i];
    }
    public int getPagamentoDespesa(int i){

        return this.pagamentoDespesa[i];
    }


    public void setNomeDespesa(String nomeDespesa, int i){

        this.nomeDespesa[i] = nomeDespesa;
    }
    public void setTipoDespesa(String tipoDespesa, int i){

        this.tipoDespesa[i] = tipoDespesa;
    }
    public void setValorDespesa(double valorDespesa, int i){

        this.valorDespesa[i] = valorDespesa;
    }
    public void setPagamentoDespesa(int pagamentoDespesa, int i){
        this.pagamentoDespesa[i] = pagamentoDespesa;
    }


}