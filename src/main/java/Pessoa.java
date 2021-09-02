// Alunos: Marcus Vinícius Rodrigues da Silva (201976010) & Nícolas Moraes (201976038)

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private List<Livro> livro;
    private Comercio comercio;
    private Distribuidora distribuidora;


    Pessoa(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome não informado.");
        } else {
            this.nome = nome;
            this.livro = new ArrayList<Livro>();
        }
    }


    public String getNome() {
        return nome;
    }

    public Comercio getComercio() {
        return comercio;
    }

    public Distribuidora getDistribuidora() {
        return distribuidora;
    }

    public void setComercio(Comercio comercio) {
        if (this.comercio != comercio) {
            if (this.comercio != null) {
                this.comercio.setNullComercioCliente();
            }
            this.comercio = comercio;
            if (this.comercio != null && this.comercio.getCliente() != this) {
                this.comercio.setCliente(this);
            }
        }
    }

    public void setDistribuidora(Distribuidora distribuidora) {
        if (this.distribuidora != distribuidora) {
            if (this.distribuidora != null) {
                this.distribuidora.setNullDistribuidoraFornecedor();
            }
            this.distribuidora = distribuidora;
            if (this.distribuidora != null && this.distribuidora.getFornecedor() != this) {
                this.distribuidora.setFornecedor(this);
            }
        }
    }


    public void setNullClienteComercio() {
        this.comercio = null;
    }

    public void setNullFornecedorDistribuidora() {
        this.distribuidora = null;
    }


    public void adicionaLivro(Livro livro) {
        this.livro.add(livro);
    }

    public boolean verificaPessoaEhAutoraLivro(Livro livro) {
        if (livro == null) {
            throw new IllegalArgumentException("Livro não informado.");
        }
        for (int i = 0; i < this.livro.size(); i++) {
            if (livro.getNomeLivro() == this.livro.get(i).getNomeLivro()) {
                return true;
            }
        }
        return false;
    }

    public String verificaPessoaTemUmComercioOndeEhCliente() {
        if (comercio == null) {
            return "Comércio não informado.";
        }
        return comercio.getNomeComercio();
    }

    public String verificaPessoaEhFornecedoraDeDistribuidora() {
        if (distribuidora == null) {
            return "Distribuidora não informada.";
        }
        return distribuidora.getNomeDistribuidora();
    }
}