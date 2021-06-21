/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico1_gabriellyvitoria;

public class Historico {
    private String notaConceito;
    private int notaNumerica;

    public Historico(String notaConceito, int notaNumerica) {
        this.notaConceito = notaConceito;
        this.notaNumerica = notaNumerica;
    }
    
    public int getNotaNumerica() {
        return notaNumerica;
    }
    
    public void setNotaConceito(String notaConceito) {
        this.notaConceito = notaConceito;
    }

    public void setNotaNumerica(int notaNumerica) {
        this.notaNumerica = notaNumerica;
    }

    @Override
    public String toString() {
        return "Nota de conceito: " + notaConceito + "\nNota numérica: " + notaNumerica;
    }
    
    
}
