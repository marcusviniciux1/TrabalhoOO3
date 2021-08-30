public class Comercio {

    private Pessoa cliente;
    //private int qtdeTotalVendida;
    private int dataVenda;
    private float lucroTotal;

    private int qtdeVendidaTerror;
    private int qtdeVendidaFiccao;
    private int qtdeVendidaEscolar;
    private int qtdeVendidaReligiao;
    private int qtdeVendidaRomance;

    /*
    public Comercio(int qtdeVendida) {
        if (qtdeVendida <= 0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        } else if (qtdeVendida > 1000) {
            throw new IllegalArgumentException("Quantidade além do estoque!");
        }
        this.qtdeVendida = qtdeVendida;
    }
     */

    public int getQtdeTotalVendida() {
        return qtdeVendidaTerror + qtdeVendidaFiccao + qtdeVendidaEscolar + qtdeVendidaReligiao + qtdeVendidaRomance;
    }

    public void vendaLivroFiccao(int qtdeVendidaFiccao){
        if(qtdeVendidaFiccao <= 0){
            throw new IllegalArgumentException("Erro aegjerpgna");
        }
        this.qtdeVendidaFiccao = qtdeVendidaFiccao;
    }

    public void vendaLivroRomace(int qtdeVendidaRomance){
        this.qtdeVendidaRomance = qtdeVendidaRomance;
    }

    public void vendaLivroReligiao(int qtdeVendidaReligiao){
        this.qtdeVendidaReligiao = qtdeVendidaReligiao;
    }

    public void vendaLivroEscolar(int qtdeVendidaEscolar){
        this.qtdeVendidaEscolar = qtdeVendidaEscolar;
    }

    public void vendaLivroTerror(int qtdeVendidaTerror){
        this.qtdeVendidaTerror = qtdeVendidaTerror;
    }


    public int getDataVenda() {
        return dataVenda;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    /*
    public void setQtdeVendida(int qtdeVendida) {
        if (qtdeVendida <= 0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        } else if (qtdeVendida > 1000) {
            throw new IllegalArgumentException("Quantidade além do estoque!");
        }
        this.qtdeVendida = qtdeVendida;
    }
 */

    public float lucroLivrosVendidosFiccao() {
        return this.qtdeVendidaFiccao * Parametros_Venda.getValorLivroFiccao();
    }

    public float lucroLivrosVendidosTerror() {
        return this.qtdeVendidaTerror * Parametros_Venda.getValorLivroTerror();
    }

    public float lucroLivrosVendidosEscolar() {
        return qtdeVendidaEscolar * Parametros_Venda.getValorLivroEscolar();
    }

    public float lucroLivrosVendidosRomance() {
        return qtdeVendidaRomance * Parametros_Venda.getValorLivroRomance();
    }

    public float lucroLivrosVendidosReligiao() {
        return this.qtdeVendidaReligiao * Parametros_Venda.getValorLivroReligiao();
    }

    public float lucroTotalLivros() {
        return lucroTotal = lucroLivrosVendidosFiccao() + lucroLivrosVendidosReligiao() + lucroLivrosVendidosEscolar() + lucroLivrosVendidosRomance() + lucroLivrosVendidosTerror();
    }


}
