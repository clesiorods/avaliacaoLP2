public class Comprador extends Pessoa{
    String cpf = "Nao informado";
    int compras = 0;

    // Métodos de get e set do atributo cpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }

    // Métodos de get e set do atributo compras
    public void setCompras(int compras) {
        this.compras = compras;
    }
    public int getCompras() {
        return this.compras;
    }
}
