package historia1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", "111.111.111-11", "ana@example.com");
        Funcionario funcionario = new Funcionario("Carlos", "222.222.222-22", 3000.00);
        System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf()
                + " | Email: " + cliente.getEmail());
        System.out.printf("Funcionario: %s | CPF: %s | Salario: R$ %.2f%n",
                funcionario.getNome(), funcionario.getCpf(), funcionario.getSalario());
    }
}
