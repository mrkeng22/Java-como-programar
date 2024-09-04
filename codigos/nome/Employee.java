package nome;
public class Employee
{
    private String nome;
    private String sobrenome;
    private double mensal;
    //criar construtor
    public Employee(String nome, String sobrenome, double mensal)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(mensal>0.0)
            this.mensal = mensal;
    }
    //crair metodo set e get para nome
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return nome;
    }
    //metodo set e get para sobrenome 
    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome()
    {
        return sobrenome;
    }
    //metodo set e get mensal
    public void setMensal(double mensal)
    {
        if(mensal>0.0)
            this.mensal = mensal;
    }
    public double getMensal()
    {
        return mensal;
    }
}
