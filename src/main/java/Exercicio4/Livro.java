package Exercicio4;

public class Livro extends Produto{
    public int paginas;
    public String autor;

    public Livro(int paginas, String autor, int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
        this.paginas = paginas;
        this.autor = autor;
    }
    
    
    
    
}