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
    void deveVerificarQtdeValidaVendaMinimaTerror() {
        Comercio cliente = new Comercio();
        cliente.vendaLivroTerror(1);
        assertEquals(45.0f, cliente.lucroLivrosVendidosTerror());
    }

    @Test
    void deveVerificarQtdeValidaVendaMaximaTerror() {
        Comercio cliente = new Comercio();
        cliente.vendaLivroTerror(200);
        assertEquals(9000.0f, cliente.lucroLivrosVendidosTerror());
    }

    @Test
    void deveVerificarQtdeInvalidaVendaMinimaFiccao() {
        try {
            Comercio cliente = new Comercio();
            cliente.vendaLivroFiccao(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Venda não permitida!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeInvalidaVendaMaximaFiccao() {
        try {
            Comercio cliente = new Comercio();
            cliente.vendaLivroFiccao(201);
        } catch (IllegalArgumentException e) {
            assertEquals("Venda além do limite do estoque!", e.getMessage());
        }
    }

    @Test
    void deveVerificarQtdeValidaVendaMinimaFiccao() {
        Comercio cliente = new Comercio();
        cliente.vendaLivroFiccao(1);
        assertEquals(60.0f, cliente.lucroLivrosVendidosFiccao());
    }

    @Test
    void deveVerificarQtdeValidaVendaMaximaFiccao() {
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
    void deveVerificarQtdeValidaVendaMinimaEscolar() {
        Comercio cliente = new Comercio();
        cliente.vendaLivroEscolar(1);
        assertEquals(25.0f, cliente.lucroLivrosVendidosEscolar());
    }

    @Test
    void deveVerificarQtdeValidaVendaMaximaEscolar() {
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
    void deveVerificarQtdeValidaVendaMinimaRomance() {
        Comercio cliente = new Comercio();
        cliente.vendaLivroRomance(1);
        assertEquals(35.0f, cliente.lucroLivrosVendidosRomance());
    }

    @Test
    void deveVerificarQtdeValidaVendaMaximaRomance() {
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
    void deveVerificarQtdeValidaVendaMinimaReligiao() {
        Comercio cliente = new Comercio();
        cliente.vendaLivroReligiao(1);
        assertEquals(15.0f, cliente.lucroLivrosVendidosReligiao());
    }

    @Test
    void deveVerificarQtdeValidaVendaMaximaReligiao() {
        Comercio cliente = new Comercio();
        cliente.vendaLivroReligiao(200);
        assertEquals(3000.0f, cliente.lucroLivrosVendidosReligiao());
    }

    @Test
    void deveVerificarComercioTemClienteValido() {
        Comercio comercio = new Comercio();
        Pessoa cliente = new Pessoa("Nícolas");
        comercio.setNomeComercio("MN Livraria");

        comercio.setCliente(cliente);
        assertEquals("Nícolas", comercio.verificaComercioTemPessoaCliente());
    }

    @Test
    void deveVerificarTrocaCliente() {
        Comercio comercio = new Comercio();
        Pessoa cliente1 = new Pessoa("Marcus");
        comercio.setNomeComercio("MN Livraria");
        comercio.setCliente(cliente1);

        Pessoa cliente2 = new Pessoa("Vínicius");
        comercio.setCliente(cliente2);

        assertEquals(cliente1.getComercio(), null);
        assertEquals("Vínicius", comercio.verificaComercioTemPessoaCliente());
        assertEquals(cliente2.getNome(), comercio.getCliente().getNome());
    }

    @Test
    void deveVerificarComercioSemCliente() {
        Comercio comercio = new Comercio();
        comercio.setNomeComercio("MN Livraria");

        assertEquals("Comércio sem cliente.", comercio.verificaComercioTemPessoaCliente());

    }

    @Test
    void deveVerificarQuantidadeTotalVendida() {
        Comercio comercio = new Comercio();

        comercio.vendaLivroTerror(3);
        comercio.vendaLivroFiccao(5);
        comercio.vendaLivroEscolar(2);
        comercio.vendaLivroRomance(2);
        comercio.vendaLivroReligiao(2);

        assertEquals(14, comercio.obterQtdeTotalVendida());
    }
}