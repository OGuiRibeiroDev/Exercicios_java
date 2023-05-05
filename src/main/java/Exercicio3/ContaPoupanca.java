package Exercicio3;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
    public double depositar(double valor){
        saldo += valor;
        return saldo;
    }
    
    public double sacar(double valor){
        if(valor > saldo){
        saldo -= valor;
        return saldo;
        }else{
        System.out.println("Saldo insuficiente!!!");
        return saldo;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    
}