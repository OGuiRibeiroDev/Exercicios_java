package Exercicio2;

public class Funcionario extends Pessoa{
    
    public float salario;
    
    public void apresentar(){
        System.out.printf("\nNome: %s\nIdade %d\n Salario: %f", nome, idade, salario);
    }
}
