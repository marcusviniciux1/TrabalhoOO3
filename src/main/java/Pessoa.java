public abstract class Pessoa {

    private String nome;
    private final static float precoPorLivroVendido = 35.0f;

    Pessoa(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome não informado.");
        } else {
            this.nome = nome;
        }
    }
}
