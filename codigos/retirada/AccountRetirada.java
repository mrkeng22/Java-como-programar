package retirada;

public class AccountRetirada 
{   
    //criar as duas variaveis de instancias
    private String name;
    private double valor;
    //construtor
    public AccountRetirada(String name, double valor)
    {
        this.name = name;
        if(valor>0.0)
            this.valor=valor;
    } 
    //método para retirada
    public void retirar(double retirada)
    {
        //condições para fazer a retirada
        if(retirada<valor)
            this.valor=valor - retirada;
        if(retirada>valor)
            System.out.println("valor de debito excedido");

    }
    //método para visualizar
    public double getRetirar()
    {
        return valor;
    }
    //método para alterar o nome
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

}
