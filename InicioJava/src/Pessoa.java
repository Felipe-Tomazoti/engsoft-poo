public class Pessoa {

    protected String nome;
    protected int idade;
    protected String data;

    public Pessoa (String nome, int idade, String data) {
        this.nome = nome;
        this.idade = idade;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getData() {
        return data;
    }

    public void setIdade(int idade) {
        if (idade > 10 && idade <20) {
            this.idade= 15;
        } else if (idade > 20 && idade < 30) {
            this.idade = 20;
        }
        else if (idade >30 && idade < 40) {
            this.idade = 30;
        }
    }
}