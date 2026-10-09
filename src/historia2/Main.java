package historia2;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 3000.00);
        Gerente gerente = new Gerente("Marina", 3000.00);
        System.out.printf("Funcionario: R$ %.2f%n", funcionario.calcularBonificacao());
        System.out.printf("Gerente: R$ %.2f%n", gerente.calcularBonificacao());
    }
}
