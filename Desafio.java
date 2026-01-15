import javax.swing.*;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Henry";
        String tconta = "Poupansa";
        double saldo = 2565.25;
        int Opcao = 0;

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tconta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        String Menu = """
                ** Digite sua opção **
                
                1- Consultar Saldo:
                2- Transferir valor:
                3- Receber valor:
                4- Sair
                
                
                """;
        Scanner leitura = new Scanner(System.in);


        while (Opcao != 4) {
            System.out.println(Menu);
            Opcao = leitura.nextInt();

            if (Opcao == 1) {
                System.out.println("O Saldo atualizado é " + saldo);
            } else if (Opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não a valor para realizar a tranferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo Saldo " + saldo);


                }

            } else if (Opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);

            } else if (Opcao != 4) {
                System.out.println("Opção invalida!");
            }

        }
    }

}