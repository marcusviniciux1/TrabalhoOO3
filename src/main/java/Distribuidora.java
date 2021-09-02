public class Distribuidora {

    private Pessoa fornecedor;
    private String nomeDistribuidora;
    private int qtdeCompradaTerror;
    private int qtdeCompradaFiccao;
    private int qtdeCompradaEscolar;
    private int qtdeCompradaReligiao;
    private int qtdeCompradaRomance;
    private float despesaTotal;


    public Pessoa getFornecedor() {
        return fornecedor;
    }

    public String getNomeDistribuidora() {
        return nomeDistribuidora;
    }

    public void setFornecedor(Pessoa fornecedor) {
        if (this.fornecedor != fornecedor) {
            if (this.fornecedor != null) {
                this.fornecedor.setNullFornecedorDistribuidora();
            }
            this.fornecedor = fornecedor;
            if (this.fornecedor != null && this.fornecedor.getDistribuidora() != this) {
                this.fornecedor.setDistribuidora(this);
            }
        }
    }

    public void setNomeDistribuidora(String nomeDistribuidora) {
        this.nomeDistribuidora = nomeDistribuidora;
    }


    public void setNullDistribuidoraFornecedor() {
        this.fornecedor = null;
    }

    public String verificaDistribuidoraTemPessoaFornecedor() {
        if (fornecedor == null) {
            return "Fornecedor não informado.";
        }
        return fornecedor.getNome();
    }

    public int obterQtdeTotalComprada() {
        return qtdeCompradaTerror + qtdeCompradaFiccao + qtdeCompradaEscolar + qtdeCompradaReligiao + qtdeCompradaRomance;
    }


    public void compraLivroTerror(int qtdeCompradaTerror) {
        if (qtdeCompradaTerror <= 0) {
            throw new IllegalArgumentException("Compra não permitida!");
        } else if (qtdeCompradaTerror > 200) {
            throw new IllegalArgumentException("Compra além do limite do estoque!");
        }
        this.qtdeCompradaTerror = qtdeCompradaTerror;
    }

    public void compraLivroFiccao(int qtdeCompradaFiccao) {
        if (qtdeCompradaFiccao <= 0) {
            throw new IllegalArgumentException("Compra não permitida!");
        } else if (qtdeCompradaFiccao > 200) {
            throw new IllegalArgumentException("Compra além do limite do estoque!");
        }
        this.qtdeCompradaFiccao = qtdeCompradaFiccao;
    }

    public void compraLivroEscolar(int qtdeCompradaEscolar) {

        if (qtdeCompradaEscolar <= 0) {
            throw new IllegalArgumentException("Compra não permitida!");
        } else if (qtdeCompradaEscolar > 200) {
            throw new IllegalArgumentException("Compra além do limite do estoque!");
        }
        this.qtdeCompradaEscolar = qtdeCompradaEscolar;
    }

    public void compraLivroRomance(int qtdeCompradaRomance) {
        if (qtdeCompradaRomance <= 0) {
            throw new IllegalArgumentException("Compra não permitida!");
        } else if (qtdeCompradaRomance > 200) {
            throw new IllegalArgumentException("Compra além do limite do estoque!");
        }
        this.qtdeCompradaRomance = qtdeCompradaRomance;
    }

    public void compraLivroReligiao(int qtdeCompradaReligiao) {

        if (qtdeCompradaReligiao <= 0) {
            throw new IllegalArgumentException("Compra não permitida!");
        } else if (qtdeCompradaReligiao > 200) {
            throw new IllegalArgumentException("Compra além do limite do estoque!");
        }
        this.qtdeCompradaReligiao = qtdeCompradaReligiao;
    }


    public float valorGastoCompraLivrosTerror() {
        return qtdeCompradaTerror * Parametros_Distribuidor.getValorCustoTerror();
    }

    public float valorGastoCompraLivrosFiccao() {
        return qtdeCompradaFiccao * Parametros_Distribuidor.getValorCustoFiccao();
    }

    public float valorGastoCompraLivrosEscolar() {
        return qtdeCompradaEscolar * Parametros_Distribuidor.getValorCustoEscolar();
    }

    public float valorGastoCompraLivrosRomance() {
        return qtdeCompradaRomance * Parametros_Distribuidor.getValorCustoRomance();
    }

    public float valorGastoCompraLivrosReligiao() {
        return qtdeCompradaReligiao * Parametros_Distribuidor.getValorCustoReligiao();
    }

    public float despesaTotalLivros() {
        return despesaTotal = valorGastoCompraLivrosTerror() + valorGastoCompraLivrosFiccao() + valorGastoCompraLivrosEscolar() +
                valorGastoCompraLivrosRomance() + valorGastoCompraLivrosReligiao();
    }
}


