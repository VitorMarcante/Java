import java.io.PrintStream;

public class Total {
    private double Despesas;
    private double Rendas;
    private double totalgg;

    public void setDespesas(double Despesas){
        this.Despesas += Despesas;
    }
    public void setRendas(double Rendas){
        this.Rendas += Rendas;
    }

    public void setTotalgg(){
        this.totalgg = (this.Rendas - this.Despesas);
    }
    public PrintStream getTotalgg(){
        return (
                System.out.printf("\n\n\n\n%30s:%15.2f-\n%30s:%15.2f+\n%30s:%15.2f", "Total Despesas", this.Despesas, "Total Rendas", this.Rendas, "Total", this.totalgg)

                );
    }

}
