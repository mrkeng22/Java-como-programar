package retirada;
import java.util.Scanner;
public class AccountRetiradaTest
{
    public static void main(String[] args)
    {
        //fazer a chamada do construtor
        AccountRetirada account1 = new AccountRetirada("matheus", 50.00);
        Scanner input = new Scanner(System.in);
        System.out.printf("o valor na conta %s é %.2f", account1.getName(),account1.getRetirar());
        System.out.printf("%n%nqual valor você que retirar da conta %s", account1.getName());
        double debitar= input.nextDouble();
        account1.retirar(debitar);
        System.out.printf("%n o valor atual é %.2f",account1.getRetirar() );

    }
}

