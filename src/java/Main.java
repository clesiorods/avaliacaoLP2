
class Main {
    public static void main(String[] args) {

        Mercado m1 = new Mercado();

        Comprador c1 = new Comprador("Clesio", "213453463224", 500);
        Comprador c2 = new Comprador("Mario", "213453234434", 500);
        Comprador c3 = new Comprador("Paulo", "213345453634", 500);
        
        m1.addComprador(c1);
        m1.addComprador(c2);
        m1.addComprador(c3);
        
        
        Mercado.cabecalho();
        m1.menuPrincipal();


    }
}
