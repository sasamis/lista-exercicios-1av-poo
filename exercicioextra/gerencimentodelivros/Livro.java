package exercicioextra.gerencimentodelivros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void exibir_detalhes() {
        System.out.println("----- Detalhes do livro: " + titulo + " ----- \n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Ano de publicação: " + anoPublicacao + "\n" +
                "ISBN: " + isbn + "\n" +
                "Disponível: " + (disponivel ? "Sim" : "Não") + "\n" +
                "---------------------------------------");
    }

    public boolean esta_disponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}