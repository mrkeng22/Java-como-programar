package computadorizacao;

public class HealthProfile 
{
    private String texto;
    private int numeros;
    private double flutuante;
    public HealthProfile(String nome, String sobreNome, String sexo, int idade, 
    int dia, int mes, int ano,int altura, int peso)
    {
        this.texto = nome;
        this.texto = sobreNome;
        this.texto = sexo; 
        this.numeros = idade; 
        this.numeros = dia;
        this.numeros = mes;
        this.numeros = ano;this.flutuante = altura;this.flutuante = peso;
    }
    //metodo get e set para nome 
    public void setNome(String nome)
    {
        this.texto = nome;
    }
    public String getNome()
    {
        return texto;
    }
    //metodo set e get para o sobrenome
    public void setSobreNome(String sobreNome)
    {
        this.texto = sobreNome;
    }
    public String getSobreNome()
    {
        return texto;
    }
    //método set e get para sexo
    public void setSexo(String sexo)
    {
        this.texto = sexo;
    }
    public String getSexo()
    {
        return texto;
    }
    //set e get idade
    public void setIdade(int idade)
    {
        if(idade>0)
            this.numeros = idade;
        if(idade<0)
            System.out.printf("valor invalido");
    }
    public int getIdade()
    {
        return numeros;
    }
    //set e get dia
    public void setDia(int dia)
    {
        if(dia>0)
            this.numeros = dia;
        if(dia<0)
            System.out.printf("valor invalido");
    }
    public int getDia()
    {
        return numeros;
    }
    //set e get mes
    public void setMes(int mes)
    {
        if(mes>0 &&mes<13)
            this.numeros = mes;
        if(mes<0 && mes<13)
            System.out.printf("valor invalido");
    }
    public int getMes()
    {
        return numeros;
    }
    //set e get para ano
    public void setAno(int ano)
    {
        if(ano>0)
            this.numeros = ano;
        if(ano<0)
            System.out.printf("valor invalido");
    }
    public int getAno()
    {
        return numeros;
    }
    //set e get para peso
    public void setPeso(double peso)
    {
        if(peso>0)
            this.flutuante = peso;
        if(peso<0)
            System.out.printf("valor invalido");
    }
    public double getPeso()
    {
        return flutuante;
    }
    //set e get para altura
    public void setAltura(double altura)
    {
        if(altura>0)
            this.flutuante = altura; 
        if(altura<0)
            System.out.printf("valor invalido");
    }
    public double getAltura()
    {
        return flutuante;
    }
}