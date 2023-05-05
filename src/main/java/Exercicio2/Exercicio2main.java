package Exercicio2;

public class Exercicio2main {

    public static void main(String[] args) {
    
        Funcionario funcionario01;
        Pessoa pessoa01;
        
        funcionario01 = new Funcionario();
        pessoa01 = new Pessoa();
        
        pessoa01.nome = "Guilherme";
        pessoa01.idade = 19;
        
        funcionario01.nome = "Guilherme";
        funcionario01.idade = 19;
        funcionario01.salario = 1322;
        System.out.println("Pessoa Guilherme:\n");
        pessoa01.apresentar();
        System.out.println("Funcionario Guilherme:\n");
        funcionario01.apresentar();
    }
    
}
