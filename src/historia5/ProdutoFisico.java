package historia5;

public class ProdutoFisico extends Produto {
    private double peso;

    public ProdutoFisico(String nome, double preco, double peso) {
        super(nome, preco);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double calcularValorFinal() {
        return super.calcularValorFinal() + peso * 5.00;
    }
}
