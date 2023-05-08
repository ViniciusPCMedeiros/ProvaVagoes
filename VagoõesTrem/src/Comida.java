public class Comida {
    
        private String nome;
        private String descricao;
        private double preco;
    
        public Comida(String nome, String descricao, double preco) {
            this.nome = nome;
            this.descricao = descricao;
            this.preco = preco;
        }
    
        public String getNome() {
            return nome;
        }
    
        public String getDescricao() {
            return descricao;
        }
    
        public double getPreco() {
            return preco;
        }

        @Override
        public String toString() {
            return "\n]]] Nome:" + nome + " descricao: " + descricao + " preco R$" + preco + " [[[\n";
        }
    }
    

