/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico1_gabriellyvitoria;

public class Aluno {
    private String nome, cpf, endereco, sexo, dataNascimento,turma, programa, depart1, depart2;
    private int telefone, matricula;

    public Aluno(String nome, String cpf, String endereco, int telefone, String sexo, String dataNascimento, String turma, String programa, int matricula, String depart1, String depart2) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.turma = turma;
        this.programa = programa;
        this.matricula = matricula;
        this.depart1 = depart1;
        this.depart2 = depart2;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\nCpf: " + cpf + "\nEndereço: " + endereco + "\nSexo: " + sexo + "\nData de Nascimento: " + dataNascimento + "\nTurma: " + turma + "\nPrograma: " + programa + "\nTelefone: " + telefone + "\nMatricula: " + matricula;
    }

}
