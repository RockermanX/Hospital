/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.*;
import Vista.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




public class Controlador implements ActionListener,Runnable{
    
    Hora objH;
    Fecha objF;
    Thread hilo;
    frmPrincipal frmP;
    frmRegMedico frmM;
    frmRegPaciente frmPa;
    frmReg_Cita frmCM;
    frmRegSede frmS;
    frmRegMunicipio frmMu;
    frmRegEspecialidad frmE;
    frmTblCitasMedicas frmTblCM;
    frmTblMedico frmTblM;
    frmTblPaciente frmTblP;
    
    public Controlador() {
        hilo = new Thread((Runnable)this);
        objH = new Hora();
        objF = new Fecha();
        frmP = new frmPrincipal();
        frmM= new frmRegMedico();
        frmPa= new frmRegPaciente();
        frmCM= new frmReg_Cita();
        frmS= new frmRegSede();
        frmMu= new frmRegMunicipio();
        frmE= new frmRegEspecialidad();
        frmTblCM= new frmTblCitasMedicas();
        frmTblM= new frmTblMedico();
        frmTblP= new frmTblPaciente();
        
        
        frmP.getEscritorio().add(frmCM);
        frmP.getEscritorio().add(frmPa);
        frmP.getEscritorio().add(frmM);
        frmP.getEscritorio().add(frmTblCM);
        frmP.getEscritorio().add(frmTblM);
        frmP.getEscritorio().add(frmTblP);
        frmP.getEscritorio().add(frmS);
        frmP.getEscritorio().add(frmMu);
        frmP.getEscritorio().add(frmE);
        
        frmP.getMnuRegMedico().addActionListener(this);
        frmP.getMnuRegCita().addActionListener(this);
        frmP.getMnuRegPaciente().addActionListener(this);
        frmP.getMnuSalir().addActionListener(this);
        frmP.getMnuConCitas().addActionListener(this);
        frmP.getMnuConMedico().addActionListener(this);
        frmP.getMnuConPacientes().addActionListener(this);
        
        frmCM.getBtnMed_Esp().addActionListener(this);
        frmCM.getBtnPaciente().addActionListener(this);
        frmCM.getBtnSSede().addActionListener(this);
        frmCM.getBtnRegistroC().addActionListener(this);
        
   
       
        frmPa.getBtnRegistrarP().addActionListener(this);
        frmPa.getBtnMunicipio().addActionListener(this);
        
        
        frmM.getBtnRegistrarM().addActionListener(this);
        frmM.getBtnEspecial().addActionListener(this);
        frmM.getBtnMunicipio().addActionListener(this);
        
        frmS.getBtnRegistoS().addActionListener(this);
        frmMu.getBtnRegistoM().addActionListener(this);
        frmMu.getBtnRegistoMM().addActionListener(this);
        frmE.getBtnRegistoE().addActionListener(this);
        
        frmTblM.getBtnReg().addActionListener(this);
        frmTblP.getBtnRegC().addActionListener(this);
        
    }
    
    
    @Override
    public void run() {
      while(true){
      frmP.getLblHora().setText(objH.toString());
      objH.incSS();
        try {
            hilo.sleep(1000);
        }
        catch(InterruptedException e){
          JOptionPane.showMessageDialog(frmP, "Error al intentar interrumpir");
        }
      } 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if(e.getSource().equals(frmP.getMnuSalir())){//Menu para salir
            int resp=JOptionPane.showConfirmDialog(frmP,"¿Desea salir?","salir",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (resp==JOptionPane.YES_OPTION )
            {
            System.exit(0);
            }
            }  
           
           
           if(frmP.getMnuRegPaciente().equals(e.getSource())){
            frmPa.setVisible(true);
           }
           
            if(frmP.getMnuConPacientes().equals(e.getSource())){
                frmTblP.setVisible(true);
           }
           
            if(frmP.getMnuRegMedico().equals(e.getSource())){
            frmM.setVisible(true);
           }
           
            if(frmP.getMnuConMedico().equals(e.getSource())){
            frmTblM.setVisible(true);
           }
             if(frmP.getMnuRegCita().equals(e.getSource())){
            frmCM.setVisible(true);
           }
           
            if(frmP.getMnuConCitas().equals(e.getSource())){
            frmTblCM.setVisible(true);
           }
            
            
            if(frmPa.getBtnRegistrarP().equals(e.getSource())){ //condicional registro de paciente
            String tipo_id= String.valueOf(frmPa.getCmbTipoId().getSelectedItem());
            int dd= frmPa.getDataFecha().getCalendar().get(Calendar.DAY_OF_MONTH);
            int mm= (frmPa.getDataFecha().getCalendar().get(Calendar.MONTH)+1);
            int aa= frmPa.getDataFecha().getCalendar().get(Calendar.YEAR);
            String formatof= (aa+"/"+mm+"/"+dd);
           if( Validarfecha(formatof)==true){
            Paciente objPa= new Paciente();
            objPa.setTipo_id(tipo_id);
            objPa.setFecha_nac(formatof);
            if(Validarnombre(frmPa.getTxtNombreP().getText())==true){
            objPa.setNombre(frmPa.getTxtNombreP().getText());
            objPa.setId(Integer.parseInt(frmPa.getTxtIdP().getText()));
            if(Validarnum(frmPa.getTxtTelefonoP1().getText())==true && Validarnum(frmPa.getTxtTelefonoP2().getText())==true){
            objPa.setTelefono1(frmPa.getTxtTelefonoP1().getText());
            objPa.setTelefono2(frmPa.getTxtTelefonoP2().getText());
            objPa.getObjM().setNombre(frmPa.getTxtMunicipioP().getText());
            objPa.getObjM().setCodigo(Integer.parseInt(frmMu.getTxtCodigoM().getText()));
            //frmPa.getListTelefonoP()
            //ListaPaciente.add(objPa);
            JOptionPane.showMessageDialog(frmP, objPa.toString());
            LlenarTablaPa(objPa, frmTblP.getTblPaciente());
            LlenarTelefonoPaciente(objPa, frmTblP.getTblTelefonoP());    
            }else{
                JOptionPane.showMessageDialog(frmP, "error,hemos detectado caracteres alfanumericos en el formulario de los telefonos");   
            }
          
            }else{
                 JOptionPane.showMessageDialog(frmP, "error,la fecha insertada no es valida,por favor volver a intentar.");   
            }
           
           }else{
              JOptionPane.showMessageDialog(frmP, "error,la fecha insertada no es valida,por favor volver a intentar.");   
           }
          
           }
      
     
           if(frmM.getBtnRegistrarM().equals(e.getSource())){//Condicional para boton de registro de Medico
            
            String tipo_id= String.valueOf(frmM.getCmbTipoId().getSelectedItem());
            Medico objM= new Medico();
            Especialidad objE= new Especialidad();
            objM.setTipo_id(tipo_id);
          
             objM.setNombre(frmM.getTxtNomM().getText());
             if(Validarnum(frmM.getTxtIdM().getText())==true){
                objM.setId(Integer.parseInt(frmM.getTxtIdM().getText()));
                objM.setDireccion(frmM.getTxtDir().getText());
                objM.setTelefono1(frmM.getTxtTelefonoM1().getText());
                objM.setTelefono2(frmM.getTxtTelefonoM2().getText());
                objM.getObjm().setNombre(frmM.getTxtMunicipioM().getText());
                objM.getObjE().setNombre(frmM.getTxtEspecialidad().getText());
                objM.setHora_i(String.valueOf(frmM.getJcomboHI().getSelectedItem()));
                objM.setHora_f(String.valueOf(frmM.getJcomboHS().getSelectedItem()));
                objM.getObjm().setCodigo(Integer.parseInt(frmMu.getTxtCodigoM().getText()));
                JOptionPane.showMessageDialog(frmP, objM.toString());
                LlenarTablaMed(objM, frmTblM.getTblMedico());  
                LlenarTelefonoMedico(objM, frmTblM.getTblTelefonoM());
             
            }else{
                JOptionPane.showMessageDialog(frmP, "Error,solo debe introducir numeros en el espacio de id.");
                            }
            
            
         
                }
           
           
           if(frmCM.getBtnRegistroC().equals(e.getSource())){//Condicional para boton de registro de cita medica
            Cita objCM= new Cita();
            int dd= frmCM.getDatatxtFechaC().getCalendar().get(Calendar.DAY_OF_MONTH);
            int mm= frmCM.getDatatxtFechaC().getCalendar().get(Calendar.MONTH+1);
            int aa= frmCM.getDatatxtFechaC().getCalendar().get(Calendar.YEAR);
            String formatof= (dd+"/"+mm+"/"+"/"+aa);
            objCM.setFecha_r(formatof);
            objCM.setCodigo(Integer.parseInt(frmCM.getTxtCodigo().getText()));
            objCM.getObjM().setId(Integer.parseInt(frmCM.getTxtSMedico().getText()));
            objCM.getObjP().setId(Integer.parseInt(frmCM.getTxtSPaciente().getText()));
            objCM.getObjS().setCodigo(Integer.parseInt(frmCM.getTxtCodigoS().getText()));
            objCM.getObjHC().setHora_c(frmCM.getTxtHoraI().getValue().toString());
            objCM.getObjS().setDireccion(frmCM.getTxtSede().getText());
            objCM.getObjS().setConsultorio(Integer.parseInt(frmCM.getTxtSedeConsul().getText()));
            objCM.getObjE().setTipo(frmCM.getTxtSEsp().getText());
            objCM.getObjE().setCodigo(Integer.parseInt(frmE.getTxtCodigoE().getText()));
            JOptionPane.showMessageDialog(frmP, objCM.toString());
            LlenarTablaCita(objCM, frmTblCM.getTblCitas());
                     
            
           }
           
           if(frmS.getBtnRegistoS().equals(e.getSource())){//Condiconal para registrar la sede
            Sede objS= new Sede();
            objS.setCodigo(Integer.parseInt(frmS.getTxtCodigoS().getText()));
            objS.setDireccion(frmS.getTxtDirSede().getText());
            objS.setConsultorio(frmS.getSpnConsultorio().getValue());
            frmCM.getTxtSede().setText(frmS.getTxtDirSede().getText());
            frmCM.getTxtSedeConsul().setText(String.valueOf(frmS.getSpnConsultorio().getValue()));
            frmCM.getTxtCodigoS().setText(frmS.getTxtCodigoS().getText());
            JOptionPane.showMessageDialog(frmP, objS.toString());
             LlenarTablaSede(objS, frmTblCM.getTblSede());
           }
           
           if(frmMu.getBtnRegistoM().equals(e.getSource())){//Condiconal para registrar la sede
            Municipio objMu= new Municipio();
            objMu.setCodigo(Integer.parseInt(frmMu.getTxtCodigoM().getText()));
            objMu.setNombre(frmMu.getTxtNombreM().getText());
            frmPa.getTxtMunicipioP().setText(frmMu.getTxtNombreM().getText());
            JOptionPane.showMessageDialog(frmP, objMu.toString());
            LlenarTablaMunicipio(objMu, frmTblP.getTblMunicpioP());
            
           }
           
          if(frmMu.getBtnRegistoMM().equals(e.getSource())){//Condiconal para registrar la sede
            Municipio objMu= new Municipio();
            objMu.setCodigo(Integer.parseInt(frmMu.getTxtCodigoM().getText()));
            objMu.setNombre(frmMu.getTxtNombreM().getText());
            frmM.getTxtMunicipioM().setText(frmMu.getTxtNombreM().getText());
            JOptionPane.showMessageDialog(frmP, objMu.toString());
            LlenarTablaMunicipio(objMu, frmTblM.getTblMunicpioM());
            
           }
            
           if(frmE.getBtnRegistoE().equals(e.getSource())){//Condiconal para registrar la sede
            Especialidad objE= new Especialidad();
            objE.setCodigo(Integer.parseInt(frmE.getTxtCodigoE().getText()));
            objE.setNombre(frmE.getTxtNombreE().getText());
            frmM.getTxtEspecialidad().setText(frmE.getTxtNombreE().getText());
            JOptionPane.showMessageDialog(frmP, objE.toString());
            LlenarTablaEspecialidad(objE, frmTblCM.getTblEspecialidad());
            LlenarTablaEspecialidad(objE, frmTblM.getTblEsoecialidad());     
           }
           
           if(frmCM.getBtnMed_Esp().equals(e.getSource())){
            frmTblM.setVisible(true);
            }
           
           if(frmCM.getBtnPaciente().equals(e.getSource())){
            frmTblP.setVisible(true);
            }
             
            if(frmTblM.getBtnReg().equals(e.getSource())){//Condicional para llevar un medico de la tabla a una cita
                JTable tabla = frmTblM.getTblMedico();
                int fila = tabla.getSelectedRow();   // Se trae la fila que está seleccionada 
                if(fila>=0) //Condicional para validar si hay una fila seleccionada
                { 
                    frmCM.getTxtSMedico().setText(String.valueOf(tabla.getValueAt(fila, 1)));
                    frmCM.getTxtSEsp().setText(String.valueOf(tabla.getValueAt(fila, 4)));
                    JOptionPane.showMessageDialog(null, "Medico seleccionado "+Integer.toString(fila));
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun medico "+Integer.toString(fila));
                }
            }
           
           
           if(frmTblP.getBtnRegC().equals(e.getSource())){//Condicional para añadir un paciente de la tabla a una cita
                JTable tabla = frmTblP.getTblPaciente();
                int fila = tabla.getSelectedRow();   // Se trae la fila que está seleccionada 
                if(fila>=0) //Condicional para validar si hay una fila seleccionada
                { 
                    frmCM.getTxtSPaciente().setText(String.valueOf(tabla.getValueAt(fila, 1)));
                    JOptionPane.showMessageDialog(null, "Paciente seleccionado "+Integer.toString(fila));
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun paciente "+Integer.toString(fila));
                }
            }
           
           if(frmCM.getBtnSSede().equals(e.getSource())){//Condicional para invocar al formulario de Sede
               frmS.setVisible(true);
            }
           
           if(frmPa.getBtnMunicipio().equals(e.getSource())){//Condicional para invocar al formulario de Sede
               frmMu.setVisible(true);
               frmMu.getBtnRegistoMM().setEnabled(false);
               frmMu.getBtnRegistoM().setEnabled(true);
            }
           
           else if(frmM.getBtnMunicipio().equals(e.getSource())){//Condicional para invocar al formulario de Sede
               frmMu.setVisible(true);
               frmMu.getBtnRegistoMM().setEnabled(true);
               frmMu.getBtnRegistoM().setEnabled(false);
            }
           
           if(frmM.getBtnEspecial().equals(e.getSource())){//Condicional para invocar al formulario de Sede
               frmE.setVisible(true);
            }
           
            }
    
    
    public void Iniciar(){
     frmP.setTitle("Gestión de Hospital");
     frmP.setVisible(true);
     frmP.getLblFecha().setText(objF.toString());
    }
    
       public void LlenarTablaPa(Paciente objP, JTable Tabla)
    {
        Object datosCliente[]={objP.getTipo_id(), objP.getId(), objP.getNombre(), objP.getFecha_nac(),objP.getObjM().getCodigo()};
        DefaultTableModel plantilla=(DefaultTableModel)Tabla.getModel();//Crea el molde de la tabla por defecto
        plantilla.addRow(datosCliente);
    }  
       
        public void LlenarTablaMed(Medico objM, JTable Tabla)
    {
        Object datosMedico[]=
        {objM.getTipo_id(), objM.getId(), objM.getNombre(), objM.getObjm().getCodigo(),objM.getObjE().getNombre(),
                objM.getDireccion(),objM.getHora_i(),objM.getHora_f()};
        DefaultTableModel plantilla=(DefaultTableModel)Tabla.getModel();//Crea el molde de la tabla por defecto
        plantilla.addRow(datosMedico);
    } 
   
        public void LlenarTablaCita(Cita objCM, JTable Tabla)
        {
            Object datosCitaMedica[]=
            {objCM.getCodigo(),objCM.getObjM().getId(),objCM.getObjP().getId(),
                objCM.getFecha_r(), objCM.getObjS().getCodigo(),objCM.getObjHC().getCodigo(),objCM.getObjE().getCodigo()};
            DefaultTableModel plantilla=(DefaultTableModel)Tabla.getModel();//Crea el molde de la tabla por defecto
            plantilla.addRow(datosCitaMedica);
    } 
        public void LlenarTablaSede(Sede objS, JTable Tabla)
        {
            Object datosSede[]=
            {objS.getDireccion(),objS.getConsultorio()};
            DefaultTableModel plantilla=(DefaultTableModel)Tabla.getModel();//Crea el molde de la tabla por defecto
            plantilla.addRow(datosSede);
    }
        
        public void LlenarTablaMunicipio(Municipio objM, JTable Tabla)
        {
            Object datosMun[]=
            {objM.getNombre()};
            DefaultTableModel plantilla=(DefaultTableModel)Tabla.getModel();//Crea el molde de la tabla por defecto
            plantilla.addRow(datosMun);
    } 
          
        public void LlenarTablaEspecialidad(Especialidad objE, JTable Tabla)
        {
            Object datosEsp[]=
            {objE.getNombre()};
            DefaultTableModel plantilla=(DefaultTableModel)Tabla.getModel();//Crea el molde de la tabla por defecto
            plantilla.addRow(datosEsp);
    } 
        
      public void LlenarTelefonoPaciente(Paciente objP, JTable Tabla)
        {
            Object datosTel[]=
            {objP.getTelefono1(),objP.getTelefono2()};
            DefaultTableModel plantilla=(DefaultTableModel)Tabla.getModel();//Crea el molde de la tabla por defecto
            plantilla.addRow(datosTel);
    }  
      
       public void LlenarTelefonoMedico(Medico objM, JTable Tabla)
        {
            Object datosTel[]=
            {objM.getTelefono1(),objM.getTelefono2()};
            DefaultTableModel plantilla=(DefaultTableModel)Tabla.getModel();//Crea el molde de la tabla por defecto
            plantilla.addRow(datosTel);
    }    
         
        public boolean Validarstring(String st){
            for(int i=0;i< st.length();i++){
                int c =  (int) st.charAt(i);
               if(c >= 1 && c<=64 || c>= 91 && c<=96 || c>=123 && c<=127){
                   return false;
               }
                               
            }
             return true;
        }
        
   /*     public boolean Validarfecha(String f){
            
            
        }*/
        
        public boolean Validarnum(String n){
           try{
               Integer.parseInt(n);
           }catch(NumberFormatException e){
               return false;
           }
            
            return true;
        }
        public boolean Validarh(String hora){
String[] c= new String[3];
c= hora.split(":");
boolean t=false;
int i=0;
while(i<3){
    if(i==0){
        if( Integer.parseInt(c[i])>=0 && Integer.parseInt(c[i]) <=24 ){
            t=true;
            return t;
        }else{
            t=false;
            return t;
        }
    }else if(i==1){
         if( Integer.parseInt(c[i])>=0 && Integer.parseInt(c[i]) <=59 ){
            t=true;
            return t;
        }else{
             t=false;
            return t;
        }
    }else if(i==2){
      if( Integer.parseInt(c[i])>=0 && Integer.parseInt(c[i]) <=59 ){
            t=true;
            return t;
        }else{
             t=false;
            return t;
        }   
    }
    
    i++;
}

return t;
}
        
 public boolean Validarnombre(String n){
     for(int i=0;i<n.length();i++){
         
         if(n.charAt(i)==' '){
             return false;
         }
     }
     return true;
 }       
 public boolean Validarfecha(String f){
   java.util.Date factual = new Date(); 
    SimpleDateFormat formato=new SimpleDateFormat("yyyy/MM/dd"); 
    Date fnac = null;
    try {
    fnac = formato.parse(f);
    if(factual.compareTo(fnac) >=0){
    return true;
    }else{
        return false;
    }
    
} catch (ParseException ex) {

ex.printStackTrace();

}
    return true;
 }
        
        
            
}
