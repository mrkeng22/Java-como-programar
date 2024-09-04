package account;

public class Account
{
    //criar duas instancias
    private String nome;
    private double valor;
    //criar tres metodos
    //primeiro um com o nome da class para recerber os valores que servirão para toda a class até que seja 
    //alterada pelos outros metodos
    public Account(String nome, double valor)
    {
        this.nome = nome;
        //colocar condição para poder receber o valor na instacia valor
        if(valor>0.0)
            this.valor=valor;
    }//fim do metodo Account
    //metodo para receber o valor digitado pelo usuario precisa ser void porque não pode retornar valor
    public void deposito(double montante)
    {
        if(montante>0.0)
            this.valor=valor+montante;
    }//fim do metodo deposito
    //metodo para exibir o valor
    public double getValor()
    {
        return valor;
    }
    //metodo para inserir o nome precisa ser void porque não pode retornar valor
    public void setNome(String nome)
    {
        this.nome=nome;
    }//fim do metodo setNome 
    public String getNome()
    {
        return nome;
    }
}
