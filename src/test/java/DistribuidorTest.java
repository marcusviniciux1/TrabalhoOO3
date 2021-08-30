import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistribuidorTest {

    @Test
    void deveVerificarQtdeInvalidaMinima() {
        try {
            Distribuidor distribuidor = new Distribuidor(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade inválida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaMaxima() {
        try {
            Distribuidor distribuidor = new Distribuidor(1001);
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade acima do limite de estoque", e.getMessage());
        }
    }

    @Test
    void deveVerificarCustoLivrosTerror() {
        Distribuidor distribuidor = new Distribuidor(15);
        assertEquals(375, distribuidor.valorGastoCompraLivrosTerror());
    }

    @Test
    void deveVerificarCustoLivrosFiccao() {
        Distribuidor distribuidor = new Distribuidor(15);
        assertEquals(300, distribuidor.valorGastoCompraLivrosficcao());
    }

    @Test
    void deveVerificarCustoEscolar() {
        Distribuidor distribuidor = new Distribuidor(15);
        assertEquals(225, distribuidor.valorGastoCompraLivrosEscolar());
    }

    @Test
    void deveVerificarCustoLivrosRomance() {
        Distribuidor distribuidor = new Distribuidor(15);
        assertEquals(150, distribuidor.valorGastoCompraLivrosRomance());
    }

    @Test
    void deveVerificarCustoLivrosReligiao() {
        Distribuidor distribuidor = new Distribuidor(15);
        assertEquals(75, distribuidor.valorGastoCompraLivrosReligiao());
    }


}