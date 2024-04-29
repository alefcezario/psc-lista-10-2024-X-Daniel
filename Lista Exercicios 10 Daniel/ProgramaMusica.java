public class ProgramaMusica {
    public static void main(String[] args) {
        Musica musica = new Musica("Pop", "Raindrops", "1:52", "Ariana grande", "Malária carey", "Swetner");

        musica.relaxar(musica.getNome());

        musica.preencherAmbiente();
        musica.tocar();

        System.out.println("A cantora " + musica.getCantor() + " é melhor que a compositora " + musica.getCompositor());

    }
}
