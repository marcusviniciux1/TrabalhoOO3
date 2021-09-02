import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    @Test
    void deveVerificarLivroTemPessoaAutorValida(){
        Livro livro = new Livro();
        Pessoa autor = new Pessoa("J.R.R.TOLKIEN");

        livro.setNomeLivro("Senhor dos Aneis");

        livro.setAutor(autor);
        assertEquals("J.R.R.TOLKIEN", livro.verificaLivroTemPessoaAutora());
    }

    @Test
    void deveVerificarLivroSemAutor(){
        Livro livro = new Livro();

        livro.setNomeLivro("Senhor dos Aneis");

        assertEquals("Livro sem Autor", livro.verificaLivroTemPessoaAutora());
    }

}