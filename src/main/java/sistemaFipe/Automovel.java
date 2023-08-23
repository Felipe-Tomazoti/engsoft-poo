package sistemaFipe;
public class Automovel {

    public Tipo tipo;
    public double fipe;

    public Automovel(double fipe, Tipo tipo){
        this.fipe = fipe;
        this.tipo = tipo;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public Double getFipe() {
        return fipe;
    }
}
