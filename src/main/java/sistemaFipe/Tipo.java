package sistemaFipe;

public enum Tipo {

    PASSEIO(0.12),
    USO_PROFISSIONAL(0.143),
    TRANSPORTE(0.135),
    CARGA(0.08);

    private Double percentual;

    Tipo(double percentual){
        this.percentual = percentual;
    }
    public double getPercentual(){
        return percentual;
    }
}
