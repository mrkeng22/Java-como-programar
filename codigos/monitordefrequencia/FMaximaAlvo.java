package monitordefrequencia;

public class FMaximaAlvo 
{
    private int coringa;
    public static void FMaximaAlvo(HeartRate heartRate1)
    {
        String nome =  heartRate1.getNome();
        String sobreNome = heartRate1.getSobreNome();
        int  idade = heartRate1.getIdade();
        System.out.printf("nome: %s, sobrenome: %s, idade:%d",heartRate1.getNome(),heartRate1.getSobreNome(),
        heartRate1.getIdade());
    }
}
