package Exercicio4;

public class Estoque {
    
        Produto[] listaEstoque = {null, null, null};
        
        public void addEstoque(Produto produto){
            int i;
            
            for(i = 0;i < 3; i++){
            if(listaEstoque[i] == null){
                listaEstoque[i] = produto;
                return;
            }
            }
            System.out.println("Estoque cheio!!!");
        }
        
        public void remEstoque(Produto produto){
            int i;
            
            for(i = 0;i < 3; i++){
            if(listaEstoque[i] == produto){
                listaEstoque[i] = null;
                return;
            }
            }
            System.out.println("Estoque vazio!!!");

        }
        
        public void exibirEstoque(){
            int i;
            System.out.println("Exibindo o estoque:");
            for(i = 0;i < 3; i++){
                if(listaEstoque[i] != null){
            System.out.printf("Produto: %s\n", listaEstoque[i].descricao);
                }
            }
}
}