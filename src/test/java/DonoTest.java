import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DonoTest {

    @Test
    void deveCalcularSalarioDono(){
        Dono dono = new Dono("Marcus");
        Comercio comercio = new Comercio();
        comercio.vendaLivroTerror(3);
        comercio.vendaLivroFiccao(5);
        comercio.vendaLivroEscolar(2);
        comercio.vendaLivroRomance(2);
        comercio.vendaLivroReligiao(2);

        comercio.getQtdeTotalVendida();

        assertEquals(250.0f, dono.calcularSalario());
    }
}