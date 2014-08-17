/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashablezipcreator;

import flashablezipcreator.Core.FileNode;
import flashablezipcreator.Core.GroupNode;
import flashablezipcreator.Core.ProjectItemNode;
import flashablezipcreator.Core.ProjectNode;
import flashablezipcreator.Core.ProjectTreeBuilder;
import flashablezipcreator.Operations.ProjectOperations;
import flashablezipcreator.Operations.TreeOperations;
import flashablezipcreator.Operations.UpdaterScriptOperations;
import flashablezipcreator.Protocols.Device;
import flashablezipcreator.Protocols.Export;
import flashablezipcreator.Protocols.Import;
import flashablezipcreator.Protocols.Jar;
import flashablezipcreator.Protocols.Project;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
 *
 * @author Nikhil
 */
public class JTree extends JFrame implements TreeSelectionListener {

    /**
     * Creates new form JTreeDemo
     */
    DefaultTreeModel model;
    TreeOperations to;
    UpdaterScriptOperations uso;
    ProjectOperations po = new ProjectOperations();
    ProjectItemNode rootNode;

    public JTree() throws IOException, ParserConfigurationException, TransformerException, SAXException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() throws IOException, ParserConfigurationException, TransformerException, SAXException {

        jScrollPane1 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        textField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        labelCreateZip = new javax.swing.JLabel();
        importButton = new javax.swing.JButton();

        //tree configurations
        tree = ProjectTreeBuilder.buildTree();
        model = ProjectTreeBuilder.buildModel();
        jScrollPane1 = ProjectTreeBuilder.buildScrollPane();
        tree.addTreeSelectionListener(this);
        rootNode = ProjectTreeBuilder.rootNode;
        this.to = new TreeOperations(rootNode);
        uso = new UpdaterScriptOperations();

        //comment following lines if running from netbeans.
        Jar.addThemesToTree(rootNode, model);
        Device.loadDeviceList();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addButton.setText("For Non Neon Device");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    addButtonActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(JTree.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(JTree.class.getName()).log(Level.SEVERE, null, ex);
                } catch (TransformerException ex) {
                    Logger.getLogger(JTree.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        removeButton.setText("For Neon Device");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    removeButtonActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(JTree.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(JTree.class.getName()).log(Level.SEVERE, null, ex);
                } catch (TransformerException ex) {
                    Logger.getLogger(JTree.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        labelName.setText("Enter the name of Rom to import:");

        labelCreateZip.setText("Create Zip File");

        importButton.setText("Import");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    importButtonActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(JTree.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(JTree.class.getName()).log(Level.SEVERE, null, ex);
                } catch (TransformerException ex) {
                    Logger.getLogger(JTree.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SAXException ex) {
                    Logger.getLogger(JTree.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(labelCreateZip, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(addButton))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(labelName)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(importButton))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(importButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addButton)
                                .addComponent(removeButton)
                                .addComponent(labelCreateZip))
                        .addGap(23, 23, 23))
        );
        pack();
    }// </editor-fold>                        

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException, ParserConfigurationException, TransformerException, SAXException {
        String fileName = textField.getText().toString();
        if (!fileName.equals("")) {
            if (!fileName.endsWith(".zip")) {
                fileName += ".zip";
            }
            Import.fromZip(fileName, rootNode, ProjectNode.PROJECT_ROM, model);
            JOptionPane.showMessageDialog(this, "Successfully Imported");
            //tree.expandRow(1);
        }else{
            JOptionPane.showMessageDialog(this, "Enter name first");
        }
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException, ParserConfigurationException, TransformerException {
        ProjectItemNode node = (ProjectItemNode) tree.getLastSelectedPathComponent();
        System.out.println();
        Device.selected = "Samsung Galaxy R (i9103)";
        String fileName = textField.getText().toString();
        if (!fileName.equals("")) {
            if (!fileName.endsWith(".zip")) {
                fileName += ".zip";
            }
            Project.outputPath = (new File(textField.getText().toString())).getName() + "_NonNeon_AROMA.zip";
        }else {
            Project.outputPath = "NonNeon.zip";
        }
        
        File f = new File(fileName);
        if (f.exists()) {
            Export.zip(rootNode);
        } else {
            JOptionPane.showMessageDialog(this, "File Doesn't Exist");
        }

//        switch (node.type) {
//            case ProjectItemNode.NODE_GROUP:
//                //to add Group Node
//                to.addChildTo(node, textField.getText(), GroupNode.GROUP_SYSTEM_APK, model);
//                break;
//            case ProjectItemNode.NODE_SUBGROUP:
//                //to add SubGroup Node
//                to.addChildTo(node, textField.getText(), SubGroupNode.TYPE_SYSTEM_MEDIA, model);
//        }
        //to add File Node
        //to.addChildTo(node, textField.getText(), ProjectNode.PROJECT_AROMA, model);
//        this.tree = ProjectTreeBuilder.buildTree();
//        this.model = ProjectTreeBuilder.buildModel();
//        this.jScrollPane1 = ProjectTreeBuilder.buildScrollPane();
//        model.reload();
        //model.reload(node);
        //to.expandDirectories(tree);
    }

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException, ParserConfigurationException, TransformerException {
        ProjectItemNode node = (ProjectItemNode) tree.getLastSelectedPathComponent();
        //node.removeChild(node, model);
        //to.expandDirectories(tree);
        //JOptionPane.showMessageDialog(null, JarOperations.getJarFileName());
//        Export e = new Export();
//        e.zip(rootNode);
        Device.selected = "LG Optimus L5 (e610)";
        String fileName = textField.getText().toString();
        if (!fileName.equals("")) {
            if (!fileName.endsWith(".zip")) {
                fileName += ".zip";
            }
            Project.outputPath = (new File(textField.getText().toString())).getName() + "_Neon_AROMA.zip";
        }else {
            Project.outputPath = "Neon.zip";
        }
        File f = new File(fileName);
        if (f.exists()) {
            Export.zip(rootNode);
        } else {
            JOptionPane.showMessageDialog(this, "File Doesn't Exist");
        }
        //e.createZip(to.getNodeList(ProjectItemNode.NODE_FILE));
    }

    private javax.swing.JButton addButton;
    private javax.swing.JButton importButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCreateZip;
    private javax.swing.JLabel labelName;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField textField;
    private javax.swing.JTree tree;

    @Override
    public void valueChanged(TreeSelectionEvent tse) {
        ProjectItemNode node = (ProjectItemNode) tree.getLastSelectedPathComponent();
        if (node == null) {
            return;
        }
        if (node instanceof FileNode) {
            System.out.println(((FileNode) node).installLocation);
        }
        if (node instanceof GroupNode) {
            System.out.println(((GroupNode) node).location);
        }
        //System.out.println(((FileNode)node).filePermission);

        //JOptionPane.showMessageDialog(this, "You have selected: " + node);
    }
}
