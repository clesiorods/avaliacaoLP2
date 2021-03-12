import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mercado {

    List<Comprador> compradores;
    List<Vendedor> vendedores;

    
    // Método construtor da classe Mercado
    public Mercado() {
        compradores = new ArrayList<Comprador>();
        vendedores = new ArrayList<Vendedor>();
    }

    // Método de adição de comprador
    public void addComprador(Comprador novo) {
        this.compradores.add(novo);
    }

    // Método de adição de vendedor
    public void addVendedor(Vendedor novo) {
        this.vendedores.add(novo);
    }

    // Método de listagem de compradores 
    public void listaComprador() {
        int pos = 1;
        for (Comprador comprador : compradores) {
            System.out.println(" - " + comprador.getNome() + "\t (" + pos + ")");
            pos++;
        }
    }

    // Método de listagem de vendedores 
    public void listaVendedor() {
        int pos = 1;
        for (Vendedor vendedor : vendedores) {
            System.out.println(" - " + vendedor.getNome() + "\t (" + pos + ")");
            pos++;
        }
    }

    // Método de listagem em de produtos
    public void listaProdutos() {
        for (Vendedor vendedor : vendedores) {
            vendedor.listaProdutos();
        }
    }

    // Método que imprime o cabecalho na tela
    public void cabecalho() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        System.out.println("\n ================== MERCADO CENTRAL ==================\n");
    }


    // Método inicial para definir se um usuário irá interagir como comprador ou como vendedor
    public void menuPrincipal() {
        System.out.print(" Ola, seja bem-vindo ao mercado central. Aqui voce pode\n comprar e vender produtos de qualquer tipo. Voce veio: \n\n - Comprar(c)\n - Vender(v)\n\n --> ");

        while(true) {
            Scanner teclado = new Scanner(System.in);
            String escolha = teclado.next();

            switch(escolha) {
                case "c":
                System.out.println("Voce escollheu comprador!");
                this.opcoesComprador();
                    break;

                case "v": 
                    System.out.println("Voce escolheu vendedor!");
                    break;
                
                default:
                    System.out.println(" Alternativa invalida. Informe se voce vai comprar uo vender");
            }
        }
    }

    // Método para realização de compras
    public void comprar(Comprador c) {
        this.listaProdutos();

        System.out.print("\n - Informe o codigo do produto (XXX): ");

        Scanner teclado = new Scanner(System.in);
        String codigo = teclado.next();

        for (Vendedor vendedor : vendedores) {
            for (Produto produto : vendedor.getProdutos()) {
                
                System.out.println(codigo + " == " + produto.getCodigo());
                if(codigo == produto.getCodigo()) {

                    // Verificação de quantidade de produtos
                    System.out.print(" - Quantos " + produto.getNome() + " deseja comprar? ");
                    int quant = teclado.nextInt();

                    // Verificação da forma de pagamento
                    System.out.print(" > PIX ...(1)\n > Credito ...(2)\n > Debito ...(3)\n > Boleto ...(4)\n\n => ");
                    int form = teclado.nextInt();

                    this.transacao(c, vendedor, produto, quant, form);
                    break;
                }
            }
        }
        //this.cabecalho();
        System.out.println(" - Codigo invalido. Tente novamente!");
        this.comprar(c);
    }

    // Método que realiza as transações 
    public void transacao(Comprador c, Vendedor v, Produto p, int q, int f){
        this.cabecalho();
        System.out.print("Transacao");
    }

    // Metodo opções do comprador 
    public void opcoesComprador() {
        cabecalho();
        System.out.println(" Certo, mas antes de fazer suas compras, informe: \n Qual o seu nome?\n");

        listaComprador();

        System.out.print("\n --> ");

        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();


        cabecalho();
        System.out.println(" Bem " + compradores.get(opcao-1).getNome() + ", o que voce deseja comprar?");

        this.comprar(compradores.get(opcao-1));
    }

}
