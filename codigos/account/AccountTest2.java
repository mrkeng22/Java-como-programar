package account; 

import java.util.Scanner;
public class AccountTest2
    {
    public static void main(String[] args) 
    {   //chamando os construtor
        Account account1 = new Account("Matheus",40.0);
        Account account2 = new Account("Wendel",10.00);
        //para o usuario digitar os valores
        Scanner input = new  Scanner(System.in);
        //mostrando os valores iniciais da conta
        System.out.printf("o valor da conta %s é %.2f%n",account1.getNome(),account1.getValor());
        System.out.printf("o valor da conta %s é %.2f%n",account2.getNome(), account2.getValor());
        //pedindo para o usario digitar o valores
        System.out.printf("qual valor você quer depositar na conta %s%n", account1.getNome());
        double depositar = input.nextDouble();
        account1.deposito(depositar);

        System.out.printf("o valor deposiado é %.2f" ,account1.getValor());
        //deposistando na account2
        System.out.printf("%ndeposite um valor na conta %s ", account2.getNome());
        double depositar2 = input.nextDouble();
        account2.deposito(depositar2);
        System.out.printf("%n o valor depositado é %.2f",account2.getValor());


                
    }
}