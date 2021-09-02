public class Atendente extends Pessoa implements Funcionario {

    private final static float salarioAtendente = 1300.0f;
    private final static float precoPorLivroVendido = 5.0f;
    private Comercio comercio;


    Atendente(String nome, Comercio comercio) {
        super(nome);
        if (comercio == null) {
            throw new IllegalArgumentException("Comércio é obrigatório!");
        }
        this.comercio = comercio;
    }


    @Override
    public float calcularSalario() {
        return (salarioAtendente + (comercio.obterQtdeTotalVendida() * precoPorLivroVendido));
    }
}
