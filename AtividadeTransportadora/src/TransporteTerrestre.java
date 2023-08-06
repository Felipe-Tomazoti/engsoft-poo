public class TransporteTerrestre extends Transportadora{
    @Override
    public double calculaFrete(int altura, int largura) {
        if (altura > largura || altura == largura) {
            return 0.2 * (altura/(double)largura);
        } else {
            return 0.2 * (largura/(double)altura);
        }
    }
}
