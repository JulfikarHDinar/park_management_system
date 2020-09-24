package SearchButtonItems;

import Mainpackage.*;
import MenuItems.*;

public class searchStaffPaymentPanel extends javax.swing.JFrame {
    //variable declaration of query so that we can use it while passing into a method
    //query string is used in some method in this name: "qString". queryString must be static
    private static String queryString;

    public void setQueryString(String qString) {
        this.queryString = qString;
    }
    
    /**
     * Creates new form searchVisitorInfoPanel
     */
    public searchStaffPaymentPanel(String queryString) {
        initComponents();
        //setting the screen in the middle of the screen
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tableScrollPanel = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff's Payment Amount");
        setMaximumSize(new java.awt.Dimension(530, 450));
        setMinimumSize(new java.awt.Dimension(530, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(530, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setMaximumSize(new java.awt.Dimension(654, 471));
        contentPanel.setMinimumSize(new java.awt.Dimension(654, 471));
        contentPanel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Result");
        contentPanel.add(jLabel2);
        jLabel2.setBounds(10, 30, 510, 30);

        tableScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        tableScrollPanel.setForeground(new java.awt.Color(255, 255, 255));

        dataTable.setBackground(new java.awt.Color(255, 255, 255));
        dataTable.setForeground(new java.awt.Color(0, 0, 0));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Designation", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPanel.setViewportView(dataTable);

        contentPanel.add(tableScrollPanel);
        tableScrollPanel.setBounds(10, 90, 510, 300);

        jPanel1.setBackground(new java.awt.Color(65, 40, 107));
        jPanel1.setLayout(null);
        contentPanel.add(jPanel1);
        jPanel1.setBounds(10, 10, 510, 10);

        jPanel2.setBackground(new java.awt.Color(65, 40, 107));
        jPanel2.setLayout(null);
        contentPanel.add(jPanel2);
        jPanel2.setBounds(10, 70, 510, 10);

        jPanel3.setBackground(new java.awt.Color(65, 40, 107));
        jPanel3.setLayout(null);
        contentPanel.add(jPanel3);
        jPanel3.setBounds(370, 30, 150, 30);

        jPanel4.setBackground(new java.awt.Color(65, 40, 107));
        jPanel4.setLayout(null);
        contentPanel.add(jPanel4);
        jPanel4.setBounds(10, 30, 150, 30);

        getContentPane().add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(searchStaffPaymentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchStaffPaymentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchStaffPaymentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchStaffPaymentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchStaffPaymentPanel(queryString).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane tableScrollPanel;
    // End of variables declaration//GEN-END:variables
}
