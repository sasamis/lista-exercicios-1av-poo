package exercicio01.fatura;

public class Fatura {
    private String codigoProduto;
    private String descricaoProduto;
    private int quantidadeComprada;
    private double precoPorItem;

    public Fatura(String codigoProduto, String descricaoProduto, int quantidadeComprada, double precoPorItem) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.setQuantidadeComprada(quantidadeComprada);
        this.setPrecoPorItem(precoPorItem);
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada < 0) {
            this.quantidadeComprada = 0;
        } else {
            this.quantidadeComprada = quantidadeComprada;
        }
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        if (precoPorItem < 0) {
            this.precoPorItem = 0.0;
        } else {
            this.precoPorItem = precoPorItem;
        }
    }

    public double getTotalFatura() {
        return quantidadeComprada * precoPorItem;
    }
}