public class Filme {
    private String titulo;
    private int anoLancamento;
    private String genero;
    private String diretor;
    private String elenco;

    public Filme(String titulo, int anoLancamento, String genero, String diretor, String elenco){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.diretor = diretor;
        this.elenco = elenco;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getDiretor(){
        return diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public String getElenco(){
        return elenco;
    }
    public void setElenco(String elenco){
        this.elenco = elenco;
    }

    public void entreter(String nomeFilme){
        System.out.println("Você está assisntindo: " + nomeFilme);
    }

    public void contarHistorias(String elenco){
        System.out.println("A atriz " + elenco + " está musica empolgada com a história do filme");
    }

    public void gerarRendaEstudio(String nomeFilme, double bilheteria){
        System.out.println("o filme " + nomeFilme + " fez R$" + bilheteria + "em sua primeira semana de estreia");
    }
}
