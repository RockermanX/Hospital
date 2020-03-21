/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Camilo
 */
public class Medico {
   private String nombre;
   private int id;
   private String tipo_id;
   private String direccion;
   private String hora_i;
   private String hora_f;
   private String telefono1;
   private String telefono2;
   private Municipio objm;
   private Especialidad objE;
   
  public Medico(String nombre,int id,String tipo_id,String direccion,String hora_i,String hora_f, String telefono1,String telefono2,Municipio objm,Especialidad objE){
       this.nombre=nombre;
       this.id=id;
       this.tipo_id=tipo_id;
       this.direccion=direccion;
       this.hora_i=hora_i;
       this.hora_f=hora_f;
       this.telefono1=telefono1;
        this.telefono2=telefono2;
       this.objm=objm;
       this.objE=objE;
   }
  
    public Medico(){
       this.nombre="";
       this.id=0;
       this.tipo_id="";
       this.direccion="";
       this.hora_i="";
       this.hora_f="";
       this.telefono1="";
       this.telefono2="";
       this.objm = new Municipio();
       this.objE = new Especialidad();
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
        this.tipo_id = tipo_id;
    }

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


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHora_i() {
        return hora_i;
    }

    public void setHora_i(String hora_i) {
        this.hora_i = hora_i;
    }

    public String getHora_f() {
        return hora_f;
    }

    public void setHora_f(String hora_f) {
        this.hora_f = hora_f;
    }

    public Municipio getObjm() {
        return objm;
    }

    public void setObjm(Municipio objm) {
        this.objm = objm;
    }

    public Especialidad getObjE() {
        return objE;
    }

    public void setObjE(Especialidad objE) {
        this.objE = objE;
    }

  

    @Override
    public String toString() {
        return "Datos registrados del medico\n" + "Nombre= " + nombre + "\nId= " + id + "\nTipo de Id= " + tipo_id + "\nDirección= " + direccion 
                + "\nHora de entrada= " + hora_i + "\nHora de salida= " + hora_f + "\nTelefono 1= " + telefono1 + "Telefono 2= "+telefono2+"\nMunicipio= " + objm.getNombre()
                +"\nEspecialidad= "+objE.getNombre();
    }
  
}
