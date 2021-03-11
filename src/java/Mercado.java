import java.util.List;
import java.util.Scanner;

public class Mercado {

    List<Comprador> compradores;
    List<Vendedor> vendedores;


    // Método que imprime o cabecalho na tela
    public static void cabecalho() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        System.out.println("\n ============== MERCADO CENTRAL ==============\n");
    }


    // Método inicial para definir se um usuário irá interagir como comprador ou como vendedor
    public static void menuPrincipal() {
        System.out.println(" Ola, seja bem-vindo ao mercado central. Aqui voce pode comprar e vender produtos de qualquer tipo. Voce eh: \n\n - Comprador(c)\n - Vendedor(v)");

        while(true) {
            Scanner teclado = new Scanner(System.in);
            String escolha = teclado.next();

            switch(escolha) {
                case "c":
                System.out.println("Voce escollheu comprador!");
                    break;

                case "v": 
                    System.out.println("Voce escolheu vendedor!");
                    break;
                
                default:
                    System.out.println(" Alternativa invalida. Informe se voce vai comprar uo vender");
            }
        }
    }

}
