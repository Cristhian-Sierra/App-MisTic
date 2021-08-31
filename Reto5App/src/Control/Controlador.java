
package Control;

import Modelo.*;
import ConexionBD.*;
import Vista.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;




public class Controlador implements ActionListener,Runnable{
    
    Hora objH;
    Fecha objF;
    Thread hilo;
    frmPrincipal frmP;
    frmRegHijo frmH;
    frmRegPersona frmPa;
    frmRegTel frmTel;
    frmTblHijo frmTblH;
    frmTblPersona frmTblP;
    
    //Objetos de clases DAO
    PersonaDAO objPerDAO;
    //TelefonoDAO objTelDAO;
    
    public Controlador() {
        hilo = new Thread((Runnable)this);
        objH = new Hora();
        objF = new Fecha();
        frmP = new frmPrincipal();
        frmTel = new frmRegTel();
        frmH= new frmRegHijo();
        frmPa= new frmRegPersona();
        frmTblP = new frmTblPersona();
        frmTblH= new frmTblHijo();
        objPerDAO = new PersonaDAO();
        //objTelDAO = new TelefonoDAO();
        
        frmP.getEscritorio().add(frmPa);
        frmP.getEscritorio().add(frmH);
        frmP.getEscritorio().add(frmTblP);
        frmP.getEscritorio().add(frmTblH);
        frmP.getEscritorio().add(frmTel);
       
        frmP.getMnuRegHijo().addActionListener(this);
        frmP.getMnuRegPersona().addActionListener(this);
        frmP.getMnuRegTel().addActionListener(this);
        frmP.getMnuConPersona().addActionListener(this);
        frmP.getMnuConHijo().addActionListener(this);
        frmP.getMnuSalir().addActionListener(this);
       
        
        frmPa.getBtnRegistrarP().addActionListener(this);
        
        frmTel.getBtnBuscPac().addActionListener(this);
        frmTel.getBtnActTelP().addActionListener(this);
        frmTel.getBtnRegTelP().addActionListener(this);
        
        frmTblP.getBtnRegPerT().addActionListener(this);
        //Botones CRUD Tabla Personas y Telefonos de Hijos
        frmTblP.getBtnElimTelP().addActionListener(this);
        frmTblP.getBtnModTelP().addActionListener(this);
        frmTblP.getBtnModPer().addActionListener(this);
        frmTblP.getBtnElimPer().addActionListener(this);
//       frmTel.getBtnActTM().addActionListener(this);
        frmPa.getBtnActPac().addActionListener(this);
        
        
        frmTblH.getBtnModMed().addActionListener(this);
        frmTblH.getBtnElimMed().addActionListener(this);
     
       // frmH.getBtnActMed().addActionListener(this);

        
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
            if (resp==JOptionPane.YES_OPTION ){
            System.exit(0);
            }
        }  
//////////////////////////INVOCACIÓN FORMULARIO DE REGISTRO PARA PERSONA////////////////////////////////////////////////////////////////////////////////////////////////////   

        if(frmP.getMnuRegPersona().equals(e.getSource())){
            frmPa.setVisible(true);
            frmPa.getBtnActPac().setEnabled(false);
            frmPa.getBtnRegistrarP().setEnabled(true);
            frmPa.getTxtIdP().setText("");
            frmPa.getTxtApellido().setText("");
            frmPa.getTxtNombreP().setText("");
            frmPa.getDataFecha().cleanup();
                    
           
        }
//////////////////////////INVOCACIÓN FORMULARIOS DE REGISTRO PARA HIJO////////////////////////////////////////////////////////////////////////////////////////////////////   
           
        if(frmP.getMnuRegHijo().equals(e.getSource())){
            frmH.setVisible(true);
            //frmH.getBtnActMed().setEnabled(false);
            //frmH.getBtnRegistrarM().setEnabled(true);
        }
        
//////////////////////////INVOCACIÓN FORMULARIO DE REGISTRO PARA TELEFONO////////////////////////////////////////////////////////////////////////////////////////////////////   
           
