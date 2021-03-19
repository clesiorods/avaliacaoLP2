
class Main {
    public static void main(String[] args) {

        // Objetos para exemplificação ///////////////////////////////
        Mercado m1 = new Mercado(5.5, 3.5);

        Comprador c1 = new Comprador("Clesio", "213453463224", 500);
        Comprador c2 = new Comprador("Mario", "213453234434", 500);
        Comprador c3 = new Comprador("Paulo", "213345453634", 500);
            m1.addComprador(c1);
            m1.addComprador(c2);
            m1.addComprador(c3);

        Vendedor v1 = new Vendedor("Carlos", "2356166-23", "Frutas", 500);
        Vendedor v2 = new Vendedor("Luiz", "0938442-89243", "Verduras", 1200);
            m1.addVendedor(v1);
            m1.addVendedor(v2);

        Produto p1 = new Produto("Banana", "930", 2.99);
        Produto p2 = new Produto("Abacaxi", "523", 3.40);
        Produto p3 = new Produto("Uva Verde", "054", 8.39);
            v1.addProduto(p1);
            v1.addProduto(p2);
            v1.addProduto(p3);

        Produto p4 = new Produto("Cenoura", "234", 4.59);
        Produto p5 = new Produto("Tomate", "563", 3.40);
        Produto p6 = new Produto("Batata", "042", 3.79);
            v2.addProduto(p4);
            v2.addProduto(p5);
            v2.addProduto(p6);
    // Fim dos objetos de exemplificação ///////////////////


        m1.cabecalho();

        m1.menuPrincipal();


    }
}
