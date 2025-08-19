package POO.aula1;

import java.util.Date;
import java.util.Scanner;

//Criar private e criar os getters e setter
//Criar um objeto cliente no main
public class Cliente {
    private String nome;
    private  String cpf;
    private String telefone;
    private String dataNascimento;
    private String email;
    private String senha;
    // metodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void formulario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        setNome(scanner.next());
        System.out.println("Digite seu cpf:");
        setCpf(scanner.next());
        System.out.println("Digite seu telefone:");
        setTelefone(scanner.next());
        System.out.println("Digite sua data de nascimento:");
        setDataNascimento(scanner.next());
        System.out.println("Digite seu e-mail:");
        setEmail(scanner.next());
        System.out.println("Digite seu senha");
        setSenha(scanner.next());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\n' +
                " cpf='" + cpf + '\n' +
                " telefone='" + telefone + '\n' +
                " dataNascimento='" + dataNascimento + '\n' +
                " email='" + email + '\n' +
                " senha='" + senha + '\n' +
                '}';
    }
}
