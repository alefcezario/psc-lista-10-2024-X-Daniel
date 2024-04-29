public class Roupa {
    private String cor;
    private String tipoTecido;
    private String tamanho;
    private String tipo;
    private String marca;

    public Roupa(String cor, String tipoTecido, String tamanho, String tipo, String marca){
        this.cor = cor;
        this.tipoTecido = tipoTecido;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getTipoTecido(){
        return tipoTecido;
    }
    public void setTipoTecido(String tipoTecido){
        this.tipoTecido = tipoTecido;
    }

    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void vestir(String tipo){
        System.out.println(" A modelo está vestida de " + tipo);
    }

    public void estilizar(){
        System.out.println("Todos estão bem vestidos e com estilo!");
    }

    public void proteger(){
        System.out.println("Uma boa blusa de frio pode proteger bem de resfriados");
    }
}
