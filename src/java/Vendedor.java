public class Vendedor extends Pessoa{
    String cnpj = "Nao informado";
    int vendas = 0;
    

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
