package POO.aula1;

import java.util.Scanner;

//Classe servi de molde
public class Conta {
    int numero;
    String titular;
    double saldo;
    double ValorDeposito;
    //Função da conta
    public void imprimirDados(){//conta.imprimirDados();
        System.out.println("*** Dados da Conta ***");
        System.out.println("Numero: " +this.numero);
        System.out.println("Titular: " +this.titular);
        System.out.println("Saldo: " +this.saldo);

    }
    public void sacar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor se Saque: ");
        double ValorSaque = scanner.nextDouble();
        if (ValorSaque > saldo){
            System.out.println("Você não tem saldo suficiente;");
        } else if (ValorSaque <= saldo) {
            System.out.println("Transação comcluida");
        }
        this.saldo -= ValorSaque;
        double soma = saldo - ValorSaque;
        System.out.println("Valor do Saque: " + soma);
    }
    public void depositar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você quer depositar?");
        ValorDeposito = scanner.nextDouble();
        this.saldo += ValorDeposito;
        System.out.println("Saldo Atual: "+this.saldo);
    }
}
