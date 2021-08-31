/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author CRISTHIAN. S
 */
public class frmTblPersona extends javax.swing.JInternalFrame {
    
        public frmTblPersona() {
        initComponents();
    }

    public JButton getBtnElimPer() {
        return BtnElimPer;
    }

    public void setBtnElimPer(JButton BtnElimPer) {
        this.BtnElimPer = BtnElimPer;
    }

    public JButton getBtnModPer() {
        return BtnModPer;
    }

    public void setBtnModPer(JButton BtnModPer) {
        this.BtnModPer = BtnModPer;
    }

    public JButton getBtnModTelP() {
        return BtnModTelP;
    }

    public void setBtnModTelP(JButton BtnModTelP) {
        this.BtnModTelP = BtnModTelP;
    }

    public JTable getTblPersona() {
        return TblPersona;
    }

    public void setTblPersona(JTable TblPersona) {
        this.TblPersona = TblPersona;
    }

    public JButton getBtnRegPerT() {
        return btnRegPerT;
    }

    public void setBtnRegPerT(JButton btnRegPerT) {
        this.btnRegPerT = btnRegPerT;
    }

    public JTable getTblTelefonosP() {
        return tblTelefonosP;
    }

    public void setTblTelefonosP(JTable tblTelefonosP) {
        this.tblTelefonosP = tblTelefonosP;
    }

    public JButton getBtnElimTelP() {
        return BtnElimTelP;
    }

    public void setBtnElimTelP(JButton BtnElimTelP) {
        this.BtnElimTelP = BtnElimTelP;
    }

   
    

   
    
   

    @SuppressWarnings("unchecked")
                           
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTelefonosP = new javax.swing.JTable();
        BtnModTelP = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BtnElimTelP = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPersona = new javax.swing.JTable();
        BtnModPer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnElimPer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegPerT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Lista de Personas");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblTelefonosP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Persona", "Telefono "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTelefonosP);
        if (tblTelefonosP.getColumnModel().getColumnCount() > 0) {
            tblTelefonosP.getColumnModel().getColumn(0).setResizable(false);
        }

        BtnModTelP.setBackground(new java.awt.Color(255, 255, 255));
        BtnModTelP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/modificar.png"))); // NOI18N
        BtnModTelP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnModTelP.setFocusable(false);
        BtnModTelP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnModTelP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel5.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(30, 166, 198));
        jLabel5.setText("Modificar");

        BtnElimTelP.setBackground(new java.awt.Color(255, 255, 255));
        BtnElimTelP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/eliminar.png"))); // NOI18N
        BtnElimTelP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnElimTelP.setFocusable(false);
        BtnElimTelP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnElimTelP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(30, 166, 198));
        jLabel6.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnModTelP, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(BtnElimTelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(BtnModTelP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnElimTelP, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TblPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num ID", "Nombre", "Apellido", "Fecha nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblPersona);
        if (TblPersona.getColumnModel().getColumnCount() > 0) {
            TblPersona.getColumnModel().getColumn(0).setResizable(false);
            TblPersona.getColumnModel().getColumn(1).setResizable(false);
            TblPersona.getColumnModel().getColumn(2).setResizable(false);
            TblPersona.getColumnModel().getColumn(3).setResizable(false);
        }

        BtnModPer.setBackground(new java.awt.Color(255, 255, 255));
        BtnModPer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/modificar.png"))); // NOI18N
        BtnModPer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnModPer.setFocusable(false);
        BtnModPer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnModPer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Modificar");

        BtnElimPer.setBackground(new java.awt.Color(255, 255, 255));
        BtnElimPer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/eliminar.png"))); // NOI18N
        BtnElimPer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnElimPer.setFocusable(false);
        BtnElimPer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnElimPer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Eliminar");

        btnRegPerT.setBackground(new java.awt.Color(255, 255, 255));
        btnRegPerT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/phone_7135.png"))); // NOI18N
        btnRegPerT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegPerT.setFocusable(false);
        btnRegPerT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegPerT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        jLabel2.setText("Agregar telefono");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRegPerT, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(BtnElimPer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnModPer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(57, 57, 57))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BtnModPer, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnElimPer, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegPerT, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnElimPer;
    private javax.swing.JButton BtnElimTelP;
    private javax.swing.JButton BtnModPer;
    private javax.swing.JButton BtnModTelP;
    private javax.swing.JTable TblPersona;
    private javax.swing.JButton btnRegPerT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTelefonosP;
    // End of variables declaration//GEN-END:variables
}
