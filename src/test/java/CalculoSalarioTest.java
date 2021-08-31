import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoSalarioTest {

    CalculoSalario calculoSalario;
    Comercio comercio;

    @BeforeEach
    void setUp(){
        calculoSalario = new CalculoSalario();
        comercio = new Comercio();
    }

    @Test
    void deveCalcularSalarioAtendente(){
        Atendente atendente = new Atendente("Marcus");
        calculoSalario.setFuncionario(atendente);
        comercio.vendaLivroReligiao(1);
        comercio.vendaLivroTerror(2);
        comercio.vendaLivroRomance(3);
        comercio.vendaLivroFiccao(4);
        comercio.vendaLivroEscolar(5);
        comercio.getQtdeTotalVendida();
        assertEquals(1175.0f, calculoSalario.calcularSalarioFuncionario());
    }


/*
   @Test
   deveCalcularSalarioRecepcionista(){
        Recepcionista recepcionista = new Recepcionista();

   }
   @Test
   deveCalcularSalarioDono(){
        Dono dono = new Dono();
    }



 */




}