package account; 

import java.util.Scanner;
public class AccountTestModificad
    {
    public static void main(String[] args) 
    {   //criando os construtor
        Account account1 = new Account("Matheus",40.0);
        Account account2 = new Account("Wendel",10.00);
        AccountDisplay.AccountDisplay(account1);
        AccountDisplay.AccountDisplay(account2);
        
        //para o usuario digitar os valores
        Scanner input = new  Scanner(System.in);
        //mostrando os valores iniciais da conta
        //pedindo para o usario digitar o valores
        System.out.printf("qual valor você quer depositar na conta %s%n", account1.getNome());
        double depositar = input.nextDouble();
        account1.deposito(depositar);
        AccountDisplay.AccountDisplay(account1);
        //deposistando na account2
      
        double depositar2 = input.nextDouble();
        account2.deposito(depositar2);
        AccountDisplay.AccountDisplay(account2);

                
    }
}