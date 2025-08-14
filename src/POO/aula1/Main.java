package POO.aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        Conta conta;
        //Construir um objeto conta
        conta = new Conta();
        conta.numero = 01;
        conta.titular = "Djhessica";
        conta.saldo = 110000;
        conta.imprimirDados();
        //criar uma conta2
        //pedir para o usuario pedir os dados
        Conta conta2;
        conta2 = new Conta();//Chamado metodo construtor de conta
        System.out.println("Digite o Nome do titular da Conta:");
        conta2.titular = scanner.next();
        System.out.println("Digite o Numero da Sua Conta;");
        conta2.numero = scanner.nextInt();
        conta2.saldo = 0;
        conta2.depositar();
        conta2.sacar();
        conta2.imprimirDados();




    }
}
