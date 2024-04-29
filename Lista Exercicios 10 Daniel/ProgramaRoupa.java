public class ProgramaRoupa {
    public static void main(String[] args) {
        Roupa roupa = new Roupa("Amarelo", "Couro vegano", "GGG", "Croped", "Zara");

        roupa.vestir(roupa.getTipo());
        roupa.estilizar();
        roupa.proteger();

        System.out.println(roupa.getCor());
        System.out.println(roupa.getTipoTecido());
        System.out.println(roupa.getTamanho());
        System.out.println(roupa.getTipo());
        System.out.println(roupa.getMarca());
    }
    
}
