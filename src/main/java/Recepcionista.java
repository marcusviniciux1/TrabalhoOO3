public class Recepcionista extends Pessoa implements Funcionario {

    private float salarioRecepcionista;
    private final static float precoPorLivroVendido = 35.0f;
    private Comercio vendas;

    Recepcionista(String nome) {
        super(nome);
    }

    public float getSalarioRecepcionista() {
        return salarioRecepcionista;
    }

    public void setSalarioRecepcionista(float salarioRecepcionista) {
        this.salarioRecepcionista = salarioRecepcionista;
    }

    @Override
    public float calcularSalarioBase() {
        return salarioRecepcionista * precoPorLivroVendido;
    }
}
