package sistemaFipe;

public class CalculadoraSeguro {
    public double calcular(Motorista motorista) {
        double pcFipe = motorista.getAutomovel().getFipe();
        double pcTipo = motorista.getAutomovel().getTipo().getPercentual();
        double pcEstadocivil = motorista.getEst_civ().getPercentual();
        // CALCULAR PRIMEIRO VALOR..
        double primeiroValor = pcFipe * pcTipo;
        double segundoValor = (pcFipe * pcEstadocivil) - pcFipe;
        double valorTotalSeguro = primeiroValor + segundoValor;

        if (motorista.getEstabelecimento() != null) {
            return valorTotalSeguro - motorista
                    .getEstabelecimento()
                    .valorDesconto(valorTotalSeguro);
        }
        return valorTotalSeguro;
    }
}
