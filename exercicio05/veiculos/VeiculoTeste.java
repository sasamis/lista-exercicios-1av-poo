package exercicio05.veiculos;

public class VeiculoTeste {
    public static void main(String[] args){
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Marca aleatória");
        veiculo.setModelo("Modelo aleatório");
        veiculo.setAno(1999);
        veiculo.exibirDetalhes();

        Carro c1 = new Carro();
        c1.setMarca("Volkswagen");
        c1.setModelo("Gol");
        c1.setAno(2015);
        c1.setNumeroDePortas(4);
        c1.exibirDetalhes();

        Moto m1 = new Moto();
        m1.setMarca("Honda");
        m1.setModelo("CG 125");
        m1.setAno(1999);
        m1.setTipoDeGuidon("Guidon reto");
        m1.exibirDetalhes();

    }
}
