public class Celular {
    private String marca;
    private String modelo;
    private double tamanhoDaTela;
    private String cor;
    private String processador;

    public Celular (String marca, String modelo, double tamanhoDaTela, String cor, String processador){
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoDaTela = tamanhoDaTela;
        this.cor = cor;
        this.processador = processador;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTamanhoDaTela() {
        return tamanhoDaTela;
    }
    public void setTamanhoDaTela(double tamanhoDaTela) {
        this.tamanhoDaTela = tamanhoDaTela;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void ligar(){
        System.out.println("Número ocupado!");
    }

    public void conectarInternet(){
        System.out.println("Sem rede!");
    }

    public void enviarMensagem(String nome){
        System.out.println("Oi, me empresta um dinheiro? " + nome);
    }

    public void tirarFoto(){
        System.out.println("Foto capturada!");
    }

    public void verHora(){
        System.out.println("São 13:30h");
    }

    public void despertar(){
        System.out.println("Hora de acordar!");
    }

    public void pagarCompra(){
        System.out.println("Você esta sem limite! entre em contato com o banco!");
    }

    public void assistirVIdeo(){
        System.out.println("Netlix");
    }
}
