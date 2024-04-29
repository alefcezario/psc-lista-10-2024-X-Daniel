public class ProgramaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Novo Uno", "Fiat", "Gasolina", 33, "Azul bebê");
    
        carro.acelerar();
        carro.frear();
        carro.estacionar(506);
        
        System.out.println("Esse carro da marca " + carro.getMarca() + " tem os pneus aro " + carro.getAroPneu());
    }
}
