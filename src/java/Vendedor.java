import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Pessoa{

    String cnpj = "Nao informado";
    int vendas = 0;
    String tipo = "Variados";
    List<Produto> produtos;
    

    // Método construtor da classe Vendedor
    public Vendedor(String nome, String cnpj, String tipo, double saldo){
        this.nome = nome;
        this.cnpj = cnpj;
        this.saldo = saldo;
        this.tipo = tipo;
        this.produtos = new ArrayList<Produto>();
    } 

    // Método de adição de produtos
    public void addProduto(Produto produto) {
        this.produtos.add(produto);
        System.out.println(" - " + produto.getNome() + " ... adicionado a lista de produtos");
    }

    // Método de listagem de produtos
    public void listaProdutos() {
        System.out.println("\n  Ofertas de " + getTipo());
        for (Produto produto : produtos) {
            System.out.println("   > " + produto.getNome() + "\tCod.: " + produto.getCodigo());
        }
    }

    // Métodos de get e set do atributo cnpj
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return this.cnpj;
    }

    // Métodos de get e set do atributo vendas
    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
    public int getVendas() {
        return this.vendas;
    }

    // Método de get e set do tipo de produto
    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
    public String getTipo() {
        return this.tipo;
    }

    // Metodo get para a lista de produtos
    public List<Produto> getProdutos() {
        return produtos;
    }
}
