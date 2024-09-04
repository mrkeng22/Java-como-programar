package valor;
import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args)
    {
        Invoice invoice = new Invoice("1","caixa",4,5.0);
        Scanner input = new Scanner(System.in);
        System.out.printf("os itens inicias são numero: %s, descrição: %s, quantidade: %d, preço: %.2f ",
        invoice.getNumero(),invoice.getDescricao(),invoice.getQuantItem(),invoice.getPreco());
        System.out.printf("%n a fatura é: %.2f", invoice.getInvoiceAmount());

    }
    
}
