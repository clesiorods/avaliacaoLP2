public class Comprador extends Pessoa{
    String cpf = "Nao informado";
    int compras = 0;

    // Método construtor
    public Comprador(String nome, String cpf, double saldoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldoConta;
    }

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

    // Sobrescrição do método toString
    public String toString() {
        return ("\t\t\t\t Nome: " + this.getNome() +
                "\n\t\t\t\t CPF: " + this.getCpf() +
                "\n\t\t\t\t Saldo: R$ " + this.getSaldo() + " / Futuro: R$ " + this.getValorFuturo() +
                "\n  .............................. Compras: " + this.getCompras()
        );
    }
}
