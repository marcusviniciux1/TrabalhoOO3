import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecepcionistaTest {

    @Test
    void deveCalcularSalarioAtendente() {
        Comercio comercio = new Comercio();
        Recepcionista recepcionista = new Recepcionista("Vinícius", comercio);

        comercio.vendaLivroTerror(3);
        comercio.vendaLivroFiccao(5);
        comercio.vendaLivroEscolar(2);
        comercio.vendaLivroRomance(2);
        comercio.vendaLivroReligiao(2);

        assertEquals(1270.0f, recepcionista.calcularSalario());
    }

    @Test
    void deveVerificarComercioNulo() {
        try {
            Comercio comercio = new Comercio();
            Recepcionista recepcionista = new Recepcionista("Nícolas", null);
        } catch (IllegalArgumentException e) {
            assertEquals("Comércio é obrigatório!", e.getMessage());
        }
    }
}