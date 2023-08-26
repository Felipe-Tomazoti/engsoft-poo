package sistemaFipe;

public class Motorista{
    private String nome;
    private Estado_Civil est_civ;
    private Automovel automovel;
    private Estabelecimento estabelecimento;

    public Motorista(String nome, Estado_Civil est_civ, Automovel automovel, Estabelecimento estabelecimento){
        this.nome = nome;
        this.est_civ = est_civ;
        this.automovel = automovel;
        this.estabelecimento = estabelecimento;
    }

    public Automovel getAutomovel(){
        return automovel;
    }

    public Estabelecimento getEstabelecimento(){
        return estabelecimento;
    }

    public String getNome() {
        return nome;
    }
    public Estado_Civil getEst_civ() {
        return est_civ;
    }

}
