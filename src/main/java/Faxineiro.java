
public class Faxineiro extends Pessoa implements Funcionario {

    private final static float salarioFaxineiro = 1100.0f;
    private Comercio comercio;


    Faxineiro(String nome, Comercio comercio) {
        super(nome);
        if (comercio == null) {
            throw new IllegalArgumentException("Comércio é obrigatório!");
        }
        this.comercio = comercio;
    }


    @Override
    public float calcularSalario() {
        return salarioFaxineiro;
    }
}
