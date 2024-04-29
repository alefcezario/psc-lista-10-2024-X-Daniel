public class CartaoDeCredito {
    private String nomeBanco;
    private String bandeira;
    private String tipo;
    private String cor;

    public CartaoDeCredito (String nomeBanco, String bandeira, String tipo,  String cor){
        this.nomeBanco = nomeBanco;
        this.bandeira = bandeira;
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getNomeBanco(){
        return nomeBanco;
    }
    public void setNomeBanco(String nomeBanco){
        this.nomeBanco = nomeBanco;
    }

    public String getBandeira(){
        return bandeira;
    }
    public void setBandeira(String bandeira){
        this.bandeira = bandeira;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public void pagarCompras(Double valorPagar){
        System.out.println("Sua compra deu : R$ " + valorPagar);
    }

    public void emitirFatura(){
        System.out.println("Sua fatura ainda não fechou!");
    }

    public void fornecerCashback(double valorCashback){
        System.out.println("Seu cashback será de: R$ " + valorCashback);
    }
}
