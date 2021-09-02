public class Livro {

    private Pessoa autor;
    private String nomeLivro;


    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String verificaLivroTemPessoaAutora(){
        if(autor == null){
            return "Livro sem Autor";
        }
        return autor.getNome();
    }
}
