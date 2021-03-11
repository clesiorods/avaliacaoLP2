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

    // Método que imprime o cabecalho na tela
    public static void cabecalho() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        System.out.println("\n ============== MERCADO CENTRAL ==============\n");
    }


    // Método inicial para definir se um usuário irá interagir como comprador ou como vendedor
    public void menuPrincipal() {
        System.out.print(" Ola, seja bem-vindo ao mercado central. Aqui voce pode comprar e vender produtos de qualquer tipo. Voce eh: \n\n - Comprador(c)\n - Vendedor(v)\n\n --> ");

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

    // Metodo opções do comprador 
    public void opcoesComprador() {
        cabecalho();
        System.out.println(" Certo, mas antes de fazer suas compras, informe: \n Quem voce eh?\n");

        listaComprador();

        System.out.print("\n --> ");

        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();


        cabecalho();
        System.out.println(" Bem " + compradores.get(opcao-1).getNome() + ", o que voce deseja comprar?\n");
    }

}
