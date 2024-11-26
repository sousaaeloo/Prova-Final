import java.util.ArrayList;
import java.util.List;

abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public abstract void exibirInfo();
}

class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\nCarro: " + getMarca() + " | Modelo: " +
                getModelo() + " | Ano: " + getAno() + " | Portas: " + portas);
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\nMoto: " + getMarca() + " | Modelo: " +
                getModelo() + " | Ano: " + getAno() + " | Cilindradas: " +
                cilindradas);
    }
}

class Caminhao extends Veiculo {
    private int carga;

    public Caminhao(String marca, String modelo, int ano, int carga) {
        super(marca, modelo, ano);
        this.carga = carga;
    }

    @Override
    public void exibirInfo() {
        System.out.println("\nCaminhão: " + getMarca() + " | Modelo: " +
                getModelo() + " | Ano: " + getAno() + " | Carga: " + carga + " toneladas");
    }
}
