package historia3;

public class Veiculo {
    private String placa;
    private String modelo;
    private double valorDiaria;

    public Veiculo(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    @Override
    public String toString() {
        return String.format("Placa: %s | Modelo: %s | Diaria: R$ %.2f", placa, modelo, valorDiaria);
    }
}
