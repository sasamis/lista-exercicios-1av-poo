package exercicio08.descontos;

public class Eletronico extends Produto{
    private int garantia;

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public double calcularPrecoComDesconto(){
        return getPreco() - (getPreco() * 0.1);
    }
}
