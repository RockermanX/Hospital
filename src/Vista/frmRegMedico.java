/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static java.lang.Integer.getInteger;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author CRISTHIAN. S
 */
public class frmRegMedico extends javax.swing.JInternalFrame {

    /**
     * Creates new form regmedico
     */
    DefaultListModel ModeloLista;
    public frmRegMedico() {
        initComponents();
        ModeloLista= new DefaultListModel();
       
    }
    
  
    
    public JButton getBtnEspecial() {
        return btnEspecial;
    }

    public void setBtnEspecial(JButton btnEspecial) {
        this.btnEspecial = btnEspecial;
    }

    public JButton getBtnMunicipio() {
        return btnMunicipio;
    }


    public JComboBox getJcomboHI() {
        return JcomboHI;
    }

    public void setJcomboHI(JComboBox JcomboHI) {
        this.JcomboHI = JcomboHI;
    }

    public JComboBox getJcomboHS() {
        return JcomboHS;
    }

    public void setJcomboHS(JComboBox JcomboHS) {
        this.JcomboHS = JcomboHS;
    }

    public void setBtnMunicipio(JButton btnMunicipio) {
        this.btnMunicipio = btnMunicipio;
    }

    public JTextField getTxtTelefonoM1() {
        return txtTelefonoM1;
    }

    public void setTxtTelefonoM1(JTextField txtTelefonoM1) {
        this.txtTelefonoM1 = txtTelefonoM1;
    }

    public JTextField getTxtTelefonoM2() {
        return txtTelefonoM2;
    }

    public void setTxtTelefonoM2(JTextField txtTelefonoM2) {
        this.txtTelefonoM2 = txtTelefonoM2;
    }
  


    public JButton getBtnRegistrarM() {
        return btnRegistrarM;
    }

    public void setBtnRegistrarM(JButton btnRegistrarM) {
        this.btnRegistrarM = btnRegistrarM;
    }


    public JComboBox<String> getCmbTipoId() {
        return cmbTipoId;
    }

    public void setCmbTipoId(JComboBox<String> cmbTipoId) {
        this.cmbTipoId = cmbTipoId;
    }

    public JTextField getTxtDir() {
        return txtDir;
    }

    public void setTxtDir(JTextField txtDir) {
        this.txtDir = txtDir;
    }

    public JTextField getTxtEspecialidad() {
        return txtEspecialidad;
    }

    public void setTxtEspecialidad(JTextField txtEspecialidad) {
        this.txtEspecialidad = txtEspecialidad;
    }

   
    public JTextField getTxtIdM() {
        return txtIdM;
    }

    public void setTxtIdM(JTextField txtIdM) {
        this.txtIdM = txtIdM;
    }

    public JTextField getTxtMunicipioM() {
        return txtMunicipioM;
    }

    public void setTxtMunicipioM(JTextField txtMunicipioM) {
        this.txtMunicipioM = txtMunicipioM;
    }

    public JTextField getTxtNomM() {
        return txtNomM;
    }

    public void setTxtNomM(JTextField txtNomM) {
        this.txtNomM = txtNomM;
    }

    public JTextField getTxtTelefonoM() {
        return txtTelefonoM1;
    }

    public void setTxtTelefonoM(JTextField txtTelefonoM) {
        this.txtTelefonoM1 = txtTelefonoM;
    }

    public boolean Validar_Hora(String hora){
boolean t;
char a[] =hora.toString().toCharArray();
String c[]= hora.split(":");
if((a[0]==' ')||(a[1]==' ')||(a[2]==' ')||(a[3]==' ')||(a[4]==' ')||(getInteger(c[0])>24)|| (getInteger(c[1])>59)){
t=false;
}
else{
t=true;
}
return t;
}
    public boolean Validarh(String hora){
String[] c= new String[2];
c= hora.split(":");
boolean t=false;
int i=0;
while(i<2){
    if(i==0){
        if( Integer.parseInt(c[i])>=0 || Integer.parseInt(c[i]) <=24 ){
            t=true;
            return t;
        }else{
            t=false;
            return t;
        }
    }else if(i==1){
         if( Integer.parseInt(c[i])>=0 || Integer.parseInt(c[i]) <=59 ){
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarM = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTelefonoM1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        txtIdM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbTipoId = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        txtMunicipioM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnMunicipio = new javax.swing.JButton();
        btnEspecial = new javax.swing.JButton();
        JcomboHI = new javax.swing.JComboBox();
        JcomboHS = new javax.swing.JComboBox();
        txtTelefonoM2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Registro de Medico");

        jLabel2.setText(" Identficacion");

        btnRegistrarM.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnRegistrarM.setText("Registrar Medico");
        btnRegistrarM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefono(s)");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Registro de Medico");

        jLabel3.setText("Direccion");

        jLabel4.setText("Tipo");

        jLabel5.setText("Municipio");

        txtEspecialidad.setEditable(false);

        jLabel1.setText("Nombre");

        cmbTipoId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "CE" }));

        jLabel8.setText("Especialidad");

        txtMunicipioM.setEditable(false);

        jLabel9.setText("Hora de inicio");

        jLabel10.setText("Hora de salida");

        btnMunicipio.setText("Añadir Municipio");
        btnMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMunicipioActionPerformed(evt);
            }
        });

        btnEspecial.setText("Añadir Especialidad");

        JcomboHI.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00:00", "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
        JcomboHI.setToolTipText("");

        JcomboHS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00:00", "1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));
        JcomboHS.setToolTipText("");

        jLabel11.setText("Telefono(s)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMunicipioM, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMunicipio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEspecial))
                            .addComponent(txtTelefonoM1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JcomboHI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JcomboHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomM, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdM))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrarM, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoM2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnMunicipio)
                    .addComponent(txtMunicipioM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEspecial))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JcomboHI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(JcomboHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefonoM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTelefonoM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnRegistrarM, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMunicipioActionPerformed

    private void btnRegistrarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMActionPerformed
    
    }//GEN-LAST:event_btnRegistrarMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JcomboHI;
    private javax.swing.JComboBox JcomboHS;
    private javax.swing.JButton btnEspecial;
    private javax.swing.JButton btnMunicipio;
    private javax.swing.JButton btnRegistrarM;
    private javax.swing.JComboBox<String> cmbTipoId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtIdM;
    private javax.swing.JTextField txtMunicipioM;
    private javax.swing.JTextField txtNomM;
    private javax.swing.JTextField txtTelefonoM1;
    private javax.swing.JTextField txtTelefonoM2;
    // End of variables declaration//GEN-END:variables
}