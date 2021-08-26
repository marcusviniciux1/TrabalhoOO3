import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveVerificarQtdeInvalidaMinima() {
        try {
            Compra compra = new Compra();
            compra.setQtdeComprada(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade inválida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaMaxima() {
        try {
            Compra compra = new Compra();
            compra.setQtdeComprada(1001);
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade acima do limite de estoque", e.getMessage());
        }
    }

    @Test
    void deveVerificarCustoLivrosTerror() {
        Compra compra = new Compra();
        compra.setQtdeComprada(15);
        assertEquals(375, compra.valorGastoCompraLivrosTerror());
    }

    @Test
    void deveVerificarCustoLivrosFiccao() {
        Compra compra = new Compra();
        compra.setQtdeComprada(15);
        assertEquals(300, compra.valorGastoCompraLivrosficcao());
    }

    @Test
    void deveVerificarCustoEscolar() {
        Compra compra = new Compra();
        compra.setQtdeComprada(15);
        assertEquals(225, compra.valorGastoCompraLivrosEscolar());
    }

    @Test
    void deveVerificarCustoLivrosRomance() {
        Compra compra = new Compra();
        compra.setQtdeComprada(15);
        assertEquals(150, compra.valorGastoCompraLivrosRomance());
    }

    @Test
    void deveVerificarCustoLivrosReligiao() {
        Compra compra = new Compra();
        compra.setQtdeComprada(15);
        assertEquals(75, compra.valorGastoCompraLivrosReligiao());
    }


}