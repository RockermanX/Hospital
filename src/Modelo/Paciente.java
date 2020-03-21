/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Modelo.Municipio;
/**
 *
 * @author Camilo
 */
import java.util.ArrayList;
public class Paciente {
    
   private String nombre;
   private int id;
   private String tipo_id;
   private String fecha_nac;
   private String telefono1;
   private String telefono2;
   private Municipio objM;

    public Paciente(String nombre, int id, String tipo_id, String fecha_nac, String telefono1, String telefono2, Municipio objM) {
        this.nombre = nombre;
        this.id = id;
        this.tipo_id = tipo_id;
        this.fecha_nac = fecha_nac;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.objM = objM;
    }
   
   
    public Paciente() {
        this.nombre = "";
        this.id = 0;
        this.tipo_id = "";
        this.fecha_nac="";
        this.telefono1 = "";
        this.telefono2 = "";
        this.objM= new Municipio();
    }

    public Municipio getObjM() {
        return objM;
    }

    public void setObjM(Municipio objM) {
        this.objM = objM;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(String tipo_id) {
        this.tipo_id = tipo_id;}

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }


    

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    @Override
    public String toString() {
        return "Datos Registrados del paciente:\n" + "Nombre= " + nombre + "\nId= " + id + "\nTipo de Id= " + tipo_id 
                + "\nFecha de Nacimiento= " + fecha_nac + "\nPrimer telefono= " + telefono1 +"\nSegundo telefono= "+telefono2+ "\nMunicipio= " + objM.getNombre()  ;
    }

 
}
