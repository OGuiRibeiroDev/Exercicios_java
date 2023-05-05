package Exercicio3;

public class ContaBancaria {
    
    public int numero;
    public String titular;
    public double saldo;
    
    public ContaBancaria(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public double depositar(double valor){
        saldo += valor;
        return saldo;
    }
    
    public double sacar(double valor){
        if(valor > saldo){
        saldo = 20 - valor - saldo;
        return saldo;
        }
        else
        {
        saldo -= valor;
        return saldo;
        }
    }

    public double getSaldo() {
        return saldo;
    }
    
}
