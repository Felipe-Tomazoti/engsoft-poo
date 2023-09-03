package sistemaFipe;

public enum Estado_Civil {
    SOLTEIRO(1.08),
    DIVORCIADO(0.975),
    CASADO(0.975),
    UNIAO_ESTAVEL(1.08),
    VIUVO(0.95);

    private double percentual;

    Estado_Civil(double percentual){
        this.percentual = percentual;
    }

    public double getPercentual(){
        return percentual;
    }

}