        if(frmP.getMnuRegTel().equals(e.getSource())){
            frmTel.setVisible(true);
            frmTel.getTxtPacTel().setText("");
            frmTel.getTxtSelIDPac().setText("");
            
        }  
        
//////////////////////////INVOCACIÓN FORMULARIO DE CONSULTA PARA PERSONA////////////////////////////////////////////////////////////////////////////////////////////////////           
        if(frmP.getMnuConPersona().equals(e.getSource())){
                frmTblP.setVisible(true);
                frmTblP.getTblPersona().setModel(objPerDAO.consulta());
                frmTblP.getBtnRegPerT().setEnabled(false);
                frmTblP.getBtnRegPerT().setEnabled(false);
               // frmTblP.getTblTelefonosP().setModel(objTelDAO.ConsultaTodos());
                               
        }

////////////////////////////////////////CONDICIONES CRUD PACIENTE//////////////////////////////////////////////////////////////////////////////////////////////////////////////          
//////////////////////////CONDICIONAL DE REGISTRO DE  PERSONA////////////////////////////////////////////////////////////////////////////////////////////////////           
 
        if(frmPa.getBtnRegistrarP().equals(e.getSource())){ 
            int dd= frmPa.getDataFecha().getCalendar().get(Calendar.DAY_OF_MONTH);
            int mm= (frmPa.getDataFecha().getCalendar().get(Calendar.MONTH))+1;
            int aa= frmPa.getDataFecha().getCalendar().get(Calendar.YEAR);
            String formatof= (aa+"/"+mm+"/"+dd);
            if( Validarfecha(formatof)==true || Validarstring(frmPa.getTxtNombreP().getText())==true || Validarstring(frmPa.getTxtApellido().getText())==true){
           
                Persona objPa= new Persona();
                objPa.setFechaNacimiento(formatof);
                objPa.setNombre(frmPa.getTxtNombreP().getText()); 
                objPa.setApellido(frmPa.getTxtApellido().getText());  
                objPa.setIdentificacion(Integer.parseInt(frmPa.getTxtIdP().getText()));
                objPerDAO.setObjP(objPa);
                JOptionPane.showMessageDialog(frmP, objPa.toString());
                //LlenarTablaPa(objPa, frmTblP.getTblPersona());
                JOptionPane.showMessageDialog(frmP, objPerDAO.insertar());  
                
                     
            }else{
                 JOptionPane.showMessageDialog(frmP, "Error,existe una inconsistencia en la informacion digitada,revise su informacion."); 
            }
           
        }
        
//////////////////////////CONDICIONAL DE ELIMINACIÓN DE  PERSONA////////////////////////////////////////////////////////////////////////////////////////////////////           
          
       if(frmTblP.getBtnElimPer().equals(e.getSource())){//Eliminar persona
            Persona objP = new Persona();
            JTable tabla = frmTblP.getTblPersona();
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            int fila = tabla.getSelectedRow();
            if(fila>=0){
                objP.setIdentificacion((int) tabla.getValueAt(fila, 0));
                objP.setNombre((String) tabla.getValueAt(fila, 1));
                objP.setApellido((String) tabla.getValueAt(fila, 2));
                //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                objP.setFechaNacimiento((String) tabla.getValueAt(fila, 3).toString());
                         
                objPerDAO.setObjP(objP);
                JOptionPane.showMessageDialog(frmP,objPerDAO.eliminar());
               // modelo.removeRow(fila);
            }
            else{
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila de pacientes");
            }
        }
//////////////////////////CONDICIONAL DE SELECCIONAR  PERSONA PARA ACTUALIZAR////////////////////////////////////////////////////////////////////////////////////////////////////           
         
        if(frmTblP.getBtnModPer()==e.getSource()){
           frmPa.setVisible(true);
           frmPa.getBtnActPac().setEnabled(true);
           frmPa.getBtnRegistrarP().setEnabled(false);
           JTable tabla = frmTblP.getTblPersona();
           //DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
           int fila = tabla.getSelectedRow();
           if(fila>=0){
               frmPa.getTxtIdP().setText(String.valueOf(tabla.getValueAt(fila, 0)));
               frmPa.getTxtNombreP().setText(String.valueOf(tabla.getValueAt(fila, 1)));
               frmPa.getTxtApellido().setText(String.valueOf(tabla.getValueAt(fila, 2)));
               frmPa.getDataFecha().setDate((Date)tabla.getValueAt(fila, 3));
             
            }
            else{
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila de pacientes");
            }
        }
//////////////////////////CONDICIONAL DE ACTUALIZACION DE  PERSONA////////////////////////////////////////////////////////////////////////////////////////////////////           
 
