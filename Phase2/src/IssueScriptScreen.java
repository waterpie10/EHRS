
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taran
 */
public class IssueScriptScreen extends javax.swing.JFrame {

    /**
     * Creates new form IssueScriptScreen
     */
    public IssueScriptScreen() {
        initComponents();
        //Hiding the components relevant to emailing because the user should only see these if the user wants to email the script
        lblEnterEmailAddress.setVisible(false);
        txtEmailAddress.setVisible(false);
        btnEmailScript.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIssueScripts = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblIDNum = new javax.swing.JLabel();
        txtIDNum = new javax.swing.JTextField();
        lblScriptInfo = new javax.swing.JLabel();
        scrPaneScriptInfo = new javax.swing.JScrollPane();
        txtScriptInfo = new javax.swing.JTextArea();
        btnRecordScript = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        rbnEmail = new javax.swing.JRadioButton();
        lblEnterEmailAddress = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        btnEmailScript = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeading.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblHeading.setText("Issue Script");

        lblIDNum.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblIDNum.setText("Patient ID Number:");

        lblScriptInfo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblScriptInfo.setText("Script Information:");

        txtScriptInfo.setColumns(20);
        txtScriptInfo.setRows(5);
        scrPaneScriptInfo.setViewportView(txtScriptInfo);

        btnRecordScript.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnRecordScript.setText("Record Script");
        btnRecordScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordScriptActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblEmail.setText("Email Script?:");

        rbnEmail.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rbnEmail.setText("Yes");
        rbnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnEmailActionPerformed(evt);
            }
        });

        lblEnterEmailAddress.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblEnterEmailAddress.setText("Enter recipient email address:");

        btnEmailScript.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnEmailScript.setText("Email Script");
        btnEmailScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailScriptActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnBack.setText("Back");

        btnHelp.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnHelp.setText("Help");

        javax.swing.GroupLayout pnlIssueScriptsLayout = new javax.swing.GroupLayout(pnlIssueScripts);
        pnlIssueScripts.setLayout(pnlIssueScriptsLayout);
        pnlIssueScriptsLayout.setHorizontalGroup(
            pnlIssueScriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIssueScriptsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlIssueScriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIDNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIDNum)
                    .addComponent(lblScriptInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrPaneScriptInfo)
                    .addComponent(lblEmail)
                    .addComponent(rbnEmail)
                    .addComponent(lblEnterEmailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmailAddress)
                    .addGroup(pnlIssueScriptsLayout.createSequentialGroup()
                        .addComponent(btnRecordScript)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmailScript))
                    .addGroup(pnlIssueScriptsLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIssueScriptsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeading)
                .addGap(107, 107, 107))
        );
        pnlIssueScriptsLayout.setVerticalGroup(
            pnlIssueScriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIssueScriptsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIDNum)
                .addGap(1, 1, 1)
                .addComponent(txtIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblScriptInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrPaneScriptInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbnEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnterEmailAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIssueScriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecordScript)
                    .addComponent(btnEmailScript))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIssueScriptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnHelp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlIssueScripts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlIssueScripts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnEmailActionPerformed
        //Code to reveal the components relevant to emailing if the user selects the radio button
        if (rbnEmail.isSelected())
        {
            lblEnterEmailAddress.setVisible(true);
            txtEmailAddress.setVisible(true);
            btnEmailScript.setVisible(true);
        }
        else
        {
            lblEnterEmailAddress.setVisible(false);
            txtEmailAddress.setVisible(false);
            btnEmailScript.setVisible(false);
        }
    }//GEN-LAST:event_rbnEmailActionPerformed

    private void btnEmailScriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailScriptActionPerformed
        //the following code uses the Mail class and the methods of the Mail class to compose the email containing the script, and then sends that email. 
        try {
            //extracting the email address to which the email must be delivered, as well as the script information itself
            String emailAddress = txtEmailAddress.getText();
            String scriptToEmail = txtScriptInfo.getText();
            
            //creating a Mail object, using the methods of the Mail class to compose and create the email, and then using the .sendEmail() method to send the email of the script
            Mail mail = new Mail();
            mail.setupServerProperties();
            mail.draftEmail(emailAddress, scriptToEmail);
            mail.sendEmail();
            JOptionPane.showMessageDialog(null, "Script email sent successfully!");
        } catch (MessagingException ex) {
            System.out.println("Error, could not send email!");
        }
    }//GEN-LAST:event_btnEmailScriptActionPerformed

    private void btnRecordScriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordScriptActionPerformed
        //the following code captures the users input data as a new record in tblScripts using the .addScript() method of the Script class
        
        //extracting user input 
        String IDNum = txtIDNum.getText();
        String scriptInfo = txtScriptInfo.getText();
        
        //creating a script object and recording it as new record in tblScripts using the .addScript() method
        Script scriptObj = new Script(IDNum, scriptInfo);
        scriptObj.addScript();
    }//GEN-LAST:event_btnRecordScriptActionPerformed

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
            java.util.logging.Logger.getLogger(IssueScriptScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueScriptScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueScriptScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueScriptScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueScriptScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEmailScript;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnRecordScript;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnterEmailAddress;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblIDNum;
    private javax.swing.JLabel lblScriptInfo;
    private javax.swing.JPanel pnlIssueScripts;
    private javax.swing.JRadioButton rbnEmail;
    private javax.swing.JScrollPane scrPaneScriptInfo;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtIDNum;
    private javax.swing.JTextArea txtScriptInfo;
    // End of variables declaration//GEN-END:variables
}
