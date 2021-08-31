import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LucroTest {

    @Test
    void deveVerificarLucroTotalMinimo() {
        Comercio comercio1 = new Comercio();
        Comercio comercio2 = new Comercio();
        Comercio comercio3 = new Comercio();
        Comercio comercio4 = new Comercio();
        Comercio comercio5 = new Comercio();

        comercio1.vendaLivroTerror(1);
        comercio2.vendaLivroFiccao(1);
        comercio3.vendaLivroEscolar(1);
        comercio4.vendaLivroRomance(1);
        comercio5.vendaLivroReligiao(1);

        List<Comercio> comercioList = new ArrayList<Comercio>();

        comercioList.add(comercio1);
        comercioList.add(comercio2);
        comercioList.add(comercio3);
        comercioList.add(comercio4);
        comercioList.add(comercio5);

        Lucro lucro = new Lucro(comercioList);

        assertEquals(180, lucro.getLucroTotal());
    }

    @Test
    void deveVerificarLucroTotalMaximo() {
        Comercio comercio1 = new Comercio();
        Comercio comercio2 = new Comercio();
        Comercio comercio3 = new Comercio();
        Comercio comercio4 = new Comercio();
        Comercio comercio5 = new Comercio();

        comercio1.vendaLivroTerror(200);
        comercio2.vendaLivroFiccao(200);
        comercio3.vendaLivroEscolar(200);
        comercio4.vendaLivroRomance(200);
        comercio5.vendaLivroReligiao(200);

        List<Comercio> comercioList = new ArrayList<Comercio>();

        comercioList.add(comercio1);
        comercioList.add(comercio2);
        comercioList.add(comercio3);
        comercioList.add(comercio4);
        comercioList.add(comercio5);

        Lucro lucro = new Lucro(comercioList);

        assertEquals(36000, lucro.getLucroTotal());
    }

}