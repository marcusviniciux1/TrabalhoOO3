import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComercioTest {
    @Test
    void deveVerificarQtdeInvalidaVendaMinimaTerror() {
        try {
            Comercio cliente = new Comercio();
            cliente.vendaLivroTerror(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Venda não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaVendaMaximaTerror() {
        try {
            Comercio cliente = new Comercio();
            cliente.vendaLivroTerror(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Venda além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaVendaMinimaTerror(){
        Comercio cliente = new Comercio();
        cliente.vendaLivroTerror(1);
        assertEquals(45.0f, cliente.lucroLivrosVendidosTerror());
    }

    @Test
    void deveVerificarQtdeValidaVendaMaximaTerror(){
        Comercio cliente = new Comercio();
        cliente.vendaLivroTerror(200);
        assertEquals(9000.0f, cliente.lucroLivrosVendidosTerror());
    }

    @Test
    void deveVerificarQtdeInvalidaVendaMinimaFiccao() {
        try {
            Comercio cliente = new Comercio();
            cliente.vendaLivroTerror(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Venda não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaVendaMaximaFiccao() {
        try {
            Comercio cliente = new Comercio();
            cliente.vendaLivroTerror(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Venda além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaVendaMinimaFiccao(){
        Comercio cliente = new Comercio();
        cliente.vendaLivroFiccao(1);
        assertEquals(60.0f, cliente.lucroLivrosVendidosFiccao());
    }

    @Test
    void deveVerificarQtdeValidaVendaMaximaFiccao(){
        Comercio cliente = new Comercio();
        cliente.vendaLivroFiccao(200);
        assertEquals(12000.0f, cliente.lucroLivrosVendidosFiccao());
    }

    @Test
    void deveVerificarQtdeInvalidaVendaMinimaEscolar() {
        try {
            Comercio cliente = new Comercio();
            cliente.vendaLivroEscolar(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Venda não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaVendaMaximaEscolar() {
        try {
            Comercio cliente = new Comercio();
            cliente.vendaLivroEscolar(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Venda além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaVendaMinimaEscolar(){
        Comercio cliente= new Comercio();
        cliente.vendaLivroEscolar(1);
        assertEquals(25.0f, cliente.lucroLivrosVendidosEscolar());
    }

    @Test
    void deveVerificarQtdeValidaVendaMaximaEscolar(){
        Comercio cliente = new Comercio();
        cliente.vendaLivroEscolar(200);
        assertEquals(5000.0f, cliente.lucroLivrosVendidosEscolar());
    }

    @Test
    void deveVerificarQtdeInvalidaVendaMinimaRomance() {
        try {
            Comercio cliente = new Comercio();
            cliente.vendaLivroRomance(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Venda não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaVendaMaximaRomance() {
        try {
            Comercio cliente = new Comercio();
            cliente.vendaLivroRomance(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Venda além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaVendaMinimaRomance(){
        Comercio cliente = new Comercio();
        cliente.vendaLivroRomance(1);
        assertEquals(35.0f, cliente.lucroLivrosVendidosRomance());
    }

    @Test
    void deveVerificarQtdeValidaVendaMaximaRomance(){
        Comercio cliente = new Comercio();
        cliente.vendaLivroRomance(200);
        assertEquals(7000.0f, cliente.lucroLivrosVendidosRomance());
    }

    @Test
    void deveVerificarQtdeInvalidaVendaMinimaReligiao() {
        try {
            Comercio cliente = new Comercio();
            cliente.vendaLivroReligiao(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Venda não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaVendaMaximaReligiao() {
        try {
            Comercio cliente = new Comercio();
            cliente.vendaLivroReligiao(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Venda além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaVendaMinimaReligiao(){
        Comercio cliente = new Comercio();
        cliente.vendaLivroReligiao(1);
        assertEquals(15.0f, cliente.lucroLivrosVendidosReligiao());
    }

    @Test
    void deveVerificarQtdeValidaVendaMaximaReligiao(){
        Comercio cliente = new Comercio();
        cliente.vendaLivroReligiao(200);
        assertEquals(3000.0f, cliente.lucroLivrosVendidosReligiao());
    }

}