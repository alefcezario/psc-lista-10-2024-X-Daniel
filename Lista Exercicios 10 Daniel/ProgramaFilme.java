public class ProgramaFilme {
    public static void main(String[] args) {
        Filme filme = new Filme("Wicked", 2025, "Fantasia", "Meredith Grey", "Ariana Grande");

        filme.entreter("Wicked");
        filme.contarHistorias(filme.getElenco());
        filme.gerarRendaEstudio(filme.getTitulo(), 1950.00);

        System.out.println(filme.getTitulo());
        System.out.println(filme.getAnoLancamento());
        System.out.println(filme.getGenero());
        System.out.println(filme.getDiretor());
        System.out.println(filme.getElenco());
    }
}
