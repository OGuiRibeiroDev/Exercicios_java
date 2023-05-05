package Exercicio3;

public class Exercicio3main {

    public static void main(String[] args) {
        ContaBancaria Bancaria;
        ContaPoupanca Poupanca;
        ContaCorrente Corrente;
        
        
        Corrente = new ContaCorrente(40028922, "Yudi", 1150);
        Poupanca = new ContaPoupanca(123456789, "Priscila", 1500);
        Bancaria = new ContaBancaria(987654321,"Silvia Abravanel",1200);
        
        System.out.printf("CONTA BANCARIA DE:\n%s \nNUMERO DA CONTA: %d\n\n",Corrente.titular, Corrente.numero);
        
        System.out.printf("Saldo Inicial: %f\n", Corrente.getSaldo());
        System.out.println("Deposito de de 100,00");
        Corrente.depositar(100);
        System.out.printf("Saldo após depósito: %f\n", Corrente.saldo);
        System.out.println("Saque de de R$1350,00");
        Corrente.sacar(1350);
        System.out.printf("Saldo após saque: %f\n", Corrente.saldo);
        System.out.printf("Saldo final: %f\n", Corrente.getSaldo());
        
        System.out.printf("\n\nCONTA BANCARIA DE:\n%s \nNUMERO DA CONTA: %d\n",Poupanca.titular, Poupanca.numero);
        
        System.out.printf("Saldo inicial: %f\n", Poupanca.getSaldo());
        System.out.println("Deposito de R$100,00");
        Poupanca.depositar(100);
        System.out.printf("Saldo após depósito: %f\n", Poupanca.saldo);
        System.out.println("Saque de de R$1350,00");
        Corrente.sacar(1350);
        System.out.printf("Saldo após saque: %f\n", Poupanca.sacar(1350));
        System.out.printf("Saldo final: %f\n", Poupanca.getSaldo());
        
        System.out.printf("\n\nCONTA BANCARIA DE:\n%s \nNUMERO DA CONTA: %d\n",Bancaria.titular, Poupanca.numero);
        
        System.out.printf("Saldo inicial: %f\n", Bancaria.getSaldo());
        System.out.println("Deposito de R$100,00");
        Poupanca.depositar(100);
        System.out.printf("Saldo após depósito: %f\n", Bancaria.saldo);
        System.out.println("Saque de de R$1350,00");
        Corrente.sacar(1350);
        System.out.printf("Saldo após saque com taxa de 10 reais: %f\n", Bancaria.sacar(1350));
        System.out.printf("Saldo final: %f\n", Bancaria.getSaldo());
    }
    
}
