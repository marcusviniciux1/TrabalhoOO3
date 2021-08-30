
public class Dono extends Pessoa implements Funcionario {

    private static float salarioDono;
    private final static float precoPorLivroVendido = 35.0f;
    private Comercio vendas;
    private Parametros_Venda tipo;

    Dono(String nome) {
        super(nome);
    }

    public static float getSalarioDono() {
        return salarioDono;
    }

    public static void setSalarioDono(float salarioDono) {
        Dono.salarioDono = salarioDono;
    }

    @Override
    public float calcularSalarioBase() {
        return 0;
        //return (0.3 * vendas.getQtdeVendida() * tipo.)
    }

}
