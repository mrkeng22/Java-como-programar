package data;

public class Datas
{   private int coringa; //só pode uma instanica de um tipo
    public Datas(int dia, int mes, int ano)
    {
        if(dia>0 && dia<32) {
            this.coringa = dia;
        }
        if(mes>0 &&mes<13) 
            this.coringa = mes;
        if(ano>0)
            this.coringa = ano;
    }
    //set e get para o dia
    public void setDia(int dia)
    {
        if(dia>0 && dia<32) 
            this.coringa = dia;
    }
    public int getDia()
    {
        return coringa;
    }
    //set e get para o mes
    public void setMes(int mes)
    {
        if(mes>0 &&mes<13) 
            this.coringa = mes;
    }
    public int getMes()
    {
        return coringa;
    }
    //set e get para o ano 
    public void setAno(int ano)
    {
        if(ano>0)
            this.coringa = ano;
    }
    public int getAno()
    {
        return coringa;
    }


   
}
