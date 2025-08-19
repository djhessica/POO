package POO.aula1;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String nome;
//        Conta conta;
//        //Construir um objeto conta
//        conta = new Conta();
//        conta.setNumero(01);
//        conta.setTitular("Djhessica");
//        conta.setSaldo(10000);
//        conta.imprimirDados();
//
//        //criar uma conta2
//        //pedir para o usuario pedir os dados
//        Conta conta2;
//        conta2 = new Conta();//Chamado metodo construtor de conta
//        System.out.println("Digite o Nome do titular da Conta:");
//        conta2.setTitular(scanner.next());
//        System.out.println("Digite o Numero da Sua Conta;");
//        conta2.setNumero(scanner.nextInt());
//        conta2.setSaldo(0);
//        conta2.depositar();
//        conta2.sacar();
//        conta2.imprimirDados();

      Cliente cliente;
        cliente = new Cliente();
        System.out.println(cliente.toString());

        Cliente cliente1;
        cliente1 = new Cliente();
        cliente1.formulario();
        System.out.println(cliente1.toString());



    }
}
