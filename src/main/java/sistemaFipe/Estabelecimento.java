package sistemaFipe;

public class Estabelecimento {

    private Boolean temPortaoAutomatico;

    public Estabelecimento(Boolean temPortaoAutomatico) {
        this.temPortaoAutomatico = temPortaoAutomatico;
    }

    public Double valorDesconto(Double valorSeguro) {
        if (temPortaoAutomatico) {
            return valorSeguro * 0.045;
        }

        return valorSeguro * 0.02;
    }

}
