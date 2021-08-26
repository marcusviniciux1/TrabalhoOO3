import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    @Test
    void deveVerificarQtdeInvalidaMinima() {
        try {
            Venda venda = new Venda();
            venda.setQtdeVendida(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade inválida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarVendaMaxima() {
        try {
            Venda venda = new Venda();
            venda.setQtdeVendida(1001);
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade além do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarCustoLivrosTerror() {
        Venda venda = new Venda();
        venda.setQtdeVendida(1000);
        assertEquals(45000, venda.lucroLivrosVendidosTerror());
    }

    @Test
    void deveVerificarCustoLivrosFiccao() {
        Venda venda = new Venda();
        venda.setQtdeVendida(1000);
        assertEquals(60000, venda.lucroLivrosVendidosFiccao());
    }

    @Test
    void deveVerificarCustoEscolar() {
        Venda venda = new Venda();
        venda.setQtdeVendida(1000);
        assertEquals(25000, venda.lucroLivrosVendidosEscolar());
    }

    @Test
    void deveVerificarCustoLivrosRomance() {
        Venda venda = new Venda();
        venda.setQtdeVendida(1000);
        assertEquals(35000, venda.lucroLivrosVendidosRomance());
    }

    @Test
    void deveVerificarCustoLivrosReligiao() {
        Venda venda = new Venda();
        venda.setQtdeVendida(1000);
        assertEquals(15000,venda.lucroLivrosVendidosReligiao());
    }

}