        if(frmPa.getBtnActPac().equals(e.getSource())){
            Persona objPa = new Persona();
            int dd= frmPa.getDataFecha().getCalendar().get(Calendar.DAY_OF_MONTH);
            int mm= (frmPa.getDataFecha().getCalendar().get(Calendar.MONTH))+1;
            int aa= frmPa.getDataFecha().getCalendar().get(Calendar.YEAR);
            String formatof= (aa+"/"+mm+"/"+dd);
            if( Validarfecha(formatof)==true || Validarstring(frmPa.getTxtNombreP().getText())==true || Validarstring(frmPa.getTxtApellido().getText())==true){
                objPa.setFechaNacimiento(formatof);
                objPa.setNombre(frmPa.getTxtNombreP().getText()); 
                objPa.setApellido(frmPa.getTxtApellido().getText());  
                objPa.setIdentificacion(Integer.parseInt(frmPa.getTxtIdP().getText()));
                objPerDAO.setObjP(objPa);
                //JOptionPane.showMessageDialog(frmP, objPa.toString());
                //LlenarTablaPa(objPa, frmTblP.getTblPersona());
                JOptionPane.showMessageDialog(frmP, objPerDAO.actualizar());  
                
                     
            }
            else{
                JOptionPane.showMessageDialog(frmP, "Error,existe una inconsistencia en la informacion digitada,revise su informacion."); 
            }
        }     
        
        
//////////////////////////FORMULARIO DE CONSULTA DE PERSONA DESDE EL FORMULARIO TELEFONO ////////////////////////////////////////////////////////////////////////////////////////////////////           
               
        if(frmTel.getBtnBuscPac().equals(e.getSource())){//Condicional para mostrar la lista de pacientes 
            frmTblP.setVisible(true);
            frmTblP.getBtnRegPerT().setEnabled(false);
            frmTblP.getTblPersona().setModel(objPerDAO.consulta());
            //frmTblP.getTblTelefonosP().setModel(objTelDAO.ConsultaTodos());

        }
 //////////////////////////CONDICIONAL DE SELECCION DE  PERSONA AL FORMULARIO DE TELEFONO////////////////////////////////////////////////////////////////////////////////////////////////////           
       
        if(frmTblP.getBtnRegPerT().equals(e.getSource())){
            JTable tabla;
            tabla = frmTblP.getTblPersona();
            int fila = tabla.getSelectedRow();
            if(fila>=0){
            frmTel.getTxtSelIDPac().setText(String.valueOf(tabla.getValueAt(fila, 0)));
            JOptionPane.showMessageDialog(null, "Paciente seleccionado");
            }
            else{
                JOptionPane.showMessageDialog(null, "No ha seleccionado paciente");
            }
        }
    }
         
    
/////////////////////////////////////////////////METODOS DE VALIDACION/////////////////////////////////////////////////////////////////////////////////////////////////////////
  
        
    public boolean Validarnum(String n){
        try{
           Double.parseDouble(n);
            }catch(NumberFormatException e){
            return false;
           }
            return true;
        }
    
   public boolean Validarstring(String st){
        for(int i=0;i< st.length();i++){
            int c =  (int) st.charAt(i);
            if(c >= 1 && c<=64 || c>= 91 && c<=96 || c>=123 && c<=127 || st.charAt(i)==' '){
                return true;
            }                   
        }
        return false;
    }
    
    public boolean Validarfecha(String f){
        java.util.Date factual = new Date(); 
        SimpleDateFormat formato=new SimpleDateFormat("yyyy/MM/dd"); 
        Date fnac = null;
        try {
            fnac = formato.parse(f);
            if(factual.compareTo(fnac) <=0){
                return false;
            }else{
                return true;
            }
    
        }catch (ParseException ex){
            ex.printStackTrace();
        }
        return true;
    } 
 
    public void Iniciar(){
        frmP.setTitle("Reto 5");
        frmP.setVisible(true);
        frmP.getLblFecha().setText(objF.toString());
      //  frmTblP.getTblPersona().setModel(objPerDAO.consulta());
       // frmTblP.getTblTelefonosP().setModel(objTelDAO.Consult());
    
     //frmMu.getTblMunicpios().setModel(objMunDAO.consulta());
     
    }    
    
}
