public class ProgramaCartaoDeCredito {
    public static void main(String[] args) {
        CartaoDeCredito cartaDeCredito = new CartaoDeCredito("Nubank", "Master Card Gold", "Credito", "Lilas");
    
        cartaDeCredito.pagarCompras(596.50);
        cartaDeCredito.emitirFatura();
        cartaDeCredito.fornecerCashback(958.58);
    
        System.out.println("Gosto muito do banco " + cartaDeCredito.getNomeBanco() + ". A bandeira " + cartaDeCredito.getBandeira() 
                            + " tem muitos beneficios. Sua cor é " + cartaDeCredito.getCor() + " e se pagar no "+ cartaDeCredito.getTipo() + " eu ganho dinheiro de volta.");
    }
}
