package exercicio05.veiculos;

public class Moto extends Veiculo{
    public String tipoDeGuidon;

    public String getTipoDeGuidon() {
        return tipoDeGuidon;
    }

    public void setTipoDeGuidon(String tipoDeGuidon) {
        this.tipoDeGuidon = tipoDeGuidon;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Tipo de guidon: " + getTipoDeGuidon());
    }
}
