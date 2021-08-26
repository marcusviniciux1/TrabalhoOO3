public class Venda {

    private Pessoa cliente;
    private int qtdeVendida;

    public int getQtdeVendida() {
        return qtdeVendida;
    }

    public void setQtdeVendida(int qtdeVendida) {
        if (qtdeVendida <= 0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        } else if (qtdeVendida > 1000) {
            throw new IllegalArgumentException("Quantidade além do estoque!");
        }
        this.qtdeVendida = qtdeVendida;
    }

    public float lucroLivrosVendidosFiccao(){
        return qtdeVendida * Parametros_Venda.getValorLivroFiccao();
    }
    public float lucroLivrosVendidosTerror(){
        return qtdeVendida * Parametros_Venda.getValorLivroTerror();
    }
    public float lucroLivrosVendidosEscolar(){
        return qtdeVendida * Parametros_Venda.getValorLivroEscolar();
    }
    public float lucroLivrosVendidosRomance(){
        return qtdeVendida * Parametros_Venda.getValorLivroRomance();
    }
    public float lucroLivrosVendidosReligiao(){
        return qtdeVendida * Parametros_Venda.getValorLivroReligiao();
    }



}
