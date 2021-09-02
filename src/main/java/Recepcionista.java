public class Recepcionista extends Pessoa implements Funcionario {

    private final static float salarioRecepcionista = 1200.0f;
    private final static float precoPorLivroVendido = 5.0f;
    private Comercio comercio;


    Recepcionista(String nome, Comercio comercio) {
        super(nome);
        if (comercio == null) {
            throw new IllegalArgumentException("Comércio é obrigatório!");
        }
        this.comercio = comercio;
    }


    @Override
    public float calcularSalario() {
        return (salarioRecepcionista + (comercio.obterQtdeTotalVendida() * precoPorLivroVendido));
    }
}
