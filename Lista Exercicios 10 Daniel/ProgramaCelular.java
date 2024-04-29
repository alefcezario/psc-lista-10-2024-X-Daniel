public class ProgramaCelular {
    public static void main(String[] args) {
        Celular celular = new Celular ("Samsung", "A54", 6.7 , "Azul", "Snapdragon 695" );

        System.out.println("Meu telefone da " + celular.getMarca() + " é o moedelo: " + celular.getModelo() + ". A tela dele tem " 
                            + celular.getTamanhoDaTela() + " polegadas. Sua cor é: " + celular.getCor() + " e seu processador é o : " + celular.getProcessador());
        celular.enviarMensagem("Alef");
        celular.conectarInternet();
        celular.ligar();
        celular.tirarFoto();
        celular.verHora();
        celular.despertar();
        celular.pagarCompra();
        celular.assistirVIdeo();

    }
}
