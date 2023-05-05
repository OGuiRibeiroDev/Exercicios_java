package Exercicio3;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
    
        public double depositar(double valor){
        saldo += valor;
        return saldo;
    }
    
    public double sacar(double valor){
        saldo -= valor;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    
}