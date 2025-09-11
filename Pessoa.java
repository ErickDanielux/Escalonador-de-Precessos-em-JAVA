
public class Pessoa { 
        private String nome = "Idalia"; 
        private int idade = 81;
        private String cidade = "Barras";

    public double idademais1(double idade) {
    return idade + 1;
    }
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        double novaIdade = pessoa.idademais1(pessoa.idade);
        System.out.println("Idade mais 1: " + novaIdade);
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Cidade: " + pessoa.cidade);
        System.out.println("Idade: " + pessoa.idade);
        


        

        
        
    }

}       
        
