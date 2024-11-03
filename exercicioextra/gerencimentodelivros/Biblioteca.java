package exercicioextra.gerencimentodelivros;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> listaDeLivros;

    public Biblioteca() {
        this.listaDeLivros = new ArrayList<>();
    }

    public void adicionar_livro(Livro livro) {
        listaDeLivros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void listar_livros_disponiveis() {
        System.out.println("-------- Livros disponíveis para empréstimo --------");
        for (Livro livro : listaDeLivros) {
            if (livro.esta_disponivel()) {
                System.out.println(livro.getTitulo());
            }
        }
        System.out.println("----------------------------------------------------");
    }

    public void buscar_livro_por_titulo(String titulo) {
        for (Livro livro : listaDeLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.exibir_detalhes();
                return;
            }
        }
        System.out.println("Livro com título " + titulo + " não encontrado.");
    }
}