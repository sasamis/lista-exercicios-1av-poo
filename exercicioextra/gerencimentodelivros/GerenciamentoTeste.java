package exercicioextra.gerencimentodelivros;

public class GerenciamentoTeste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Meu Nome é Stilton, Geronimo Stilton", "Elisabetta Dami", 2009, "978-8576656678");
        Livro livro2 = new Livro("Anne of Green Gables", "L. M. Montgomery", 1908, "978-8538092667");
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, "978-8572329939");

        biblioteca.adicionar_livro(livro1);
        biblioteca.adicionar_livro(livro2);
        biblioteca.adicionar_livro(livro3);
        livro1.exibir_detalhes();

        Usuario usuario1 = new Usuario("Sâmia", "U001");

        usuario1.emprestar_livro(livro1);
        biblioteca.listar_livros_disponiveis();

        usuario1.emprestar_livro(livro2);
        usuario1.devolver_livro(livro1);
        biblioteca.listar_livros_disponiveis();

        biblioteca.buscar_livro_por_titulo("O Pequeno Príncipe");



    }
}
