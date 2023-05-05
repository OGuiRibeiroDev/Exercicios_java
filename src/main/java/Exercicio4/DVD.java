package Exercicio4;

public class DVD extends Produto{
    
    public String titulo;
    public int duracao;

    public DVD(String titulo, int duracao, int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
        this.titulo = titulo;
        this.duracao = duracao;
    }
    
    
    
    
}