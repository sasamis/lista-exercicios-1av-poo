package exercicio04.inteiroset;

public class InteiroSetTeste {
    public static void main(String[] args){
        InteiroSet c1 = new InteiroSet();
        InteiroSet c2 = new InteiroSet();

        c1.insereElemento(1);
        c1.insereElemento(2);
        c1.insereElemento(3);

        c2.insereElemento(4);
        c2.insereElemento(5);
        c2.insereElemento(6);

        System.out.println("Conjunto 1: " + c1.toSetString());
        System.out.println("Conjunto 2: " + c2.toSetString());

        InteiroSet uniao = c1.union(c2);
        System.out.println("União: " + uniao.toSetString());

        InteiroSet intersecao = c1.intersecao(c2);
        System.out.println("Interseção: " + intersecao.toSetString());

        System.out.println("O conjunto 1 é igual ao conjunto 2? " + c1.ehIgualTo(c2));

    }
}
