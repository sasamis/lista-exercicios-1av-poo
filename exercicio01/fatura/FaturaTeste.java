package exercicio01.fatura;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura f1 = new Fatura("1", "Memória RAM 8GB", 2, 225.99);
        f1.setQuantidadeComprada(3);
        f1.setPrecoPorItem(250.99);

        System.out.println("Código do produto: " + f1.getCodigoProduto());
        System.out.println("Produto: " + f1.getDescricaoProduto());
        System.out.println("Quantidade comprada: " + f1.getQuantidadeComprada());
        System.out.println("Preço do produto: " + f1.getPrecoPorItem());
        System.out.println("Total da fatura: " + f1.getTotalFatura());

    }
}
