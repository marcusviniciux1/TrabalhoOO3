import java.util.List;

public class Despesa {

    private float despesaTotal;

    public Despesa(List<Distribuidor> distribuidores) {
        this.despesaTotal = 0;

        for (Distribuidor distribuidor : distribuidores) {
            this.despesaTotal += distribuidor.despesaTotalLivros();
        }

    }

    public float getDespesaTotal() {
        return this.despesaTotal;
    }
}
