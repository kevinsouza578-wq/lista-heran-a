package historia4;

public class ContaCorrente extends Conta {
    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        // O saldo precisa cobrir o saque E a tarifa; nao cobra se recusar.
        if (!Double.isFinite(valor) || valor <= 0) {
            return false;
        }
        return super.sacar(valor + 1.00);
    }
}
