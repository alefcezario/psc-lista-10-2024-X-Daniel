public class Musica {
    private String estilo;
    private String nome;
    private String tempo;
    private String cantor;
    private String compositor;
    private String album;

    public Musica(String estilo,String nome, String tempo,String cantor, String compositor,  String album  ){
        this.estilo = estilo;
        this.nome = nome;
        this.tempo = tempo;
        this.cantor = cantor;
        this.compositor = compositor;
        this.album = album;
    }

    public String getEstilo(){
        return estilo;
    }
    public void setEstilo(String estilo){
        this.estilo = estilo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTempo(){
        return tempo;
    }
    public void setTempo(String tempo){
        this.tempo = tempo;
    }

    public String getCantor(){
        return cantor;
    }
    public void setCantor(String cantor){
        this.cantor = cantor;
    }

    public String getCompositor(){
        return compositor;
    }
    public void setCompositor(String compositor){
        this.compositor = compositor;
    }

    public String getAlbum(){
        return album;
    }
    public void setAlbum(String album){
        this.album = album;
    }

    public void relaxar(String nomeMusica){
        System.out.println("Você está ouvindo: " + nomeMusica);
    }

    public void preencherAmbiente(){
        System.out.println("Tutz tutz tutz tutz tutz paaaaa");
    }

    public void tocar(){
        System.out.println("Alexa, toca malária carey");
    }
}
