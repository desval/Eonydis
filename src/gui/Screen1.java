/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author C. Levallois
 */
public class Screen1 extends javax.swing.JFrame {

    private String workingDirectory;
    private boolean fileSelected;
    private String fileSelectedPathANdName;
    private String fileSelectedName;

    /**
     *
     *
     * Creates new form Screen1
     */
    public Screen1() throws IOException {
        initComponents();
        InputStream imgStream = this.getClass().getResourceAsStream("eonydis_3.png"); 
        BufferedImage bi = ImageIO.read(imgStream); 
        ImageIcon myImg = new ImageIcon(bi); 
        this.setIconImage(myImg.getImage());
        CreateDynamicGexf.setEnabled(false);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        selectFileButton = new javax.swing.JButton();
        CreateDynamicGexf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("eonydis by www.clementlevallois.net");
        setMinimumSize(new java.awt.Dimension(377, 569));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        selectFileButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectFileButton.setText("select file");
        selectFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileButtonActionPerformed(evt);
            }
        });

        CreateDynamicGexf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CreateDynamicGexf.setText("select fields");
        CreateDynamicGexf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateDynamicGexfActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 3, 13)); // NOI18N
        jLabel3.setText("creates evolving networks");

        jLabel5.setFont(new java.awt.Font("Script MT Bold", 0, 36)); // NOI18N
        jLabel5.setText("Eonydis");

        jButton1.setText("credits");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selectFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CreateDynamicGexf, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(121, 121, 121)
                .addComponent(selectFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreateDynamicGexf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileButtonActionPerformed
        if (evt.getSource() == selectFileButton) {
            System.out.println("selectFile clicked");


        }
        JFileChooser chooser = new JFileChooser();
        //chooser.setCurrentDirectory(new java.io.File("D:\\Docs Pro Clement\\E-humanities\\TextMining\\Exported Items\\"));
        chooser.setDialogTitle("Select a csv file");
        //chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            System.out.println("Current directory: " + chooser.getCurrentDirectory().getAbsolutePath());

            workingDirectory = chooser.getCurrentDirectory().getAbsolutePath().toString();
            fileSelected = true;
            fileSelectedPathANdName = chooser.getSelectedFile().toString();
            fileSelectedName = chooser.getSelectedFile().getName();
            System.out.println("Selected File: " + fileSelectedPathANdName);
            CreateDynamicGexf.setEnabled(true);

        } else {
            System.out.println("No Selection");
        }
    }//GEN-LAST:event_selectFileButtonActionPerformed

    private void CreateDynamicGexfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateDynamicGexfActionPerformed
        if (evt.getSource() == CreateDynamicGexf) {


            if (fileSelected) {
                //System.out.println(String.valueOf(countHTML));
                String[] args;
                args = new String[3];
                args[0] = workingDirectory;
                args[1] = fileSelectedPathANdName;
                args[2] = fileSelectedName;
                //logArea.append(workingDirectory);
                //                    args[1] = String.valueOf(countPDF);


                Runnable r = new eonydis.Main(args[0], args[2]);
                new Thread(r).start();
    }//GEN-LAST:event_CreateDynamicGexfActionPerformed
        }
        /**
         * @param args the command line arguments
         */
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateDynamicGexf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton selectFileButton;
    // End of variables declaration//GEN-END:variables
}
