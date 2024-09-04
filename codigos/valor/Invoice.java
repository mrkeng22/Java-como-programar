//exercicio 3.12
package valor;
public class Invoice
{
    //fazer as variaveis de instancias
    private String numero;
    private String descricao;
    private int quantItem;
    private double preco;
    //criar o construtor Invoice com 4 parametros 
    public Invoice(String numero, String descricao, int quantItem, double preco)
    {
        this.numero = numero;
        this.descricao = descricao;
        if(quantItem>0.0)
            this.quantItem = quantItem;
        if(preco>0.0)
            this.preco = preco;
    }//fim do construtor
    
    
    //fazer os metodos set e get para numero
    public void setNumero(String numero)
    {
        this.numero = numero;
    }
    public String getNumero()
    {
        return numero;
    }//fim dos metodos set e get para numero
    
    
    //metodos set e get para descricao
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    public String getDescricao()
    {
        return descricao;
    }
    //fim dos metodos set e get para descricao
    
    
    //metodos set e get para o quantItem
    public void setQuantItem()
    {
        if(quantItem>0.0){this.quantItem=quantItem;}
    }
    public int getQuantItem()
    {
        return quantItem;
    }//fim do metodo set e get para quantItem
    

    //metodo set e get para preco
    public void setPreco(double preco)
    {
        if(preco>0.0){this.preco=preco;}
    }
    public double getPreco()
    {
        return preco;
    }
    //metodo para o produto de preco e quantItem
    /**
     * @return
     */
    public double getInvoiceAmount()
    {
        double produto =  preco*quantItem; 
        return produto;
    }
}