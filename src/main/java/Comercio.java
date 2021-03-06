public class Comercio {

    private Pessoa cliente;
    private String nomeComercio;
    private int qtdeVendidaTerror;
    private int qtdeVendidaFiccao;
    private int qtdeVendidaEscolar;
    private int qtdeVendidaReligiao;
    private int qtdeVendidaRomance;
    private float lucroTotal;


    public Pessoa getCliente() {
        return cliente;
    }

    public String getNomeComercio() {
        return nomeComercio;
    }

    public void setCliente(Pessoa cliente) {
        if (this.cliente != cliente) {
            if (this.cliente != null) {
                this.cliente.setNullClienteComercio();
            }
            this.cliente = cliente;
            if (this.cliente != null && this.cliente.getComercio() != this) {
                this.cliente.setComercio(this);
            }
        }
    }

    public void setNomeComercio(String nomeComercio) {
        this.nomeComercio = nomeComercio;
    }


    public void setNullComercioCliente() {
        this.cliente = null;
    }

    public String verificaComercioTemPessoaCliente() {
        if (cliente == null) {
            return "Comércio sem cliente.";
        }
        return cliente.getNome();

    }

    public int obterQtdeTotalVendida() {
        return qtdeVendidaTerror + qtdeVendidaFiccao + qtdeVendidaEscolar + qtdeVendidaReligiao + qtdeVendidaRomance;
    }


    public void vendaLivroTerror(int qtdeVendidaTerror) {

        if (qtdeVendidaTerror <= 0) {
            throw new IllegalArgumentException("Venda não permitida!");
        } else if (qtdeVendidaTerror > 200) {
            throw new IllegalArgumentException("Venda além do limite do estoque!");
        }
        this.qtdeVendidaTerror = qtdeVendidaTerror;
    }

    public void vendaLivroFiccao(int qtdeVendidaFiccao) {
        if (qtdeVendidaFiccao <= 0) {
            throw new IllegalArgumentException("Venda não permitida!");
        } else if (qtdeVendidaFiccao > 200) {
            throw new IllegalArgumentException("Venda além do limite do estoque!");
        }
        this.qtdeVendidaFiccao = qtdeVendidaFiccao;
    }

    public void vendaLivroEscolar(int qtdeVendidaEscolar) {
        if (qtdeVendidaEscolar <= 0) {
            throw new IllegalArgumentException("Venda não permitida!");
        } else if (qtdeVendidaEscolar > 200) {
            throw new IllegalArgumentException("Venda além do limite do estoque!");
        }
        this.qtdeVendidaEscolar = qtdeVendidaEscolar;
    }

    public void vendaLivroRomance(int qtdeVendidaRomance) {
        if (qtdeVendidaRomance <= 0) {
            throw new IllegalArgumentException("Venda não permitida!");
        } else if (qtdeVendidaRomance > 200) {
            throw new IllegalArgumentException("Venda além do limite do estoque!");
        }
        this.qtdeVendidaRomance = qtdeVendidaRomance;

    }

    public void vendaLivroReligiao(int qtdeVendidaReligiao) {
        if (qtdeVendidaReligiao <= 0) {
            throw new IllegalArgumentException("Venda não permitida!");
        } else if (qtdeVendidaReligiao > 200) {
            throw new IllegalArgumentException("Venda além do limite do estoque!");
        }
        this.qtdeVendidaReligiao = qtdeVendidaReligiao;
    }


    public float lucroLivrosVendidosTerror() {
        return this.qtdeVendidaTerror * Parametros_Comercio.getValorLivroTerror();
    }

    public float lucroLivrosVendidosFiccao() {
        return this.qtdeVendidaFiccao * Parametros_Comercio.getValorLivroFiccao();
    }

    public float lucroLivrosVendidosEscolar() {
        return qtdeVendidaEscolar * Parametros_Comercio.getValorLivroEscolar();
    }

    public float lucroLivrosVendidosRomance() {
        return qtdeVendidaRomance * Parametros_Comercio.getValorLivroRomance();
    }

    public float lucroLivrosVendidosReligiao() {
        return this.qtdeVendidaReligiao * Parametros_Comercio.getValorLivroReligiao();
    }

    public float lucroTotalLivros() {
        return lucroTotal = lucroLivrosVendidosFiccao() + lucroLivrosVendidosReligiao() + lucroLivrosVendidosEscolar() +
                lucroLivrosVendidosRomance() + lucroLivrosVendidosTerror();
    }
}
