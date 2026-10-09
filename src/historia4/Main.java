package historia4;

public class Main {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente("001", 0.00);
        ContaPoupanca poupanca = new ContaPoupanca("002", 0.00);
        corrente.depositar(500.00);
        System.out.println("Saque corrente aprovado: " + corrente.sacar(100.00));
        poupanca.depositar(500.00);
        System.out.println("Saque poupanca aprovado: " + poupanca.sacar(100.00));
        poupanca.renderJuros(0.02);
        System.out.println("Saque acima do saldo aprovado: " + corrente.sacar(1000.00));
        System.out.printf("Saldo corrente: R$ %.2f%n", corrente.getSaldo());
        System.out.printf("Saldo poupanca: R$ %.2f%n", poupanca.getSaldo());
    }
}
