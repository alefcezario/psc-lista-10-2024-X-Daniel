public class ProgramaEndereco {
  public static void main(String[] args) {
    
  
    Endereco endereco = new Endereco("Rua Ursula Paulino ", 22, "Novo Progresso", "Contagem", "Minas Gerais", "30.680.980") ;

   endereco.localizar();
   endereco.receberEncomendas("Tem encomenda na portaria!");
   endereco.calcularDistancia(57.05);

   System.out.println(endereco.getRua());
   System.out.println(endereco.getNumero());
   System.out.println(endereco.getBairro());
   System.out.println(endereco.getCidade());
   System.out.println(endereco.getCep());

  }
}
