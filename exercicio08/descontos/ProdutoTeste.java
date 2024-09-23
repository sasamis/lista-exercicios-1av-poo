package exercicio08.descontos;

public class ProdutoTeste {
    public static void main(String[] args){
        Eletronico e1 = new Eletronico();
        e1.setNome("Iphone 13 128gb");
        e1.setPreco(3800);
        e1.setGarantia(12);
        System.out.println("Produto: " + e1.getNome());
        System.out.println("Preço: R$" + e1.getPreco());
        System.out.println("Garantia: " + e1.getGarantia() + " meses");
        System.out.println("Preço com desconto: R$" + e1.calcularPrecoComDesconto());

        System.out.println("-----------------------------");

        Alimento a1 = new Alimento();
        a1.setNome("Filé de frango");
        a1.setPreco(30.99);
        a1.setDataDeValidade("31/09/24");
        System.out.println("Produto: " + a1.getNome());
        System.out.println("Preço: R$" + a1.getPreco());
        System.out.println("Validade: " + a1.getDataDeValidade());
        System.out.println("Preço final: R$" + a1.calcularPrecoComDesconto());
    }
}
