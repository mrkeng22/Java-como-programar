package computadorizacao;

public class Display 
{
    public static void Display(HealthProfile disProfile)
    {
        System.out.printf(
        "suas infomações%nnome\t%s%nsobrenome\t%s%nsexo\t%s%nidade\t%d%ndia\t%d%nmes\t%d%nano\t%d%npeso\t%.2f%naltura\t%.2f",
        disProfile.getNome(), disProfile.getSobreNome(), disProfile.getSexo(),
        disProfile.getIdade(),disProfile.getDia(),disProfile.getMes(),disProfile.getAno(),disProfile.getPeso(),
        disProfile.getAltura()); 
   
    }   

}
