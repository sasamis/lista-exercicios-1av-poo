package exercicio04.inteiroset;

public class InteiroSet {
    public boolean[] conjunto;

    public InteiroSet() {
        conjunto = new boolean[101];
    }

    public InteiroSet union(InteiroSet outroConjunto){
        InteiroSet uniao = new InteiroSet();
        for (int i = 0; i < conjunto.length; i++) {
            uniao.conjunto[i] = this.conjunto[i] || outroConjunto.conjunto[i];
        }
        return uniao;
    }

    public InteiroSet intersecao(InteiroSet outroConjunto){
        InteiroSet intersecao = new InteiroSet();
        for (int i = 0; i < conjunto.length; i++) {
            intersecao.conjunto[i] = this.conjunto[i] && outroConjunto.conjunto[i];
        }
        return intersecao;
    }

    public void insereElemento(int k){
        if (k >= 0 && k <= 100){
            conjunto[k] = true;
        }
    }

    public void deleteElemento(int m){
        if (m >= 0 && m <= 100){
            conjunto[m] = false;
        }
    }

    public String toSetString(){
        String conjuntoString = "";
        boolean conjuntoStringVazio = true;
        for (int i = 0; i < conjunto.length; i++){
            if (conjunto[i]) {
                conjuntoString += i + " ";
                conjuntoStringVazio = false;
            }
        }

        if (conjuntoStringVazio){
            return "-";
        }else{
            return conjuntoString;
        }
    }

    public boolean ehIgualTo(InteiroSet outroConjunto){
        for (int i = 0; i <conjunto.length; i++){
            if (this.conjunto[i] != outroConjunto.conjunto[i]){
                return false;
            }
        }
        return true;

    }
}
