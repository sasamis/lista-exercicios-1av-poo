package exercicio05.veiculos;

public class Carro extends Veiculo{
    private int numeroDePortas;

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Número de portas: " + getNumeroDePortas());
    }
}
