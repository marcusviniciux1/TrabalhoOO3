import java.util.List;

public class Lucro {

    private float lucroTotal;

    public Lucro(List<Comercio> comercios) {
        this.lucroTotal = 0;

        for(Comercio comercio : comercios){
            this.lucroTotal += comercio.lucroTotalLivros();
        }

    }

    public float getLucroTotal() {
        return this.lucroTotal;
    }
}
