import java.util.List;

public class Despesa {

    private float despesaTotal;


    public Despesa(List<Distribuidora> distribuidores) {
        this.despesaTotal = 0;

        for (Distribuidora distribuidora : distribuidores) {
            this.despesaTotal += distribuidora.despesaTotalLivros();
        }
    }


    public float getDespesaTotal() {
        return this.despesaTotal;
    }
}
