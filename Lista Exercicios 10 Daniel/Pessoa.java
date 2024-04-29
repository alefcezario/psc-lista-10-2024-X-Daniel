public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private String cpf;
    private String corDosOlhos;
    
    public Pessoa (String nome, int idade, double altura, String cpf, String corDosOlhos) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.cpf = cpf;
        this.corDosOlhos = corDosOlhos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura () {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCordosolhos(){
        return corDosOlhos;
    }
    public void setCordosolhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public void andar(){
        System.out.println("Eita como anda!");
    }

    public void dormir(){
        System.out.println("QUe soninho!");
    }

    public void comer(String comida){
        System.out.println("O prato de " + comida + " esta otimo");
    }

    public void ler(){
        System.out.println("Esse livro tem muitas paginas!");
    }

    public void viajar(){
        System.out.println("Ano que vem quero viajar!");
    }

    public void cantar(){
        System.out.println("Você canta muito bem!");
    }
}