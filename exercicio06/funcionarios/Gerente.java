package exercicio06.funcionarios;

public class Gerente extends Funcionario {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + bonus;
    }
}
