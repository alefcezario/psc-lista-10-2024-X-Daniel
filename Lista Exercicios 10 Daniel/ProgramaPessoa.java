public class ProgramaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Alef",24, 1.70, "94202585478", "azuis");

        System.out.println(pessoa.getNome() + " esta comendo ");
        pessoa.comer("Arroz");
        pessoa.andar();
        pessoa.dormir();
        pessoa.comer("Salada");
        pessoa.viajar();
        pessoa.cantar();
        System.out.println("A pessoa de nome " + pessoa.getNome() + ", tem " + pessoa.getIdade() + " anos, "
                         + pessoa.getAltura() + " metros de altura. Seu CPF é: " + pessoa.getCpf() + " e seus lindos olhos são de cor: " + pessoa.getCordosolhos());
    }
}
