import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LucroTest {

    @Test
    void deveVerificarLucroTotal() {
        Comercio comercio1 = new Comercio();
        Comercio comercio2 = new Comercio();
        Comercio comercio3 = new Comercio();
        Comercio comercio4 = new Comercio();
        Comercio comercio5 = new Comercio();

        comercio1.vendaLivroTerror(10);
        comercio2.vendaLivroFiccao(10);
        comercio3.vendaLivroEscolar(10);
        comercio4.vendaLivroRomace(10);
        comercio5.vendaLivroReligiao(10);

        List<Comercio> comercioList = new ArrayList<Comercio>();

        comercioList.add(comercio1);
        comercioList.add(comercio2);
        comercioList.add(comercio3);
        comercioList.add(comercio4);
        comercioList.add(comercio5);

        Lucro lucro = new Lucro(comercioList); // INJEÇÃO DE DEPENDENCIA

        assertEquals(1800, lucro.getLucroTotal());
    }

}