package historia5;

public class Main {
    public static void main(String[] args) {
        ProdutoFisico fisico = new ProdutoFisico("Livro", 100.00, 2.00);
        ProdutoDigital digital = new ProdutoDigital("E-book", 100.00, "https://example.com/ebook");
        System.out.printf("%s: R$ %.2f%n", fisico.getNome(), fisico.calcularValorFinal());
        System.out.printf("%s: R$ %.2f%n", digital.getNome(), digital.calcularValorFinal());
    }
}
