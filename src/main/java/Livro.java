public class Livro {

    private Pessoa autor;
    private String nomeLivro;


    public Livro(String nomeLivro, Pessoa autor) {
        if (autor == null) {
            throw new IllegalArgumentException("Autor não informado.");
        }
        if (nomeLivro == null) {
            throw new IllegalArgumentException("Nome do livro não informado.");
        }
        this.autor = autor;
        this.autor.adicionaLivro(this);
        this.nomeLivro = nomeLivro;
    }


    public String getNomeLivro() {
        return nomeLivro;
    }


    public boolean verificaLivroTemPessoaAutora() {
        if (this.autor != null) {
            return true;
        }
        return false;
    }
}
