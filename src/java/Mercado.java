import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Mercado {

    List<Comprador> compradores;
    List<Vendedor> vendedores;
    double tarifaDebito;
    double tarifaCredito;
    
    // Método construtor da classe Mercado
    public Mercado(double tarifaCredito, double tarifaDebito) {
        compradores = new ArrayList<Comprador>();
        vendedores = new ArrayList<Vendedor>();
        this.tarifaCredito = tarifaCredito;
        this.tarifaDebito = tarifaDebito;
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
        System.out.println("\n ======================= MERCADO CENTRAL =======================\n");
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
        String codigo = teclado.nextLine();

        int intCod = Integer.parseInt(codigo);

        for (Vendedor vendedor : vendedores) {
            for (Produto produto : vendedor.getProdutos()) {

                int intCode2 = Integer.parseInt(produto.getCodigo());
        
                if( intCod == intCode2 ) 
                {
                    // Verificação de quantidade de produtos
                    System.out.print(" - Quantos " + produto.getNome() + "s deseja comprar? ");
                    int quant = teclado.nextInt();

                    // Verificação da forma de pagamento
                    System.out.println("\n - Formas de pagamento:");
                    System.out.print("\n  > PIX .......(1)\n  > Credito ...(2)\n  > Debito ....(3)\n  > Boleto ....(4)\n\n => ");
                    int form = teclado.nextInt();

                    double valor = produto.getPreco() * quant;

                    this.transacao(c, vendedor, valor, form);
                    break;
                }
            }
        }
        System.out.println("\n - Codigo invalido. Tente novamente!");
        this.comprar(c);
    }

    // Método que realiza as transações 
    public void transacao(Comprador c, Vendedor v, double valor, int form){
        this.cabecalho();
        System.out.println(c.toString());

        switch(form) {
            case 1:
                // Operações do comprador
                c.setCompras( c.getCompras() + 1 );
                c.setSaldo( c.getSaldo() - valor );

                // Operações do vendedor
                v.setSaldo( v.getSaldo() + valor );
                v.setVendas(v.getVendas() + 1);

                this.comprar(c);
                break;


            case 2:
                // COMPRA POR CARTÃO DE CRÉDITO
                // Operações do comprador
                c.setCompras( c.getCompras() + 1 );
                c.setValorFuturo( c.getValorFuturo() - (valor + ((valor/100)*tarifaCredito)) );

                // Operações do vendedor
                v.setValorFuturo( v.getValorFuturo() + valor );
                v.setVendas(v.getVendas() + 1);

                this.comprar(c);
                break;

            
            case 3:
                // Operações do comprador
                c.setCompras( c.getCompras() + 1 );
                c.setSaldo( c.getSaldo() - (valor + ((valor/100)*tarifaDebito)) );

                // Operações do vendedor
                v.setSaldo( v.getSaldo() + valor );
                v.setVendas(v.getVendas() + 1);

                this.comprar(c);
                break;


            case 4: 
                // COMPRA POR BOLETO
                Scanner teclado = new Scanner(System.in);
                
                // Operações do comprador
                System.out.print("  Para pagamentos por boleto, precisamos que voce informe data de vencimento:\n  - Dia (XX): ");
                int dia = teclado.nextInt();

                System.out.print("  - Mes (XX): ");
                int mes = teclado.nextInt();

                System.out.print("  - Ano (XXXX): ");
                int ano = teclado.nextInt();


                if(noPrazo(dia, mes, ano)) {
                c.setCompras( c.getCompras() + 1 );
                c.setSaldo( c.getSaldo() - (valor + ((valor/100)*tarifaDebito)) );

                // Operações do vendedor
                v.setSaldo( v.getSaldo() + valor );
                v.setVendas(v.getVendas() + 1);

                this.comprar(c);
                } 
                else {
                    System.out.println("  - O boleto informado esta fora do trazo de validade!\n  Impossivel finalizar a transacao!");
                    try { Thread.sleep (3500); } catch (InterruptedException ex) {}
                }
                break;

            default:
                System.out.println("  Operacao invalida! Tente novamente.");
        }
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
        System.out.println(compradores.get(opcao-1).toString());

        System.out.println("  Bem, " + compradores.get(opcao-1).getNome() + ". O que voce deseja comprar?");
        this.comprar(compradores.get(opcao-1));
    }

    public boolean noPrazo(int dia, int mes, int ano) {

        Calendar atual = Calendar.getInstance();

        // Testes de vencimento relativo ao ano
        if(ano < atual.get(Calendar.YEAR)) {
            System.out.println("01");
            return false;
        } 
        else if(ano > atual.get(Calendar.YEAR)) {
            System.out.println("02");
            return true;
        }

        // Testes de validade do mês, no caso do ano ser o mesmo
        else if(mes > atual.get(Calendar.MONTH)) {
            System.out.println("03");
            return true;
        }
        else if(mes < atual.get(Calendar.MONTH)) {
            System.out.println(mes + "<" + atual.get(Calendar.MONTH));
            return false;
        }

        // Testes de validade do dia, no caso do mês ser o mesmo
        else if(dia < atual.get(Calendar.DAY_OF_MONTH)) {
            System.out.println("05");
            return false;
        }
        else {
            System.out.println(mes + "<" + atual.get(Calendar.MONTH));
            System.out.println("06");
            return true;
        }
    }

}
