package sistemaFipe;

public class Main {
    public static void main(String[] args) {

        Automovel gol = new Automovel(20000.0, Tipo.CARGA);
        Motorista felipe = new Motorista("Felipe", "Solteiro");
        Estabelecimento garagem = new Estabelecimento(Portao.AUTOMATICO);


        System.out.println("tipo esta valendo: " + gol.getTipo());
        System.out.println("fipe esta valendo: " + gol.getFipe());
        System.out.println("nome do motorista: " + felipe.getNome());
        System.out.println("fipe esta valendo: " + felipe.getEst_civ());
        System.out.println("fipe esta valendo: " + garagem.getPortao());
    }
}
