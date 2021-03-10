public class Mercado {
    public static void cabecalho() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        System.out.println("\n ============== MERCADO CENTRAL ==============\n");
    }

    public static void menuPrincipal() {
        System.out.println(" Ola, seja bem-vindo ao mercado central. Aqui voce pode comprar e vender produtos de qualquer tipo. Voce eh: \n\n - Comprador(c)\n - Vendedor(v)");

        while(true) {
            String escolha = "";
            switch(escolha) {
                case "1":
                    break;

                case "2": 
                    break;
                
                default:
                    System.out.println(" Alternativa invalida. Informe se voce vai comprar uo vender");
            }
        }
    }

}
