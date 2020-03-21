
package Modelo;

/**
 *
 * @author Camilo
 */
public class Cita {
    private int codigo;
    private String fecha_r;
    private Sede objS;
    private Paciente objP;
    private Medico objM;
    private Horario_c objHC;
    private Estado objE;

    public Cita(int codigo, String fecha_r, Sede objS, Paciente objP, Medico objM, Horario_c objHC, Estado objE) {
        this.codigo = codigo;
        this.fecha_r = fecha_r;
        this.objS = objS;
        this.objP = objP;
        this.objM = objM;
        this.objHC = objHC;
        this.objE = objE;
    }

        public Cita() {
        this.codigo = 0;
        this.fecha_r = "";
        this.objS = new Sede();
        this.objP = new Paciente();
        this.objM = new Medico();
        this.objHC = new Horario_c();
        this.objE = new Estado();
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha_r() {
        return fecha_r;
    }

    public void setFecha_r(String fecha_r) {
        this.fecha_r = fecha_r;
    }

    public Sede getObjS() {
        return objS;
    }

    public void setObjS(Sede objS) {
        this.objS = objS;
    }

    public Paciente getObjP() {
        return objP;
    }

    public void setObjP(Paciente objP) {
        this.objP = objP;
    }

    public Medico getObjM() {
        return objM;
    }

    public void setObjM(Medico objM) {
        this.objM = objM;
    }

    public Horario_c getObjHC() {
        return objHC;
    }

    public void setObjHC(Horario_c objHC) {
        this.objHC = objHC;
    }

    public Estado getObjE() {
        return objE;
    }

    public void setObjE(Estado objE) {
        this.objE = objE;
    }

    @Override
    public String toString() {
        return "Datos registrados de la cita" 
                + "\nCodigo= " + codigo + "\nFecha= " + fecha_r + "\nDirección de la sede= " +objS.getDireccion() 
                + "\nConsultorio de sede= " + objS.getConsultorio() + "\nId del paciente a atender= " + objP.getId() 
                + "\nId del medico= " + objM.getId() + "\nHora de la cita= " + objHC.getHora_c() +"\nEspecialidad= "+objE.getTipo() ;
    }


}
    
    

    

