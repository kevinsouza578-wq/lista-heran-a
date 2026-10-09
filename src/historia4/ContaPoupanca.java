package historia4;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero, double saldo) {
        super(numero, saldo);
    }

    public void renderJuros(double taxa) {
        // Exemplo: 0.02 representa 2%.
        if (!Double.isFinite(taxa) || taxa < 0 || !Double.isFinite(saldo + saldo * taxa)) {
            throw new IllegalArgumentException("Taxa invalida.");
        }
        saldo += saldo * taxa;
    }
}
