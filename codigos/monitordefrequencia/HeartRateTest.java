package monitordefrequencia;

public class HeartRateTest 
{
 public static void main(String[] args) 
 {
    HeartRate frequencia = new HeartRate("matheus","kawamura",23);
    FMaximaAlvo.FMaximaAlvo(frequencia);
    int fcm = 220-frequencia.getIdade();
    double fca= fcm*0.7;
    double fca2= fcm*0.5;
    System.out.printf("%nfrequência cardiaca máxima é %.2f e frequência cardiaca alvo %.2f",fca,fca2);
 }   
}
