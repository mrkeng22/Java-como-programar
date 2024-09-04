package monitordefrequencia;

public class HeartRate 
{
    //instancias
    private String texto;
    private int numeros;
    //construtor
    public HeartRate(String nome, String sobreNome, int idade)
    {
        this.texto=nome;
        this.texto=sobreNome;
        if(idade>0)
            this.numeros=idade;
    } 
    //metodos set e get para nome
    public void setNome(String nome)
    {
        this.texto = nome;
    }   
    public String getNome()
    {
        return texto;
    }
    //set e get para sobrenome
    public void setSobreNome(String sobreNome)
    {
        this.texto = sobreNome;
    }
    public String getSobreNome()
    {
        return texto;
    }
    //set e get para idade
    public void setIdade(int idade)
    {
        if(idade>0)
            this.numeros = idade;
    }
    public int getIdade()
    {
        return numeros;
    }
    
    
}
