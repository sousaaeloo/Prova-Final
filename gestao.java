public class Gestao {
    public static void main(String[] args) {

        Concessionaria con1 = new Concessionaria();


        Carro c1 = new Carro("Fiat", "500", 2022, 4);
        Moto m1 = new Moto("Yamaha", "MT-07", 2021, 689);
        Caminhao cc1 = new Caminhao("Volvo", "FH540", 2023, 6);


        con1.adicionarVeiculo(c1);
        con1.adicionarVeiculo(m1);
        con1.adicionarVeiculo(cc1);


        con1.listarVeiculos();


        con1.removerVeiculo(c1);


        con1.listarVeiculos();
    }
}
