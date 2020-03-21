/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Camilo
 */
public class Horario_c {
    private int codigo;
    private String hora_c;
    
    public Horario_c(int codigo, String hora_c) {
        this.codigo = codigo;
        this.hora_c = hora_c;
    }

     public Horario_c() {
        this.codigo = 0;
        this.hora_c = "";
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getHora_c() {
        return hora_c;
    }

    public void setHora_c(String hora_c) {
        this.hora_c = hora_c;
    }
    
   
}
