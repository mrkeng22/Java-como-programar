package computadorizacao;

import java.util.Scanner;

public class HealthProfileTest 
{
    private String texto;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        HealthProfile pessoa1 = new HealthProfile(null,
         null, null, 0, 0, 0, 0, 0, 0);
        // usando o input para inserir as informaçãoes
        System.out.println("insira seu nome e nome");
        pessoa1.setNome(input.nextLine());
        System.out.println("insira seu sobrenome:");
        pessoa1.setSobreNome(input.nextLine());
        System.out.println("insira seu sexo:");
        pessoa1.setSexo(input.nextLine());
        System.out.println("insira o dia em que você nasceu:");
        pessoa1.setDia(input.nextInt());
        System.out.println("informa o mes que voce nasceu");
        pessoa1.setMes(input.nextInt());
        System.out.println("informe o ano que voce nasceu");
        pessoa1.setAno(input.nextInt());
        System.out.println("insisra sua altura:");
        pessoa1.setAltura(input.nextDouble());
        System.out.println("insira seu peso");
        pessoa1.setPeso(input.nextDouble()); 
        Display.Display(pessoa1);       
    }
}
