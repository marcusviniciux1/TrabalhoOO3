import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistribuidorTest {



    @Test
    void deveVerificarQtdeInvalidaCompraMinimaTerror() {
        try {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.compraLivroTerror(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMaximaTerror() {
        try {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.compraLivroTerror(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaCompraMinimaTerror(){
       Distribuidor distribuidor = new Distribuidor();
       distribuidor.compraLivroTerror(1);
       assertEquals(25.0f, distribuidor.valorGastoCompraLivrosTerror());
    }

    @Test
    void deveVerificarQtdeValidaCompraMaximaTerror(){
        Distribuidor distribuidor = new Distribuidor();
        distribuidor.compraLivroTerror(200);
        assertEquals(5000.0f, distribuidor.valorGastoCompraLivrosTerror());
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMinimaFiccao() {
        try {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.compraLivroTerror(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMaximaFiccao() {
        try {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.compraLivroTerror(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaCompraMinimaFiccao(){
        Distribuidor distribuidor = new Distribuidor();
        distribuidor.compraLivroFiccao(1);
        assertEquals(20.0f, distribuidor.valorGastoCompraLivrosFiccao());
    }

    @Test
    void deveVerificarQtdeValidaCompraMaximaFiccao(){
        Distribuidor distribuidor = new Distribuidor();
        distribuidor.compraLivroFiccao(200);
        assertEquals(4000.0f, distribuidor.valorGastoCompraLivrosFiccao());
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMinimaEscolar() {
        try {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.compraLivroEscolar(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMaximaEscolar() {
        try {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.compraLivroEscolar(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaCompraMinimaEscolar(){
        Distribuidor distribuidor = new Distribuidor();
        distribuidor.compraLivroEscolar(1);
        assertEquals(15.0f, distribuidor.valorGastoCompraLivrosEscolar());
    }

    @Test
    void deveVerificarQtdeValidaCompraMaximaEscolar(){
        Distribuidor distribuidor = new Distribuidor();
        distribuidor.compraLivroEscolar(200);
        assertEquals(3000.0f, distribuidor.valorGastoCompraLivrosEscolar());
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMinimaRomance() {
        try {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.compraLivroTerror(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMaximaRomance() {
        try {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.compraLivroRomance(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaCompraMinimaRomance(){
        Distribuidor distribuidor = new Distribuidor();
        distribuidor.compraLivroRomance(1);
        assertEquals(10.0f, distribuidor.valorGastoCompraLivrosRomance());
    }

    @Test
    void deveVerificarQtdeValidaCompraMaximaRomance(){
        Distribuidor distribuidor = new Distribuidor();
        distribuidor.compraLivroRomance(200);
        assertEquals(2000.0f, distribuidor.valorGastoCompraLivrosRomance());
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMinimaReligiao() {
        try {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.compraLivroReligiao(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMaximaReligiao() {
        try {
            Distribuidor distribuidor = new Distribuidor();
            distribuidor.compraLivroReligiao(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaCompraMinimaReligiao(){
        Distribuidor distribuidor = new Distribuidor();
        distribuidor.compraLivroReligiao(1);
        assertEquals(5.0f, distribuidor.valorGastoCompraLivrosReligiao());
    }

    @Test
    void deveVerificarQtdeValidaCompraMaximaReligiao(){
        Distribuidor distribuidor = new Distribuidor();
        distribuidor.compraLivroReligiao(200);
        assertEquals(1000.0f, distribuidor.valorGastoCompraLivrosReligiao());
    }










}