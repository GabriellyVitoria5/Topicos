/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico1_gabriellyvitoria;

public class Curso {
    private String nome, descricao, nivel;
    private int numero, horas;
    private Departamento depart;

    public Curso(String nome, String descricao, int numero, int horas, String nivel, Departamento depart) {
        this.nome = nome;
        this.descricao = descricao;
        this.numero = numero;
        this.horas = horas;
        this.nivel = nivel;
        this.depart = depart;
    }

    public int getNumeroCurso() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nDescrição: " + descricao + "\nNível: " + nivel + "\nNúmero: " + numero + "\nHoras: " + horas + "\n" + depart;
    }    
    
}
