public class Animal {
    private String nome;
    private String raca;
    private String cor;

    public Animal (String nome, String raca, String cor){
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getRaca () {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String gerCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void morder() {
        System.out.println("Nhac nhac");
    }

    public void comer(String marcaRacao){
        System.out.println("Esse animail so come racao " + marcaRacao);
    }

    public void latir () {
        System.out.println("au au au");
    }

    public void rosnar(){
        System.out.println("Arghhhhhhhh");
    }
}
