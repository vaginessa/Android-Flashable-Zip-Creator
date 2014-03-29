/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flashablezipcreator;

/**
 *
 * @author Nikhil
 */
public class OtherPreferencesUI extends javax.swing.JFrame {

    /**
     * Creates new form OtherPreferencesUI
     */
    public OtherPreferencesUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OPPanel = new javax.swing.JPanel();
        OP_headingPanel = new javax.swing.JPanel();
        lblOPHeading = new javax.swing.JLabel();
        dalvikCacheCheckBox = new javax.swing.JCheckBox();
        btnBrowseBuildProp = new javax.swing.JButton();
        btnBrowseHostsFile = new javax.swing.JButton();
        ScrollPaneOP = new javax.swing.JScrollPane();
        TextAreaOP = new javax.swing.JTextArea();
        buildPropTextField = new javax.swing.JTextField();
        hostsFileTextField = new javax.swing.JTextField();
        modifyOptionsPanel = new javax.swing.JPanel();
        btnModifyAromaUpdaterScript = new javax.swing.JButton();
        btnModifyAromaConfig = new javax.swing.JButton();
        btnModifyBuildProp = new javax.swing.JButton();
        btnModifyNormalUpdaterScript = new javax.swing.JButton();
        btnModifyHostsFile = new javax.swing.JButton();
        btnSaveModify = new javax.swing.JButton();
        btnDoneModify = new javax.swing.JButton();
        lblBuildProp = new javax.swing.JLabel();
        lblHostsFile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OP_headingPanel.setBackground(new java.awt.Color(75, 60, 57));
        OP_headingPanel.setForeground(new java.awt.Color(255, 255, 255));

        lblOPHeading.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblOPHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblOPHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOPHeading.setText("Other Preferences");

