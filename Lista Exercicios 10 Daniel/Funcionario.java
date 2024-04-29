public class Funcionario {
    private String nome;
    private String carteiraTrabalho;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String carteiraTrabalho, String cargo, double salario){
        this.nome = nome;
        this.carteiraTrabalho = carteiraTrabalho;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarteiraTrabalho(){
        return carteiraTrabalho;
    }
    public void setCarteiraTrabalho(String carteiraTrabalho){
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public void atenderCLiente(String nomeCliente){
        System.out.println("Em que posso ajudar senhor " + nomeCliente);
    }

    public void organizarSetor(){
        System.out.println("Seu setor está organizado!");
    }

    public void fazerPedidos(int qtdPedidos){
        System.out.println("Você tem " + qtdPedidos + " em aberto!");
    }

    public void fecharCaixa(String situacaoCaixa){
        System.out.println("O resultado final do fechamento do caixa foi: " + situacaoCaixa);
    }
}
