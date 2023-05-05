package Exercicio4;

public class Venda {
    Produto[] listaVendas = {null, null, null};
        
        public void addPreco(Produto produto){
            int i;
            
            for(i = 0;i < 3; i++){
            if(listaVendas[i] == null){
                listaVendas[i] = produto;
                return;
            }
            }
            System.out.println("Todos os produtos ja foram vendidos!!!");
        }
        
        public void remPreco(Produto produto){
            int i;
            
            for(i = 0;i < 3; i++){
            if(listaVendas[i] == produto){
                listaVendas[i] = null;
                return;
            }
            }
            System.out.println("Nenhum dos produtos foi vendido!!!");

        }
    
        public void exibirVenda()
        {
            int i;
            double total = 0;
            
            for(i = 0; i < 3; i++)
            {
                if(listaVendas[i] != null)
                {
                  total += listaVendas[i].preco;  
                }
            }
            System.out.printf("O valor total de vendas eh %f", total);
        }
}