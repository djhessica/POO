package Exercicio200825.ProdutoIndustrial.MaquinaDeProducao.Maquina;
/*Desenvolva uma classe Maquina que modele uma máquina industrial. Ela deve ter
atributos para identificação, capacidade máxima de produção por hora e status
        (ligada/desligada). Crie métodos para ligar/desligar a máquina e calcular a produção
diária baseada em horas trabalhadas*/
public class Maquina {
    private String maquina;
    private double capacidadeMaximaProducaoPorHora;
    private boolean status = false;
    private  double horasTrabalhadas;
    private double producaoDiaria;

    // método produção diaria
    public void producaoDiaria(){
        producaoDiaria = capacidadeMaximaProducaoPorHora * horasTrabalhadas;
    }
    //Método para ligar a maquina
    public void ligarMaquina() {
        status = true;
        System.out.println("À maquina esta ligada ");
    }
    //método para desodopara deslisgar á maquina
    public void desligarMaquina(){
        status = false;
        System.out.println("Á maquima esta desligada ");
    }
}
