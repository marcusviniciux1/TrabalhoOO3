import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendenteTest {

    @Test
    void deveCalcularSalarioAtendente() {
        Comercio comercio = new Comercio();
        Atendente atendente = new Atendente("Marcus", comercio);

        comercio.vendaLivroTerror(3);
        comercio.vendaLivroFiccao(5);
        comercio.vendaLivroEscolar(2);
        comercio.vendaLivroRomance(2);
        comercio.vendaLivroReligiao(2);

        assertEquals(1370.0f, atendente.calcularSalario());
    }

    @Test
    void deveVerificarComercioNulo() {
        try {
            Comercio comercio = new Comercio();
            Atendente atendente = new Atendente("Marcus", null);
        } catch (IllegalArgumentException e) {
            assertEquals("Comércio é obrigatório", e.getMessage());
        }
    }

}