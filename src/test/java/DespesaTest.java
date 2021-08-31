import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DespesaTest {

    @Test
    void deveVerificarDespesaTotalMinima() {
        Distribuidor distribuidor1 = new Distribuidor();
        Distribuidor distribuidor2 = new Distribuidor();
        Distribuidor distribuidor3 = new Distribuidor();
        Distribuidor distribuidor4 = new Distribuidor();
        Distribuidor distribuidor5 = new Distribuidor();

        distribuidor1.compraLivroTerror(1);
        distribuidor2.compraLivroFiccao(1);
        distribuidor3.compraLivroEscolar(1);
        distribuidor4.compraLivroRomance(1);
        distribuidor5.compraLivroReligiao(1);

        List<Distribuidor> distribuidorList = new ArrayList<Distribuidor>();

        distribuidorList.add(distribuidor1);
        distribuidorList.add(distribuidor2);
        distribuidorList.add(distribuidor3);
        distribuidorList.add(distribuidor4);
        distribuidorList.add(distribuidor5);

        Despesa despesa = new Despesa(distribuidorList);

        assertEquals(75, despesa.getDespesaTotal());
    }

    @Test
    void deveVerificarDespesaTotalMaxima() {
        Distribuidor distribuidor1 = new Distribuidor();
        Distribuidor distribuidor2 = new Distribuidor();
        Distribuidor distribuidor3 = new Distribuidor();
        Distribuidor distribuidor4 = new Distribuidor();
        Distribuidor distribuidor5 = new Distribuidor();

        distribuidor1.compraLivroTerror(200);
        distribuidor2.compraLivroFiccao(200);
        distribuidor3.compraLivroEscolar(200);
        distribuidor4.compraLivroRomance(200);
        distribuidor5.compraLivroReligiao(200);

        List<Distribuidor> distribuidorList = new ArrayList<Distribuidor>();

        distribuidorList.add(distribuidor1);
        distribuidorList.add(distribuidor2);
        distribuidorList.add(distribuidor3);
        distribuidorList.add(distribuidor4);
        distribuidorList.add(distribuidor5);

        Despesa despesa = new Despesa(distribuidorList);

        assertEquals(15000, despesa.getDespesaTotal());
    }

}