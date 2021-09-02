import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveVerificarPessoaAutoraDoLivroValida() {
        Pessoa autor = new Pessoa("J.K.ROWLING");
        Livro livro = new Livro("Harry Potter", autor);

        assertTrue(autor.verificaPessoaEhAutoraLivro(livro));
    }

    @Test
    void deveVerificarLivroNaoInformado() {
        Pessoa autor = new Pessoa("J.K.ROWLING");
        Livro livro = new Livro("Harry Potter", autor);
        try {
            autor.verificaPessoaEhAutoraLivro(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Livro não informado.", e.getMessage());
        }
    }

    @Test
    void deveVerificarPessoaNaoInformada() {
        try {
            Pessoa pessoa = new Pessoa(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Nome não informado.", e.getMessage());
        }
    }

    @Test
    void deveVerificarPessoaTemUmComercioOndeEhClienteValida() {
        Pessoa cliente = new Pessoa("Marcus");
        Comercio comercio = new Comercio();

        comercio.setNomeComercio("MN Livraria");

        cliente.setComercio(comercio);
        assertEquals("MN Livraria", cliente.verificaPessoaTemUmComercioOndeEhCliente());

    }

    @Test
    void deveVerificarTrocaComercio() {
        Pessoa cliente = new Pessoa("Vinícius");
        Comercio comercio1 = new Comercio();
        comercio1.setNomeComercio("MN Livraria");
        cliente.setComercio(comercio1);

        Comercio comercio2 = new Comercio();
        comercio2.setNomeComercio("Saraiva");
        cliente.setComercio(comercio2);

        assertEquals(comercio1.getCliente(), null);
        assertEquals("Saraiva", cliente.verificaPessoaTemUmComercioOndeEhCliente());
        assertEquals(comercio2.getNomeComercio(), cliente.getComercio().getNomeComercio());
    }

    @Test
    void deveVerificarPessoaTemUmComercioOndeEhClienteinvalida() {
        Pessoa cliente = new Pessoa("Nícolas");

        assertEquals("Comércio não informado.", cliente.verificaPessoaTemUmComercioOndeEhCliente());
    }

    @Test
    void deveVerificarPessoaEhFornecedoraDaDistribuidoraValida() {

        Pessoa fornecedor = new Pessoa("Marcus");
        Distribuidora distribuidora = new Distribuidora();
        distribuidora.setNomeDistribuidora("MN Distribuidora");

        fornecedor.setDistribuidora(distribuidora);

        assertEquals("MN Distribuidora", fornecedor.verificaPessoaEhFornecedoraDeDistribuidora());
    }

    @Test
    void deveVerificarTrocaDistribuidora() {
        Pessoa fornecedor = new Pessoa("Vinícius");
        Distribuidora distribuidora1 = new Distribuidora();
        distribuidora1.setNomeDistribuidora("MN Distribuidora");
        fornecedor.setDistribuidora(distribuidora1);

        Distribuidora distribuidora2 = new Distribuidora();
        distribuidora2.setNomeDistribuidora("Distribuidora Saraiva");
        fornecedor.setDistribuidora(distribuidora2);

        assertEquals(distribuidora1.getFornecedor(), null);
        assertEquals("Distribuidora Saraiva", fornecedor.verificaPessoaEhFornecedoraDeDistribuidora());
        assertEquals(distribuidora2.getNomeDistribuidora(), fornecedor.getDistribuidora().getNomeDistribuidora());
    }

    @Test
    void deveVerificarDistribuidoraNaoInformada() {
        Pessoa fornecedor = new Pessoa("Nícolas");

        assertEquals("Distribuidora não informada.", fornecedor.verificaPessoaEhFornecedoraDeDistribuidora());
    }
}