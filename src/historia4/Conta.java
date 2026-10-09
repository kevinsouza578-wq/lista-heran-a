package historia4;

public class Conta {
    private String numero;
    protected double saldo;

    public Conta(String numero, double saldo) {
        if (!Double.isFinite(saldo) || saldo < 0) {
            throw new IllegalArgumentException("Saldo inicial deve ser finito e nao negativo.");
        }
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    public void depositar(double valor) {
        if (!Double.isFinite(valor) || valor <= 0 || !Double.isFinite(saldo + valor)) {
            throw new IllegalArgumentException("Deposito invalido.");
        }
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (!Double.isFinite(valor) || valor <= 0 || valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }
}
