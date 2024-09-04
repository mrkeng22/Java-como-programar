package nome;

import java.util.Scanner;

public class EmployeeTest
{
   public static void main(String[] args)
   {
      //chamando construtor usao new e fazendo informacao como variavel do tipo referencial
        Employee inforamacao = new Employee(null, null, 0);
        //chamando a class Scanner para input para receber e ler o que o usario coloca
         //colocando os input para cada metodo reber o valor digitado pelo usario
        Scanner input = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String name = input.nextLine();
        inforamacao.setNome(name);
        System.out.println("digite seu sobrenome:");
        String sobrename = input.nextLine();
        inforamacao.setSobrenome(sobrename);
        System.out.println("digite sua renda mensal:");
        double renda = input.nextDouble();
        inforamacao.setMensal(renda);
        
        System.out.printf(" seu nome é %s %s e sua renda mensal é %.2f",
         inforamacao.getNome(),inforamacao.getSobrenome(),inforamacao.getMensal());



   } 
}