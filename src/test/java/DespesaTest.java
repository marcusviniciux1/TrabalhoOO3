import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DespesaTest {

    @Test
    void deveVerificarDespesaTotalMinima() {
        Distribuidora distribuidor1 = new Distribuidora();
        Distribuidora distribuidor2 = new Distribuidora();
        Distribuidora distribuidor3 = new Distribuidora();
        Distribuidora distribuidor4 = new Distribuidora();
        Distribuidora distribuidor5 = new Distribuidora();

        distribuidor1.compraLivroTerror(1);
        distribuidor2.compraLivroFiccao(1);
        distribuidor3.compraLivroEscolar(1);
        distribuidor4.compraLivroRomance(1);
        distribuidor5.compraLivroReligiao(1);

        List<Distribuidora> distribuidorList = new ArrayList<Distribuidora>();

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
        Distribuidora distribuidor1 = new Distribuidora();
        Distribuidora distribuidor2 = new Distribuidora();
        Distribuidora distribuidor3 = new Distribuidora();
        Distribuidora distribuidor4 = new Distribuidora();
        Distribuidora distribuidor5 = new Distribuidora();

        distribuidor1.compraLivroTerror(200);
        distribuidor2.compraLivroFiccao(200);
        distribuidor3.compraLivroEscolar(200);
        distribuidor4.compraLivroRomance(200);
        distribuidor5.compraLivroReligiao(200);

        List<Distribuidora> distribuidorList = new ArrayList<Distribuidora>();

        distribuidorList.add(distribuidor1);
        distribuidorList.add(distribuidor2);
        distribuidorList.add(distribuidor3);
        distribuidorList.add(distribuidor4);
        distribuidorList.add(distribuidor5);

        Despesa despesa = new Despesa(distribuidorList);

        assertEquals(15000, despesa.getDespesaTotal());
    }
}