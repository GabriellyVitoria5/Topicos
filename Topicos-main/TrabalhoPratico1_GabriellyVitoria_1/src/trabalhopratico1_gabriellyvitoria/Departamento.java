/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico1_gabriellyvitoria;

public class Departamento {
    private String nome;
    private int codigo, numeroSala, telefone;

    public Departamento(String nome, int codigo, int numeroSala, int telefone) {
        this.nome = nome;
        this.codigo = codigo;
        this.numeroSala = numeroSala;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Nome do departamento: " + nome + "\nCódigo: " + codigo + "\nNúmero da sala: " + numeroSala + "\nTelefone: " + telefone;
    }
    
}
