
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taran
 */
public class ViewConsults extends javax.swing.JFrame {

    /**
     * Creates new form ViewConsults
     */
    
    //The instance variables of this JFrame form, these will be used to retrieve the results of a query to retrieve all data from tblConsultations, and then that data will be parsed 
    //to the ConsultArray() constructor to populate the ArrayList consultObj of type consultArray
    private dbConnect dbObj;
    private ResultSet rs;
    private ConsultArray consultObj;
    public ViewConsults() {
        initComponents();
        
        try {
            dbObj = new dbConnect();
            ResultSet tempRS = dbObj.executeQry(createQuery.getData("tblConsultations"));
            tempRS.next();
            rs = tempRS;
        } catch (SQLException ex) {
            Logger.getLogger(ViewConsults.class.getName()).log(Level.SEVERE, null, ex);
        }
        consultObj = new ConsultArray(rs);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlViewConsults = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        scrPaneOutput = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnViewBookings = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeading.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblHeading.setText("View Consults");

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        scrPaneOutput.setViewportView(txtOutput);

        btnViewBookings.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnViewBookings.setText("View Bookings");
        btnViewBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBookingsActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnHelp.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlViewConsultsLayout = new javax.swing.GroupLayout(pnlViewConsults);
        pnlViewConsults.setLayout(pnlViewConsultsLayout);
        pnlViewConsultsLayout.setHorizontalGroup(
            pnlViewConsultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewConsultsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlViewConsultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrPaneOutput)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewConsultsLayout.createSequentialGroup()
                        .addComponent(btnViewBookings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewConsultsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeading)
                .addGap(164, 164, 164))
        );
        pnlViewConsultsLayout.setVerticalGroup(
            pnlViewConsultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewConsultsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrPaneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlViewConsultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewBookings)
                    .addComponent(btnBack)
                    .addComponent(btnHelp))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlViewConsults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlViewConsults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBookingsActionPerformed
        //setting the txtOutput text area to the toString() of the consultObj so that the user can see all of their consult bookings
        txtOutput.setText(consultObj.toString());
    }//GEN-LAST:event_btnViewBookingsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //This code takes the user back to the previous screen in program sequencing, which is the Consult Screen
        this.setVisible(false);
        new ConsultScreen().setVisible(true);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        //This code takes the user to the help screen
        this.setVisible(false);
        new HelpScreen().setVisible(true);

    }//GEN-LAST:event_btnHelpActionPerformed

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
            java.util.logging.Logger.getLogger(ViewConsults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewConsults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewConsults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewConsults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewConsults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnViewBookings;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JPanel pnlViewConsults;
    private javax.swing.JScrollPane scrPaneOutput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
