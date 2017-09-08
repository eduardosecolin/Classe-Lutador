
package ultraemojicombat;
public class Lutador {
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private String idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //METODOS ESPECIAIS

    public Lutador(String nome, String nacionalidade, String idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Invalido!";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido!";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //METODOS
    public String apresentar(){
       String x = "\t\tSTREET FIGHTER" + "\n" +
       "---------------------------------------------------------------------------------\n" +
       "Chegou a hora apresentamos o lutador: " + this.getNome() + "\n" + 
       "Diretamente da(o): " + this.getNacionalidade() + "\n" +
       "Com : " + this.getIdade() + " anos e " + this.getAltura() + " de altura e pesando: " + this.getPeso() + "\n" + 
       this.getVitorias() + " Vitórias" + "\n" + 
       this.getDerrotas() + " Derrotas" + "\n" + this.getEmpates() + " Empates"; 
       return x;
    }
    public String status(){
        String x = "\t**** INFORMAÇÕES DO LUTADOR ****" + "\n" + 
        this.getNome() + " é um peso " + this.getCategoria() + "\n" + 
        "Ganhou " + this.getVitorias() + " vezes" + "\n" +
        "Perdeu " + this.getDerrotas() + " vezes" + "\n" +
        "Empatou " + this.getEmpates() + " vezes";
        return x;
    }
    public void ganharLuta(){
       this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
       this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
       this.setEmpates(this.getEmpates() + 1);
    }
}
