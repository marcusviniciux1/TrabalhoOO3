import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaxineiroTest {

    @Test
    void deveCalcularSalarioFaxineiro() {
        Comercio comercio = new Comercio();
        Faxineiro faxineiro = new Faxineiro("Nícolas", comercio);

        assertEquals(1100.0f, faxineiro.calcularSalario());
    }

    @Test
    void deveVerificarComercioNulo() {
        try {
            Comercio comercio = new Comercio();
            Faxineiro faxineiro = new Faxineiro("Marcus", null);
        } catch (IllegalArgumentException e) {
            assertEquals("Comércio é obrigatório!", e.getMessage());
        }
    }
}