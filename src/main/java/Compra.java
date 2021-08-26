public class Compra {

    private Pessoa Fornecedor;
    private int qtdeComprada;

    public int getQtdeComprada() {
        return qtdeComprada;
    }

    public void setQtdeComprada(int qtdeComprada) {
        if (qtdeComprada <= 0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        } else if (qtdeComprada > 1000) {
            throw new IllegalArgumentException(("Quantidade acima do limite de estoque"));
        }
        this.qtdeComprada = qtdeComprada;
    }

    public float valorGastoCompraLivrosTerror() {
        return qtdeComprada * Parametros_Compra.getValorCustoTerror();
    }

    public float valorGastoCompraLivrosficcao() {
        return qtdeComprada * Parametros_Compra.getValorCustoFiccao();
    }

    public float valorGastoCompraLivrosEscolar() {
        return qtdeComprada * Parametros_Compra.getValorCustoEscolar();
    }

    public float valorGastoCompraLivrosRomance() {
        return qtdeComprada * Parametros_Compra.getValorCustoRomance();
    }

    public float valorGastoCompraLivrosReligiao() {
        return qtdeComprada * Parametros_Compra.getValorCustoReligiao();
    }


}
