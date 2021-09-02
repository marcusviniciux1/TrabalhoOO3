public class Pessoa {

    private String nome;
    private Livro livro;
    private Comercio comercio;
    private Distribuidora distribuidora;

    Pessoa(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome não informado.");
        } else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }

    public void setDistribuidora(Distribuidora distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String verificaPessoaÉAutoraLivro(){
        if( livro == null){
            return "Livro nao informado";
        }
        return livro.getNomeLivro();
    }

    public String verificaPessoaTemUmComercioOndeÉCliente(){
        if( comercio == null){
            return "Comercio nao informado";
        }
        return comercio.getNomeComercio();
    }

    public String verificaPessoaÉFornecedoraDeDistribuidora(){
        if( distribuidora == null){
            return "Distribuidora nao informada";
        }
        return distribuidora.getNomeDistribuidora();
    }


}






