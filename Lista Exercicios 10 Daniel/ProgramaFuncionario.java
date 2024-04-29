public class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Fernando Pereira", "200.500.500", "Estoqeuista", 1412.00);

        funcionario.atenderCLiente("Mario Joaquim");
        funcionario.organizarSetor();
        funcionario.fazerPedidos(52);
        funcionario.fecharCaixa("Quebra de caixa");

        System.out.println("Funcionario " + funcionario.getNome() + " da carteira de trabalho numero " + funcionario.getCarteiraTrabalho() + 
                        " cujo cargo é " + funcionario.getCargo() + " e salario mensal de R$ " + funcionario.getSalario());
    }
}