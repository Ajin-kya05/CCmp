
import java.io.File;
import java.nio.file.Path; 
import java.nio.file.Paths;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Slade
 */
public class EncPage extends javax.swing.JFrame {

    /**
     * Creates new form EncPage
     */
    static String fn  ;
    public EncPage() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        file_path = new javax.swing.JTextField();
        jButton_CANCEL5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton_enc = new javax.swing.JButton();
        jLabelRegister = new javax.swing.JLabel();
        key_enc = new javax.swing.JTextField();
        jButton_enc1 = new javax.swing.JButton();
        jButton_CANCEL6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Welcome!");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(276, 276, 276)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        file_path.setBackground(new java.awt.Color(108, 122, 137));
        file_path.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        file_path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_pathActionPerformed(evt);
            }
        });

        jButton_CANCEL5.setBackground(new java.awt.Color(255, 51, 51));
        jButton_CANCEL5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_CANCEL5.setForeground(new java.awt.Color(255, 255, 255));
        jButton_CANCEL5.setText("Exit");
        jButton_CANCEL5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CANCEL5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(244, 244, 244));
        jButton1.setText("Choose File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_enc.setBackground(new java.awt.Color(51, 153, 255));
        jButton_enc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_enc.setForeground(new java.awt.Color(244, 244, 244));
        jButton_enc.setText("Encrypt ");
        jButton_enc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_encActionPerformed(evt);
            }
        });

        jLabelRegister.setBackground(new java.awt.Color(44, 62, 80));
        jLabelRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegister.setText("Enter key for encryption :");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        key_enc.setBackground(new java.awt.Color(108, 122, 137));
        key_enc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        key_enc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key_encActionPerformed(evt);
            }
        });

        jButton_enc1.setBackground(new java.awt.Color(51, 153, 255));
        jButton_enc1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_enc1.setForeground(new java.awt.Color(244, 244, 244));
        jButton_enc1.setText("Upload");
        jButton_enc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_enc1ActionPerformed(evt);
            }
        });

        jButton_CANCEL6.setBackground(new java.awt.Color(255, 51, 51));
        jButton_CANCEL6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_CANCEL6.setForeground(new java.awt.Color(255, 255, 255));
        jButton_CANCEL6.setText("<<");
        jButton_CANCEL6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CANCEL6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_enc, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_enc1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelRegister)
                        .addGap(18, 18, 18)
                        .addComponent(key_enc))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(file_path, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_CANCEL6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_CANCEL5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file_path, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegister)
                    .addComponent(key_enc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_enc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_enc1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CANCEL5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_CANCEL6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButton_CANCEL5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CANCEL5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_CANCEL5ActionPerformed

    private void file_pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_pathActionPerformed
        
    }//GEN-LAST:event_file_pathActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        file_path.setText(f.getAbsolutePath());
        Path path = Paths.get(f.getAbsolutePath()); 
        Path fileName = path.getFileName(); 
        fn = fileName.toString();
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_encActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_encActionPerformed
        
        if(key_enc.getText().length()==8){
        byte k[] = key_enc.getText().getBytes();
        try{
            FileInputStream ff = new FileInputStream(file_path.getText());
            FileOutputStream outStream = new FileOutputStream("C:\\Users\\Slade\\Documents\\encrypted.txt");
            SecretKeySpec key = new SecretKeySpec(k,"DES");
            Cipher enc  = Cipher.getInstance("DES");
            enc.init(Cipher.ENCRYPT_MODE, key);
            CipherOutputStream cos = new CipherOutputStream(outStream, enc);
            byte[] buf = new byte[1024];
            int read;
            while((read=ff.read(buf))!=-1){
                cos.write(buf,0,read);
            }
            ff.close();
            outStream.flush();
            cos.close();
            JOptionPane.showMessageDialog(null,"File encrypted successfully!");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
        else{
        JOptionPane.showMessageDialog(null,"Enter valid key(lenght of key should be of 8 characters.).");
        }
    }//GEN-LAST:event_jButton_encActionPerformed

    private void key_encActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key_encActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_key_encActionPerformed

    private void jButton_enc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enc1ActionPerformed
        LoginForm lf = new LoginForm();
        
        String un = lf.uname;
        String ek = key_enc.getText();
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File ef = chooser.getSelectedFile();
        FileInputStream ip = null;
        try {
            ip = new FileInputStream(ef);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EncPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        PreparedStatement ps;
        String query = "INSERT INTO `files`(`uname`,`ukey`,`fname`, `file`) VALUES (?,?,?,?)";
        try {
            
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1,un);
            ps.setString(2,ek);
            ps.setString(3,fn);
            ps.setBinaryStream(4, ip);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"File uploaded successfully");
    
        } catch (SQLException ex) {
            Logger.getLogger(EncPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_enc1ActionPerformed

    private void jButton_CANCEL6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CANCEL6ActionPerformed
             MainPage mg = new MainPage();
             mg.setVisible(true);
             mg.pack();
             mg.setLocationRelativeTo(null);
             mg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             this.dispose();
    }//GEN-LAST:event_jButton_CANCEL6ActionPerformed

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
            java.util.logging.Logger.getLogger(EncPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField file_path;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_CANCEL;
    private javax.swing.JButton jButton_CANCEL1;
    private javax.swing.JButton jButton_CANCEL2;
    private javax.swing.JButton jButton_CANCEL3;
    private javax.swing.JButton jButton_CANCEL4;
    private javax.swing.JButton jButton_CANCEL5;
    private javax.swing.JButton jButton_CANCEL6;
    private javax.swing.JButton jButton_D;
    private javax.swing.JButton jButton_D1;
    private javax.swing.JButton jButton_D2;
    private javax.swing.JButton jButton_D3;
    private javax.swing.JButton jButton_D4;
    private javax.swing.JButton jButton_E;
    private javax.swing.JButton jButton_E1;
    private javax.swing.JButton jButton_E2;
    private javax.swing.JButton jButton_E3;
    private javax.swing.JButton jButton_E4;
    private javax.swing.JButton jButton_enc;
    private javax.swing.JButton jButton_enc1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField key_enc;
    // End of variables declaration//GEN-END:variables
}
