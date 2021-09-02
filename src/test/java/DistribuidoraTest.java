import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistribuidoraTest {

    @Test
    void deveVerificarQtdeInvalidaCompraMinimaTerror() {
        try {
            Distribuidora fornecedor = new Distribuidora();
            fornecedor.compraLivroTerror(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMaximaTerror() {
        try {
            Distribuidora fornecedor = new Distribuidora();
            fornecedor.compraLivroTerror(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaCompraMinimaTerror() {
        Distribuidora fornecedor = new Distribuidora();
        fornecedor.compraLivroTerror(1);
        assertEquals(25.0f, fornecedor.valorGastoCompraLivrosTerror());
    }

    @Test
    void deveVerificarQtdeValidaCompraMaximaTerror() {
        Distribuidora fornecedor = new Distribuidora();
        fornecedor.compraLivroTerror(200);
        assertEquals(5000.0f, fornecedor.valorGastoCompraLivrosTerror());
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMinimaFiccao() {
        try {
            Distribuidora fornecedor = new Distribuidora();
            fornecedor.compraLivroTerror(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMaximaFiccao() {
        try {
            Distribuidora fornecedor = new Distribuidora();
            fornecedor.compraLivroTerror(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaCompraMinimaFiccao() {
        Distribuidora fornecedor = new Distribuidora();
        fornecedor.compraLivroFiccao(1);
        assertEquals(20.0f, fornecedor.valorGastoCompraLivrosFiccao());
    }

    @Test
    void deveVerificarQtdeValidaCompraMaximaFiccao() {
        Distribuidora fornecedor = new Distribuidora();
        fornecedor.compraLivroFiccao(200);
        assertEquals(4000.0f, fornecedor.valorGastoCompraLivrosFiccao());
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMinimaEscolar() {
        try {
            Distribuidora fornecedor = new Distribuidora();
            fornecedor.compraLivroEscolar(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMaximaEscolar() {
        try {
            Distribuidora fornecedor = new Distribuidora();
            fornecedor.compraLivroEscolar(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaCompraMinimaEscolar() {
        Distribuidora fornecedor = new Distribuidora();
        fornecedor.compraLivroEscolar(1);
        assertEquals(15.0f, fornecedor.valorGastoCompraLivrosEscolar());
    }

    @Test
    void deveVerificarQtdeValidaCompraMaximaEscolar() {
        Distribuidora fornecedor = new Distribuidora();
        fornecedor.compraLivroEscolar(200);
        assertEquals(3000.0f, fornecedor.valorGastoCompraLivrosEscolar());
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMinimaRomance() {
        try {
            Distribuidora fornecedor = new Distribuidora();
            fornecedor.compraLivroTerror(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMaximaRomance() {
        try {
            Distribuidora fornecedor = new Distribuidora();
            fornecedor.compraLivroRomance(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaCompraMinimaRomance() {
        Distribuidora fornecedor = new Distribuidora();
        fornecedor.compraLivroRomance(1);
        assertEquals(10.0f, fornecedor.valorGastoCompraLivrosRomance());
    }

    @Test
    void deveVerificarQtdeValidaCompraMaximaRomance() {
        Distribuidora fornecedor = new Distribuidora();
        fornecedor.compraLivroRomance(200);
        assertEquals(2000.0f, fornecedor.valorGastoCompraLivrosRomance());
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMinimaReligiao() {
        try {
            Distribuidora fornecedor = new Distribuidora();
            fornecedor.compraLivroReligiao(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaCompraMaximaReligiao() {
        try {
            Distribuidora fornecedor = new Distribuidora();
            fornecedor.compraLivroReligiao(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Compra além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaCompraMinimaReligiao() {
        Distribuidora fornecedor = new Distribuidora();
        fornecedor.compraLivroReligiao(1);
        assertEquals(5.0f, fornecedor.valorGastoCompraLivrosReligiao());
    }

    @Test
    void deveVerificarQtdeValidaCompraMaximaReligiao() {
        Distribuidora fornecedor = new Distribuidora();
        fornecedor.compraLivroReligiao(200);
        assertEquals(1000.0f, fornecedor.valorGastoCompraLivrosReligiao());
    }

    @Test
    void verificaDistribuidoraTemPessoaFornecedorValido(){
        Distribuidora distribuidora = new Distribuidora();
        Pessoa fornecedor = new Pessoa("Maria");
        distribuidora.setNomeDistribuidora("MN Livraria");

        distribuidora.setFornecedor(fornecedor);

        assertEquals("Maria", distribuidora.verificaDistribuidoraTemPessoaFornecedor());
    }

    @Test
    void verificaDistribuidoraSemFornecedor(){
        Distribuidora distribuidora = new Distribuidora();
        distribuidora.setNomeDistribuidora("MN Livraria");

        assertEquals("Fornecedor nao informado", distribuidora.verificaDistribuidoraTemPessoaFornecedor());
    }

    @Test
    void deveVerificarQuantidadeTotalComprada(){
        Distribuidora distribuidora = new Distribuidora();

        distribuidora.compraLivroTerror(1);
        distribuidora.compraLivroEscolar(6);
        distribuidora.compraLivroReligiao(4);
        distribuidora.compraLivroRomance(3);
        distribuidora.compraLivroFiccao(7);

        assertEquals(21, distribuidora.getQtdeTotalComprada());
    }

}