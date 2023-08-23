public class Main {

    public static void main(String[] args) {

        Pessoa felipe = new Pessoa("Felipe Cesar", 19, "30-10-2003");
        Pessoa diogo = new Pessoa("Diogo Cedran", 25, "10-10-2000");
        Pessoa andre = new Pessoa("Andres Pereira", 35, "20-09-1990");

        System.out.println("Nome: " + felipe.getNome());
        System.out.println("Idade: " + felipe.getIdade());
        System.out.println("Data de Nascimento: " + felipe.getData());
        System.out.println();
        System.out.println("Nome: " + diogo.getNome());
        System.out.println("Idade: " + diogo.getIdade());
        System.out.println("Data de Nascimento: " + diogo.getData());
        System.out.println();
        System.out.println("Nome: " + andre.getNome());
        System.out.println("Idade: " + andre.getIdade());
        System.out.println("Data de Nascimento: " + andre.getData());
        System.out.println();
        felipe.setIdade(19);
        diogo.setIdade(25);
        andre.setIdade(35);

        System.out.println("Idade depois do setter: " + felipe.getIdade());
        System.out.println();
        System.out.println("Idade depois do setter: " + diogo.getIdade());
        System.out.println();
        System.out.println("Idade depois do setter: " + andre.getIdade());
        System.out.println();
    }
}