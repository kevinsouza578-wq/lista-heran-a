package historia5;

public class ProdutoDigital extends Produto {
    private String linkDownload;

    public ProdutoDigital(String nome, double preco, String linkDownload) {
        super(nome, preco);
        this.linkDownload = linkDownload;
    }

    public String getLinkDownload() {
        return linkDownload;
    }

    @Override
    public double calcularValorFinal() {
        return super.calcularValorFinal() * 0.90;
    }
}
