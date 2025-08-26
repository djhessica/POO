package Exercicio200825.ProdutoIndustrial.MaquinaDeProducao.Funcionario;

//Crie uma classe Funcionario que represente um trabalhador de uma indústria. A
//classe deve ter atributos para nome, matrícula, turno (manhã, tarde, noite) e salário
//base. Implemente métodos para calcular o salário final (considerando adicional noturno
//de 20% para turno da noite) e exibir os dados do funcionário.
public class Funcionario {
    private String nome;
    private int matricula;
    private String turno;
    private double salarioBase;
    //metodos construtores
    //Construtor padaro vazio

    //construtor com parametros
    public Funcionario() {
        this.nome = nome;
        this.turno = turno;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public void salarioBase() {
        if (turno.equalsIgnoreCase("noite")) {
            salarioBase = salarioBase * 1.2;
        }
        this.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase() {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", turno='" + turno + '\'' +
                ", salarioBase='" + salarioBase + '\'' +
                '}';
    }
}