import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    @Test
    void deveVerificarLivroTemPessoaAutorValida(){
        Pessoa autor = new Pessoa("J. R. R. Tolkien");
        Livro livro = new Livro("Senhor dos Anéis", autor);

        assertTrue(livro.verificaLivroTemPessoaAutora());
    }

    @Test
    void deveVerificarLivroSemAutor(){
        try {
            Livro livro = new Livro("Senhor dos Anéis", null);
        }catch (IllegalArgumentException e) {
            assertEquals("Autor não informado.", e.getMessage());
        }
    }

    @Test
    void deveVerificarNomeLivroNaoInformado(){
        Pessoa autor = new Pessoa("J. R. R. Tolkien");
        try {
            Livro livro = new Livro(null, autor);
        }catch (IllegalArgumentException e) {
            assertEquals("Nome do livro não informado.", e.getMessage());
        }
    }
}