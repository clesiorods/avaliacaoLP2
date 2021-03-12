public class Produto {
    String codigo;
    String nome = "";
    double preco = 0;


    // Método construtor da classe Produto
    public Produto(String nome, String codigo, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos de get e set do atributo codigo
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return this.codigo;
    }

    // Métodos de get e set do atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    // Métodos de get e set do atributo preco
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return this.preco;
    }
}
