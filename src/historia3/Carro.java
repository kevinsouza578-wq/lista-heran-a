package historia3;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String placa, String modelo, double valorDiaria, int quantidadePortas) {
        super(placa, modelo, valorDiaria);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public String toString() {
        return super.toString() + " | quantidadePortas: " + quantidadePortas;
    }
}
