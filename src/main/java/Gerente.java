public class Gerente extends Pessoa implements Funcionario {

    private float salarioGerente;
    private final static float precoPorLivroVendido = 35.0f;
    private Comercio vendas;

    Gerente(String nome) {
        super(nome);
    }

    public float getSalarioGerente() {
        return salarioGerente;
    }

    public void setSalarioGerente(float salarioGerente) {
        this.salarioGerente = salarioGerente;
    }

    @Override
    public float calcularSalarioBase() {
        return salarioGerente * precoPorLivroVendido;
    }
}
