public class Atendente extends Pessoa implements Funcionario {

    private final static float salarioAtendente = 1100.0f;
    private final static float precoPorLivroVendido = 5.0f;
    private Comercio comercio;

    Atendente(String nome) {
        super(nome);
    }

    public float getSalarioAtendente() {
        return salarioAtendente;
    }

    @Override
    public float calcularSalario() {
        return (salarioAtendente + (comercio.getQtdeTotalVendida() * precoPorLivroVendido));
    }
}
