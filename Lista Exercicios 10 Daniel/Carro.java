public class Carro {
    private String modelo;
    private String marca;
    private String tipoCombustivel;
    private int aroPneu;
    private String cor;

public Carro (String modelo, String marca, String tipoCombustivel, int aroPneu, String cor){
    this.modelo = modelo;
    this.marca = marca;
    this.tipoCombustivel = tipoCombustivel;
    this.aroPneu = aroPneu;
    this.cor = cor;
}

public String getModelo(){
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}

public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca = marca;
}

public String getTipoCombustivel(){
    return  tipoCombustivel;
}
public void setTipoCombustivel(String tipoCombustivel){
    this.tipoCombustivel = tipoCombustivel;
}

public int getAroPneu(){
    return aroPneu;
}
public void setAroPneu(int aroPneu){
    this.aroPneu = aroPneu;
}

public String getCor(){
    return cor;
}
public void setCor(String cor){
    this.cor = cor;
}

public void acelerar(){
    System.out.println("Vrum vrum");
}

public void frear(){
    System.out.println("beeeeeeeeeeeeeeee");
}

public void estacionar(int vaga){
    System.out.println("Carro  estacionado na vaga de numero: " + vaga);
}

}