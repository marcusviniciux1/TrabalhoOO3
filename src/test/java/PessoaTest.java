import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveVerificarPessoaAutoraDoLivroValida(){
        Pessoa autor = new Pessoa("J.K.ROWLING");
        Livro livro = new Livro();
        livro.setNomeLivro("Harry Potter");

        autor.setLivro(livro);
        assertEquals("Harry Potter", autor.verificaPessoaÉAutoraLivro());
    }

    @Test
    void deveVerificarLivroNaoInformado(){
        Pessoa autor = new Pessoa("J.K.ROWLING");

        assertEquals("Livro nao informado", autor.verificaPessoaÉAutoraLivro());
    }

    @Test
    void deveVerificarPessoaNaoInformada(){
        try {
            Pessoa pessoa = new Pessoa(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Nome não informado.", e.getMessage());
        }
    }

    @Test
    void deveVerificarPessoaTemUmComercioOndeÉClienteValida(){
        Pessoa cliente = new Pessoa("Joao");
        Comercio comercio = new Comercio();

        comercio.setNomeComercio("MN Livraria");

        cliente.setComercio(comercio);
        assertEquals("MN Livraria", cliente.verificaPessoaTemUmComercioOndeÉCliente());

    }

    @Test
    void deveVerificarPessoaTemUmComercioOndeÉClienteinvalida(){
        Pessoa cliente = new Pessoa("Joao");

        assertEquals("Comercio nao informado", cliente.verificaPessoaTemUmComercioOndeÉCliente());
    }

    @Test
    void deveVerificarPessoaÉFornecedoraDaDistribuidoraValida(){

        Pessoa fornecedor = new Pessoa("Joao");
        Distribuidora distribuidora = new Distribuidora();
        distribuidora.setNomeDistribuidora("MN Distribuidora");

        fornecedor.setDistribuidora(distribuidora);

        assertEquals("MN Distribuidora", fornecedor.verificaPessoaÉFornecedoraDeDistribuidora());


    }

    @Test
    void deveVerificarDistribuidoraNaoInformada(){
        Pessoa fornecedor = new Pessoa("Joao");

        assertEquals("Distribuidora nao informada", fornecedor.verificaPessoaÉFornecedoraDeDistribuidora());
    }
}