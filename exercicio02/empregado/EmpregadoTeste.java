package exercicio02.empregado;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Gabriel", "da Costa", 1000.0);
        Empregado e2 = new Empregado("Hitalo", "Santos", 2200.0);

        System.out.println("O salário anual de " + e1.getNome() + " " + e1.getSobrenome() + " é de R$" + e1.getSalarioAnual());
        System.out.println("O salário anual de " + e2.getNome() + " " + e2.getSobrenome() + " é de R$" + e2.getSalarioAnual());

        e1.getAplicarAumento();
        e2.getAplicarAumento();

        System.out.println("Com o aumento, o salário anual de " + e1.getNome() + " " + e1.getSobrenome() + " é de R$" + e1.getSalarioAnual());
        System.out.println("Com o aumento, o salário anual de " + e2.getNome() + " " + e2.getSobrenome() + " é de R$" + e2.getSalarioAnual());

    }
}
