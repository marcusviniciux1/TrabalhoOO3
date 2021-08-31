
public class Dono extends Pessoa implements Funcionario {

    private final static float comissaoPorLivroVendido = 50.0f;
    private Comercio comercio;

    Dono(String nome) {
        super(nome);
    }

    @Override
    public float calcularSalario() {
        return this.comercio.getQtdeTotalVendida() * this.comissaoPorLivroVendido;
    }

}
