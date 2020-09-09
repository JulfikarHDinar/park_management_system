package MenuItems;

import AddButtonItems.addVisitorInfoPanel;
import Mainpackage.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class visitorInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form visitorInfoPanel
     */
    public visitorInfoPanel() {
        initComponents();
        show_visitor();

    }
    public ArrayList<Visitor> visitorList(){
        ArrayList<Visitor> visitorsList = new ArrayList<>();
        try {
          
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Park_MS;selectMethod=cursor", "sa", "123456");
 	    Statement statement = connection.createStatement();
            
            String showvisitorinfoquery= "SELECT * FROM Visitor_Info"; 
            ResultSet rs= statement.executeQuery(showvisitorinfoquery);
            
            Visitor visitor;
            while(rs.next()){
                visitor=new Visitor(rs.getInt("visitor_id"), rs.getString("visitor_name"),rs.getInt("visitor_phone"),rs.getString("visitor_gender"),rs.getInt("visitor_age"));
                visitorsList.add(visitor);
            }
            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return visitorsList;
    }
    public void show_visitor(){
        ArrayList<Visitor> list = visitorList();
        DefaultTableModel model = (DefaultTableModel) visito_infoTable.getModel();
        Object[] row = new Object[5];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getvisitor_id();
            row[1]=list.get(i).getvisitor_name();
            row[2]=list.get(i).getvisitor_phone();
            row[3]=list.get(i).getvisitor_gender();
            row[4]=list.get(i).getvisitor_age();
            
            model.addRow(row);
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

        contentPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tableScrollPanel = new javax.swing.JScrollPane();
        visito_infoTable = new javax.swing.JTable();
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
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Visitor's Information");
        contentPanel.add(jLabel1);
        jLabel1.setBounds(10, 30, 510, 30);

        jPanel2.setBackground(new java.awt.Color(65, 40, 107));
        jPanel2.setLayout(null);
        contentPanel.add(jPanel2);
        jPanel2.setBounds(10, 70, 510, 10);

        jPanel3.setBackground(new java.awt.Color(65, 40, 107));
        jPanel3.setLayout(null);
        contentPanel.add(jPanel3);
        jPanel3.setBounds(400, 30, 120, 30);

        jPanel4.setBackground(new java.awt.Color(65, 40, 107));
        jPanel4.setLayout(null);
        contentPanel.add(jPanel4);
        jPanel4.setBounds(10, 30, 120, 30);

        tableScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        tableScrollPanel.setForeground(new java.awt.Color(255, 255, 255));

        visito_infoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Sex", "Age"
            }
        ));
        tableScrollPanel.setViewportView(visito_infoTable);

        contentPanel.add(tableScrollPanel);
        tableScrollPanel.setBounds(10, 90, 510, 300);

        addButton.setBackground(new java.awt.Color(65, 40, 107));
        addButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        contentPanel.add(addButton);
        addButton.setBounds(240, 400, 70, 25);

        searchButton.setBackground(new java.awt.Color(65, 40, 107));
        searchButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("SEARCH");
        contentPanel.add(searchButton);
        searchButton.setBounds(320, 400, 90, 25);

        deleteButton.setBackground(new java.awt.Color(65, 40, 107));
        deleteButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("DELETE");
        contentPanel.add(deleteButton);
        deleteButton.setBounds(420, 400, 90, 25);

        add(contentPanel, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        //This will bring the frame which was implemented for add button into the screen in Nimbus look 
        String[] args = null;
        new addVisitorInfoPanel().main(args);
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton searchButton;
    private javax.swing.JScrollPane tableScrollPanel;
    private javax.swing.JTable visito_infoTable;
    // End of variables declaration//GEN-END:variables
}
