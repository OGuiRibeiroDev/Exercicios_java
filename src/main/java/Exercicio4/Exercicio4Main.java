package Exercicio4;

public class Exercicio4Main {

    public static void main(String[] args) {
        
        CD cede;
        DVD devede;
        Livro book;
        
        cede = new CD("jupiter maca", 29,532132, "CD do artista Jupiter Maça ", 24.99);
        devede = new DVD("Winnie the pooh: blood and honey",1,410976,"DVD do filme Winnie the pooh: blood and honey", 69.90);
        book = new Livro(193,"365 dias",983163, "Livro da saga 365 dias", 2.00);
        
        Estoque stock = new Estoque();
        
        stock.addEstoque(book);
        stock.addEstoque(cede);
        stock.addEstoque(devede);
        
        stock.exibirEstoque();
        
        System.out.println("\n");
        
        stock.remEstoque(book);
        stock.remEstoque(cede);
        
        stock.exibirEstoque();
        System.out.println("\n");
        
        Venda sell = new Venda();
        
        sell.addPreco(book);
        sell.addPreco(cede);
        sell.addPreco(devede);
        
        sell.exibirVenda();
        System.out.println("\n");
        sell.remPreco(book);
        
        sell.exibirVenda();
    }
    
}
