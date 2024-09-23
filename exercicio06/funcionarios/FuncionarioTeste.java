package exercicio06.funcionarios;

public class FuncionarioTeste {
    public static void main(String[] ars){
        Gerente g1 = new Gerente();
        g1.setNome("João Lucas");
        g1.setSalarioBase(1600);
        g1.setBonus(500);
        System.out.println("Gerente: " + g1.getNome());
        System.out.println("Salário: " + g1.calcularSalario());

        Assistente a1 = new Assistente();
        a1.setNome("Carlos Eduardo");
        a1.setSalarioBase(1600);
        System.out.println("Assistente: " + a1.getNome());
        System.out.println("Salário: " + a1.calcularSalario());
    }
}
