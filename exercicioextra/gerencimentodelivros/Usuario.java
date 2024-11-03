package exercicioextra.gerencimentodelivros;

public class Usuario {
    private String nome;
    private String idUsuario;

    public Usuario(String nome, String idUsuario) {
        this.nome = nome;
        this.idUsuario = idUsuario;
    }

    public void emprestar_livro(Livro livro) {
        if (livro.esta_disponivel()) {
            livro.setDisponivel(false);
            System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível para empréstimo.");
        }
    }

    public void devolver_livro(Livro livro) {
        livro.setDisponivel(true);
        System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
    }
}
