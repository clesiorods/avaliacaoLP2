import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Pessoa{

    String cnpj = "Nao informado";
    int vendas = 0;
    List<Produto> produtos;
    

    // Método construtor da classe Vendedor
    public Vendedor(String nome, String cnpj, float saldo){
        this.nome = nome;
        this.cnpj = cnpj;
        this.saldo = saldo;
        this.produtos = new ArrayList<Produto>();
    } 

    // Método de adição de produtos
    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    // Método de listagem de produtos
    public void listaProdutos(Produto novo) {
        for (Produto produto : produtos) {
            System.out.println(" > Cod. " + produto.getCodigo() + "\t" + produto.getNome());
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
}
