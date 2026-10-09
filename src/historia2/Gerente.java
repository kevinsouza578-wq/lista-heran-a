package historia2;

public class Gerente extends Funcionario {


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }



    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.20;
    }
}
