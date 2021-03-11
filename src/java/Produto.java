public class Produto {
    String codigo = "";
    String nome = "";
    float preco = 0;

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
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getPreco() {
        return this.preco;
    }
}
