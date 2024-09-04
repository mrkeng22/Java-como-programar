package account;

public class AccountDisplay {
    private Account accountToDisplay;
    public static void AccountDisplay(Account accountToDisplay)
    {
        String nome = accountToDisplay.getNome();
        double saldo = accountToDisplay.getValor();

        System.out.printf("%n%nconta %s : saldo: %.2f%n%n", nome, saldo);
    }
    
}
