package POO.aula1;

import java.util.Scanner;

//Classe servi de molde
public class Conta {
   private int numero;
   private String titular;
   private double saldo;
    double ValorDeposito;
    //Getter - para pegar o conteudo da variavel
    public int getNumero() {
        return numero;
    }
    //Setter - setar o conteudo(declarar , atribuir)
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setValorDeposito(double valorDeposito) {
        ValorDeposito = valorDeposito;
    }

    public double getValorDeposito() {
        return ValorDeposito;
    }

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
