import java.util.ArrayList;
import java.util.List;
class Concessionaria{
    private List<Veiculo> listaVeiculo;
    public Concessionaria(){
        listaVeiculo = new ArrayList<>();
    }
    public void adicionarVeiculo(Veiculo veiculo){
        listaVeiculo.add(veiculo);
        System.out.println(veiculo.getClass().getSimpleName() + " adicionado com sucesso!\n");
    }
    public void removerVeiculo(Veiculo veiculo){
        if (listaVeiculo.remove(veiculo)){
            System.out.println(veiculo.getClass().getSimpleName() + " removido com sucesso!\n");
        }else{
            System.out.println("\nVeículo não encontrado");
        }
    }
    public void listarVeiculos() {
        if (listaVeiculo.isEmpty()) {
            System.out.println("\nNenhum veículo disponível na concessionária");
        } else {
            System.out.println("\nLista de Veículos na Concessionária: ");
            for (Veiculo veiculo : listaVeiculo) {
                veiculo.exibirInfo();
            }
        }
    }
    }
