public class Recepcionista extends Pessoa implements Funcionario {

    private final static float salarioRecepcionista = 1100;
    private final static float precoPorLivroVendido = 5.0f;
    private Comercio vendas;

    Recepcionista(String nome) {
        super(nome);
    }

    public float getSalarioRecepcionista() {
        return salarioRecepcionista;
    }

    @Override
    public float calcularSalario() {
        return (salarioRecepcionista + (vendas.getQtdeTotalVendida() * precoPorLivroVendido));
    }
}
