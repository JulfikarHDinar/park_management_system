/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuItems;
import Mainpackage.*;
/**
 *
 * @author Julfikar
 */
public class entryTicketInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form visitorInfoPanel
     */
    public entryTicketInfoPanel() {
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

        contentPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tableScrollPanel = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 51));
        setMaximumSize(new java.awt.Dimension(530, 450));
        setMinimumSize(new java.awt.Dimension(530, 450));
        setPreferredSize(new java.awt.Dimension(530, 450));
        setLayout(new java.awt.GridBagLayout());

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setMaximumSize(new java.awt.Dimension(530, 450));
        contentPanel.setMinimumSize(new java.awt.Dimension(530, 450));
        contentPanel.setPreferredSize(new java.awt.Dimension(530, 450));
        contentPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(65, 40, 107));
        jPanel1.setLayout(null);
        contentPanel.add(jPanel1);
        jPanel1.setBounds(10, 10, 510, 10);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entry Ticket Information");
        contentPanel.add(jLabel1);
        jLabel1.setBounds(10, 30, 510, 30);

        jPanel2.setBackground(new java.awt.Color(65, 40, 107));
        jPanel2.setLayout(null);
        contentPanel.add(jPanel2);
        jPanel2.setBounds(10, 70, 510, 10);

        jPanel3.setBackground(new java.awt.Color(65, 40, 107));
        jPanel3.setLayout(null);
        contentPanel.add(jPanel3);
        jPanel3.setBounds(420, 30, 100, 30);

        jPanel4.setBackground(new java.awt.Color(65, 40, 107));
        jPanel4.setLayout(null);
        contentPanel.add(jPanel4);
        jPanel4.setBounds(10, 30, 100, 30);

        tableScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        tableScrollPanel.setForeground(new java.awt.Color(255, 255, 255));

        dataTable.setBackground(new java.awt.Color(255, 255, 255));
        dataTable.setForeground(new java.awt.Color(255, 255, 255));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Package Name", "Amount"
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

        addButton.setBackground(new java.awt.Color(65, 40, 107));
        addButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("ADD");
        contentPanel.add(addButton);
        addButton.setBounds(240, 400, 70, 33);

        searchButton.setBackground(new java.awt.Color(65, 40, 107));
        searchButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("SEARCH");
        contentPanel.add(searchButton);
        searchButton.setBounds(320, 400, 90, 33);

        deleteButton.setBackground(new java.awt.Color(65, 40, 107));
        deleteButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("DELETE");
        contentPanel.add(deleteButton);
        deleteButton.setBounds(420, 400, 90, 33);

        add(contentPanel, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton searchButton;
    private javax.swing.JScrollPane tableScrollPanel;
    // End of variables declaration//GEN-END:variables
}