        javax.swing.GroupLayout OP_headingPanelLayout = new javax.swing.GroupLayout(OP_headingPanel);
        OP_headingPanel.setLayout(OP_headingPanelLayout);
        OP_headingPanelLayout.setHorizontalGroup(
            OP_headingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OP_headingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOPHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        OP_headingPanelLayout.setVerticalGroup(
            OP_headingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OP_headingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOPHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        dalvikCacheCheckBox.setText("Clear Dalvik Cache After Installation By Default");
        dalvikCacheCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dalvikCacheCheckBoxActionPerformed(evt);
            }
        });

        btnBrowseBuildProp.setText("browse");
        btnBrowseBuildProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseBuildPropActionPerformed(evt);
            }
        });

        btnBrowseHostsFile.setText("browse");
        btnBrowseHostsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseHostsFileActionPerformed(evt);
            }
        });

        TextAreaOP.setColumns(20);
        TextAreaOP.setRows(5);
        ScrollPaneOP.setViewportView(TextAreaOP);

        buildPropTextField.setText("Click here to Import Build.prop...");

        hostsFileTextField.setText("Click here to Import Hosts File...");

        modifyOptionsPanel.setBackground(new java.awt.Color(229, 229, 229));
        modifyOptionsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnModifyAromaUpdaterScript.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModifyAromaUpdaterScript.setText("Modify Aroma updater-script");
        btnModifyAromaUpdaterScript.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModifyAromaUpdaterScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyAromaUpdaterScriptActionPerformed(evt);
            }
        });

        btnModifyAromaConfig.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModifyAromaConfig.setText("Modify aroma-config");
        btnModifyAromaConfig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModifyAromaConfig.setContentAreaFilled(false);
        btnModifyAromaConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyAromaConfigActionPerformed(evt);
            }
        });

        btnModifyBuildProp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModifyBuildProp.setText("Modify Build.prop");
        btnModifyBuildProp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModifyBuildProp.setContentAreaFilled(false);
        btnModifyBuildProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyBuildPropActionPerformed(evt);
            }
        });

        btnModifyNormalUpdaterScript.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModifyNormalUpdaterScript.setText("Modify Normal updater-script");
        btnModifyNormalUpdaterScript.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModifyNormalUpdaterScript.setContentAreaFilled(false);
        btnModifyNormalUpdaterScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyNormalUpdaterScriptActionPerformed(evt);
            }
        });

        btnModifyHostsFile.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModifyHostsFile.setText("Modify Hosts File");
        btnModifyHostsFile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModifyHostsFile.setContentAreaFilled(false);
        btnModifyHostsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyHostsFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modifyOptionsPanelLayout = new javax.swing.GroupLayout(modifyOptionsPanel);
        modifyOptionsPanel.setLayout(modifyOptionsPanelLayout);
        modifyOptionsPanelLayout.setHorizontalGroup(
            modifyOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModifyAromaUpdaterScript, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModifyNormalUpdaterScript, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModifyAromaConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnModifyBuildProp, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModifyHostsFile, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        modifyOptionsPanelLayout.setVerticalGroup(
            modifyOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modifyOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifyAromaUpdaterScript, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyNormalUpdaterScript, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyAromaConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyBuildProp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyHostsFile, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSaveModify.setText("Save");
        btnSaveModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveModifyActionPerformed(evt);
            }
        });

        btnDoneModify.setText("Done!");
        btnDoneModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneModifyActionPerformed(evt);
            }
        });

        lblBuildProp.setText("build.prop Path : ");

        lblHostsFile.setText("hosts File Path :");

        javax.swing.GroupLayout OPPanelLayout = new javax.swing.GroupLayout(OPPanel);
        OPPanel.setLayout(OPPanelLayout);
        OPPanelLayout.setHorizontalGroup(
            OPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OP_headingPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifyOptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollPaneOP)
                    .addGroup(OPPanelLayout.createSequentialGroup()
                        .addGroup(OPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBuildProp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHostsFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OPPanelLayout.createSequentialGroup()
                                .addComponent(buildPropTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBrowseBuildProp, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OPPanelLayout.createSequentialGroup()
                                .addComponent(hostsFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBrowseHostsFile, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(OPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dalvikCacheCheckBox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OPPanelLayout.createSequentialGroup()
                                .addComponent(btnSaveModify, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDoneModify, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        OPPanelLayout.setVerticalGroup(
            OPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OP_headingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modifyOptionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(OPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OPPanelLayout.createSequentialGroup()
                        .addComponent(ScrollPaneOP, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dalvikCacheCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(OPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveModify, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDoneModify, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OPPanelLayout.createSequentialGroup()
                        .addGroup(OPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buildPropTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBrowseBuildProp)
                            .addComponent(lblBuildProp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(OPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBrowseHostsFile)
                            .addComponent(hostsFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHostsFile))
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OPPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(OPPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseBuildPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseBuildPropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBrowseBuildPropActionPerformed

    private void btnBrowseHostsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseHostsFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBrowseHostsFileActionPerformed

    private void btnModifyAromaUpdaterScriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyAromaUpdaterScriptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifyAromaUpdaterScriptActionPerformed

    private void btnModifyAromaConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyAromaConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifyAromaConfigActionPerformed

    private void btnModifyBuildPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyBuildPropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifyBuildPropActionPerformed

    private void btnModifyHostsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyHostsFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifyHostsFileActionPerformed

    private void btnSaveModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveModifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveModifyActionPerformed

    private void btnDoneModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneModifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoneModifyActionPerformed

    private void dalvikCacheCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dalvikCacheCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dalvikCacheCheckBoxActionPerformed

    private void btnModifyNormalUpdaterScriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyNormalUpdaterScriptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifyNormalUpdaterScriptActionPerformed

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
            java.util.logging.Logger.getLogger(OtherPreferencesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OtherPreferencesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OtherPreferencesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OtherPreferencesUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OtherPreferencesUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OPPanel;
    private javax.swing.JPanel OP_headingPanel;
    private javax.swing.JScrollPane ScrollPaneOP;
    private javax.swing.JTextArea TextAreaOP;
    private javax.swing.JButton btnBrowseBuildProp;
    private javax.swing.JButton btnBrowseHostsFile;
    private javax.swing.JButton btnDoneModify;
    private javax.swing.JButton btnModifyAromaConfig;
    private javax.swing.JButton btnModifyAromaUpdaterScript;
    private javax.swing.JButton btnModifyBuildProp;
    private javax.swing.JButton btnModifyHostsFile;
    private javax.swing.JButton btnModifyNormalUpdaterScript;
    private javax.swing.JButton btnSaveModify;
    private javax.swing.JTextField buildPropTextField;
    private javax.swing.JCheckBox dalvikCacheCheckBox;
    private javax.swing.JTextField hostsFileTextField;
    private javax.swing.JLabel lblBuildProp;
    private javax.swing.JLabel lblHostsFile;
    private javax.swing.JLabel lblOPHeading;
    private javax.swing.JPanel modifyOptionsPanel;
    // End of variables declaration//GEN-END:variables
}
