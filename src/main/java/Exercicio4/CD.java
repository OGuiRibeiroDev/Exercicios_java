package Exercicio4;

public class CD extends Produto{
    
    public String banda;
    public int duracao;

    public CD(String banda, int duracao, int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
        this.banda = banda;
        this.duracao = duracao;
    }
    }
   