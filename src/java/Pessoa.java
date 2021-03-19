public class Pessoa {
    String nome = "Sem Nome";
    double saldo = 0;
    double valorFuturo = 0;


    // Métodos de get e set do atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    // Métodos de get e set do atributo saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }

    // Metodos de get e set do atributo valorFuturo
    public void setValorFuturo(double valorFuturo) {
        this.valorFuturo = valorFuturo;
    }
    public double getValorFuturo() {
        return this.valorFuturo;
    }
}
