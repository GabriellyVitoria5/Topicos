/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico1_gabriellyvitoria;

public class Disciplinas {
    private String nomeDisciplina, nomeProf, semestre, curso;
    private int ano, numero;
    
    public Disciplinas(String nomeDisciplina, String nomeProf, String curso, String semestre, int ano, int numero) {
        this.nomeDisciplina = nomeDisciplina;
        this.nomeProf = nomeProf;
        this.curso = curso;
        this.semestre = semestre;
        this.ano = ano;
        this.numero = numero;
    }

    public int getNumeroDisciplina() {
        return numero;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    
    public void setNumeroDisciplinas(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nome da disciplina: " + nomeDisciplina + "\nNome do Professor: " + nomeProf + "\nCurso: " + curso + "\nSemestre: " + semestre + "\nAno: " + ano + "\nNúmero da disciplina: " + numero;
    } 
    
}
