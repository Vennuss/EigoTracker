package eigatracker;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vennuss
 */
public class ChapterRecord extends javax.swing.JFrame {

    BD bd = new BD();
    final private int IDCAP;
    final private int IDREG;
    
    /**
     * Creates new form MovieRecord
     * @param _name
     */
    public ChapterRecord(final int _cap) {
        initComponents();
        IDCAP = _cap;
        IDREG = -1;
        start();
    }
    
    public ChapterRecord(final int _cap, final int _reg) {
        initComponents();
        IDCAP = _cap;
        IDREG = _reg;
        start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Check = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Notes = new javax.swing.JTextArea();
        Button = new javax.swing.JButton();
        Comp = new javax.swing.JSpinner();
        Fun = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Year = new javax.swing.JSpinner();
        Day = new javax.swing.JSpinner();
        Hour = new javax.swing.JSpinner();
        Month = new javax.swing.JSpinner();
        Minute = new javax.swing.JSpinner();
        Name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movie Record");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Chapter");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Comprehension");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("%");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Fun");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("%");

        Check.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Check.setText("Custom Date");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Notes");

        Notes.setColumns(20);
        Notes.setRows(5);
        jScrollPane2.setViewportView(Notes);

        Button.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Button.setText("REGISTER");
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        Comp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Comp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        Fun.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fun.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Y");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("M");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("D");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("H");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("M");

        Year.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Year.setModel(new javax.swing.SpinnerNumberModel(2022, 2022, null, 1));
        Year.setEnabled(false);

        Day.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Day.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        Day.setEnabled(false);

        Hour.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Hour.setModel(new javax.swing.SpinnerNumberModel(23, 0, 23, 1));
        Hour.setEnabled(false);

        Month.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Month.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        Month.setEnabled(false);

        Minute.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Minute.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        Minute.setEnabled(false);

        Name.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Name.setText("Error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(Name))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Fun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Check))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Minute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 610, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Name))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(Comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Check))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        Year.setEnabled(Check.isSelected());
        Month.setEnabled(Check.isSelected());
        Day.setEnabled(Check.isSelected());
        Hour.setEnabled(Check.isSelected());
        Minute.setEnabled(Check.isSelected());
    }//GEN-LAST:event_CheckActionPerformed

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
        String sql = "";
        if (IDREG == -1) {
            if (!Check.isSelected()) {
                sql = "insert into registros_capitulos (notas,comprension,diversion,capitulo_ref) "
                        + "values('" + Notes.getText() + "', " + String.valueOf(Comp.getValue()) + ", " + String.valueOf(Fun.getValue()) + ", '" + IDCAP + "');";
            } else {
                sql = "insert into registros_capitulos (notas,comprension,diversion,capitulo_ref, fecha) "
                        + "values('" + Notes.getText() + "', " + String.valueOf(Comp.getValue()) + ", " + String.valueOf(Fun.getValue()) + ", '" + IDCAP + "', '"
                        + String.valueOf(Year.getValue()) + "/" + String.valueOf(Month.getValue()) + "/" + String.valueOf(Day.getValue()) + " "
                        + String.valueOf(Hour.getValue()) + ":" + String.valueOf(Minute.getValue()) + "');";
            }
        } else {
            if (Check.isSelected()) {
                sql = "update registros_capitulos set notas = '" + Notes.getText() + "', comprension = " + String.valueOf(Comp.getValue()) + ", diversion = " + String.valueOf(Fun.getValue())
                        + ", fecha = '" + String.valueOf(Year.getValue()) + "/" + String.valueOf(Month.getValue()) + "/" + String.valueOf(Day.getValue()) + " "
                        + String.valueOf(Hour.getValue()) + ":" + String.valueOf(Minute.getValue())
                        + "' where id = " + IDREG + ";";
            } else {
                sql = "update registros_capitulos set notas = '" + Notes.getText() + "', comprension = " + String.valueOf(Comp.getValue()) + ", diversion = " + String.valueOf(Fun.getValue())
                        + " where id = " + IDREG + ";";
            }
        }
        dispose();
        if(!sql.isEmpty()) bd.sentencia(sql);
        else JOptionPane.showMessageDialog(rootPane, "There has been an error.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChapterRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChapterRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChapterRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChapterRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChapterRecord(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button;
    private javax.swing.JCheckBox Check;
    private javax.swing.JSpinner Comp;
    private javax.swing.JSpinner Day;
    private javax.swing.JSpinner Fun;
    private javax.swing.JSpinner Hour;
    private javax.swing.JSpinner Minute;
    private javax.swing.JSpinner Month;
    private javax.swing.JLabel Name;
    private javax.swing.JTextArea Notes;
    private javax.swing.JSpinner Year;
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
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables


    private void start(){
        Name.setText(Integer.toString(IDCAP));
        if(IDREG == -1) Button.setText("REGISTER");
        else{
            Button.setText("UPDATE");
            Comp.setValue(consultarInt("select comprension from registros_capitulos where id = " + IDREG + ";","comprension"));
            Fun.setValue(consultarInt("select diversion from registros_capitulos where id = " + IDREG + ";","diversion"));
            Notes.setText(consultarString("select notas from registros_capitulos where id = " + IDREG + ";","notas"));
            
        }
    }
    
    private int consultarInt(final String _sql, final String _valor){
        ResultSet rs = bd.consulta(_sql);
        try {
            int r = 0;
            while(rs.next()){
                r = rs.getInt(_valor);
                break;
            }
            bd.cerrarConexion();
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return 0;
        }
    }
    
    private String consultarString(final String _sql, final String _valor){
        ResultSet rs = bd.consulta(_sql);
        try {
            String r = "";
            while(rs.next()){
                r = rs.getString(_valor);
                break;
            }
            bd.cerrarConexion();
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return "Error";
        }
    }

}
