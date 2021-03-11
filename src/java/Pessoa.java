public class Pessoa {
    String nome = "";
    float saldo = 0;
    float valorFuturo = 0;

    // Métodos de get e set do atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    // Métodos de get e set do atributo saldo
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return this.saldo;
    }

    // Metodos de get e set do atributo valorFuturo
    public void setValorFuturo(float valorFuturo) {
        this.valorFuturo = valorFuturo;
    }
    public float getValorFuturo() {
        return this.valorFuturo;
    }
}
