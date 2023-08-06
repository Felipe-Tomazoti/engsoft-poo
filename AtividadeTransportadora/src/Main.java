public class Main {
    public static void main(String[] args) {

    TransporteNautico marinhacenter = new TransporteNautico();
    TransporteTerrestre avicenter = new TransporteTerrestre();

        System.out.println(marinhacenter.calculaFrete(10, 10));
        System.out.println(avicenter.calculaFrete(10, 10));
    }
}
