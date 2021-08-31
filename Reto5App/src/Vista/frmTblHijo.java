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
public class frmTblHijo extends javax.swing.JInternalFrame {

    public frmTblHijo() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicos = new javax.swing.JTable();
        panel1 = new java.awt.Panel();
        BtnModMed = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnElimMed = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegMedicosT = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Lista de Hijos");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num ID", "Nombre", "Direccion", "Cod Tipo ID", "Cod Especialidad", "Hora ingreso", "Hora salida", "Cod. Municipio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMedicos);
        if (tblMedicos.getColumnModel().getColumnCount() > 0) {
            tblMedicos.getColumnModel().getColumn(0).setResizable(false);
            tblMedicos.getColumnModel().getColumn(1).setResizable(false);
            tblMedicos.getColumnModel().getColumn(2).setResizable(false);
            tblMedicos.getColumnModel().getColumn(3).setResizable(false);
            tblMedicos.getColumnModel().getColumn(4).setResizable(false);
            tblMedicos.getColumnModel().getColumn(5).setResizable(false);
            tblMedicos.getColumnModel().getColumn(6).setResizable(false);
            tblMedicos.getColumnModel().getColumn(7).setResizable(false);
        }

        BtnModMed.setBackground(new java.awt.Color(255, 255, 255));
        BtnModMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/modificar.png"))); // NOI18N
        BtnModMed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnModMed.setFocusable(false);
        BtnModMed.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnModMed.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel3.setText("Modificar");

        BtnElimMed.setBackground(new java.awt.Color(255, 255, 255));
        BtnElimMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/eliminar.png"))); // NOI18N
        BtnElimMed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnElimMed.setFocusable(false);
        BtnElimMed.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnElimMed.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        jLabel4.setText("Eliminar");

        btnRegMedicosT.setBackground(new java.awt.Color(255, 255, 255));
        btnRegMedicosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/phone_7135.png"))); // NOI18N
        btnRegMedicosT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegMedicosT.setFocusable(false);
        btnRegMedicosT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegMedicosT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnModMed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(BtnElimMed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnRegMedicosT, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(22, 22, 22))))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnModMed, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnElimMed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegMedicosT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnElimMed() {
        return BtnElimMed;
    }

    public void setBtnElimMed(JButton BtnElimMed) {
        this.BtnElimMed = BtnElimMed;
    }

  
    public JButton getBtnModMed() {
        return BtnModMed;
    }

    public void setBtnModMed(JButton BtnModMed) {
        this.BtnModMed = BtnModMed;
    }

 

    public JButton getBtnRegMedicosT() {
        return btnRegMedicosT;
    }

    public void setBtnRegMedicosT(JButton btnRegMedicosT) {
        this.btnRegMedicosT = btnRegMedicosT;
    }

    public JTable getTblMedicos() {
        return tblMedicos;
    }

    public void setTblMedicos(JTable tblMedicos) {
        this.tblMedicos = tblMedicos;
    }

   
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnElimMed;
    private javax.swing.JButton BtnModMed;
    private javax.swing.JButton btnRegMedicosT;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private javax.swing.JTable tblMedicos;
    // End of variables declaration//GEN-END:variables
}
