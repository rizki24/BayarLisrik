
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MRX
 */
public class Transaksi extends javax.swing.JFrame {

    /**
     * Creates new form Transaksi
     */
    public Connection conn;
    public Statement cn;
    public Transaksi() {
        initComponents();
        bersih();
        tampildata();
    }
    
    public void koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/listrikdb","root","");
            cn=conn.createStatement();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,"koneksi gagal");
           System.out.println(e.getMessage());
        }
        
    }
    
    public void bersih(){
       jTextField1.setText("");
       jTextField2.setText("");
       jTextField3.setText("");
       jTextField4.setText("");
       jTextField5.setText("");
       jTextField6.setText("");
       jTextField7.setText("");
       jTextField8.setText("");
    }

        public void tampildata(){
        DefaultTableModel tablenya = new DefaultTableModel();
        tablenya.addColumn("no_pembayaran");
        tablenya.addColumn("id_petugas");
        tablenya.addColumn("tanggal_pembayaran");
        tablenya.addColumn("id_pel");
        tablenya.addColumn("kode_daya");
        tablenya.addColumn("tagihan");
        tablenya.addColumn("administrasi");
        tablenya.addColumn("total_bayar");
        try{
            koneksi();
            String sql = "Select*from pembayarantb";
            ResultSet rs =cn.executeQuery(sql);
            while (rs.next())
            {
                tablenya.addRow(new Object[]{
                    rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)});
            }jTable1.setModel(tablenya);
            
            }
            catch(Exception e){
           JOptionPane.showMessageDialog(null," anda salah");
                
        }
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("No Pembayaran");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 120, 95, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID Petugas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 170, 68, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tanggal Pembayaran");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 210, 127, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ID Pelanggan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 250, 82, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Kode Daya");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 290, 65, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Tagihan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 330, 48, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Administrasi");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 360, 90, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Total Bayar");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 400, 90, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 120, 161, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(200, 160, 160, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(200, 200, 161, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(200, 240, 161, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(200, 280, 161, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(200, 320, 161, 30);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(200, 360, 161, 30);

        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(200, 400, 161, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(580, 53, 520, 338);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 170, 100, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 230, 100, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Tutup");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 290, 100, 30);

        jLabel9.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel9.setText("Transaksi pembayaran");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(117, 54, 258, 32);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(420, 350, 100, 30);

        setSize(new java.awt.Dimension(1167, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        // TODO add your handling code here:
        int text6 = Integer.parseInt(jTextField6.getText());
        int text7 = Integer.parseInt(jTextField7.getText());
        int hasil = text6+text7;
        jTextField8.setText(String.valueOf(hasil));
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();
        if (baris !=1) {
            jTextField1.setText(jTable1.getValueAt(baris, 0).toString());
            jTextField2.setText(jTable1.getValueAt(baris, 1).toString());
            jTextField3.setText(jTable1.getValueAt(baris, 2).toString());
            jTextField4.setText(jTable1.getValueAt(baris, 3).toString());
            jTextField5.setText(jTable1.getValueAt(baris, 4).toString());
            jTextField6.setText(jTable1.getValueAt(baris, 6).toString());
            jTextField7.setText(jTable1.getValueAt(baris, 6).toString());
            jTextField8.setText(jTable1.getValueAt(baris, 7).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            koneksi();
            String sql ="insert into pembayarantb values('"+jTextField1.getText()+"',"
                    + "'"+jTextField2.getText()+"','"+jTextField3.getText()+"',"
                    + "'"+jTextField4.getText()+"','"+jTextField5.getText()+"',"
                    + "'"+jTextField6.getText()+"','"+jTextField7.getText()+"','"+jTextField8.getText()+"')";
            cn.executeUpdate(sql);
            conn.close();

            tampildata();
            bersih();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            koneksi();
            String sql ="delete from pembayarantb where no_pembayaran = ('"+jTextField1.getText()+"')";
            cn.executeUpdate(sql);
            conn.close();

            tampildata();
            bersih();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Data Pembayaran Listrik");
        MessageFormat footer = new MessageFormat("Page (0,number,integer)    ");
        try{
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer,true, null, true, null);
        }catch(java.awt.print.PrinterException e){
            System.err.format("Cannot Print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
