/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuItems;
import AddButtonItems.addEntryCounterPanel;
import AddButtonItems.*;
import Mainpackage.*;
import UpdateButtonItems.*;
import UpdateButtonItems.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class EntryCounterModel{
    
    int sl_no , visitor_id,no_of_ticket,total_price;
    String ticket_type,time;

    public EntryCounterModel(int sl_no, int visitor_id , String ticket_type, int no_of_ticket, int total_price, String time) {
        this.sl_no = sl_no;
        this.visitor_id = visitor_id;
        this.no_of_ticket = no_of_ticket;
        this.total_price = total_price;
        this.time = time;
        this.ticket_type = ticket_type;
    }

    public int getSl_no() {
        return sl_no;
    }

    public int getVisitor_id() {
        return visitor_id;
    }

    public int getNo_of_ticket() {
        return no_of_ticket;
    }

    public int getTotal_price() {
        return total_price;
    }

    public String getTime() {
        return time;
    }

    public String getTicket_type() {
        return ticket_type;
    }
      
}

/**
 *
 * @author Julfikar
 */
public class entryCounterPanel extends javax.swing.JPanel {

    
    public String ticket_price;

    
    //variable declaration of query so that we can use it while passing into a method
    //query string is used in some method in this name: "qString"
    private String queryString = "SELECT  Entry_Ticket_counter.eticket_sl_no,Entry_Ticket_counter.visitor_id,Entry_Ticket_counter.no_of_tickets,Entry_Ticket_counter.eticket_type, ( Entry_Ticket_counter.no_of_tickets * Entry_Ticket_type.eticket_price ) total_price,Entry_Ticket_counter.eticket_sold_time FROM Entry_Ticket_counter , Entry_Ticket_type WHERE Entry_Ticket_counter.eticket_type = Entry_Ticket_type.eticket_type ";

    //Array List for retrieving info from database
    //qString is the String of Query operation
    private ArrayList<EntryCounterModel> entryCounterList(String qString) {
        ArrayList<EntryCounterModel> entryList = new ArrayList<>();
        DatabaseConnection dbc = new DatabaseConnection();
        try {

            ResultSet rs = dbc.resultSetQuery(qString);

            EntryCounterModel entryCounter;
            while (rs.next()) {
                entryCounter = new EntryCounterModel(
                        rs.getInt("eticket_sl_no"),
                        rs.getInt("visitor_id"),
                        rs.getString("eticket_type"),
                        rs.getInt("no_of_tickets"),
                        rs.getInt("total_price"),
                        rs.getString("eticket_sold_time")     
                );
                entryList.add(entryCounter);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

        //closing database
        dbc.dbClose();

        return entryList;
    }

    //showing values from database to the jtable
    //qString is the String of Query operation
    private void show_entryCounter(String qString) {
        ArrayList<EntryCounterModel> list = entryCounterList(qString);
        DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getSl_no();
            row[1] = list.get(i).getVisitor_id();
            row[2] = list.get(i).getTicket_type();
            row[3] = list.get(i).getNo_of_ticket();
            row[4] = list.get(i).getTotal_price();
            row[5] = list.get(i).getTime();
            
                    
            model.addRow(row);
        }
    }
    
    
    /**
     * Creates new form visitorInfoPanel
     */
    public entryCounterPanel() {
        initComponents();
        show_entryCounter(queryString);
        
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
        deleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchCategoryField = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        searchValueField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 255, 51));
        setMaximumSize(new java.awt.Dimension(530, 450));
        setMinimumSize(new java.awt.Dimension(530, 450));
        setPreferredSize(new java.awt.Dimension(530, 450));
        setLayout(new java.awt.GridBagLayout());

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setMaximumSize(new java.awt.Dimension(530, 500));
        contentPanel.setMinimumSize(new java.awt.Dimension(530, 500));
        contentPanel.setPreferredSize(new java.awt.Dimension(530, 500));
        contentPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(65, 40, 107));
        jPanel1.setLayout(null);
        contentPanel.add(jPanel1);
        jPanel1.setBounds(10, 10, 510, 10);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entry Ticket Counter");
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

        dataTable.setBackground(new java.awt.Color(255, 255, 255));
        dataTable.setForeground(new java.awt.Color(0, 0, 0));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl. No", "Visitor ID", "Ticket Type", "No of Ticket(s)", "Total Price", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dataTable.setFocusable(false);
        tableScrollPanel.setViewportView(dataTable);

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
        addButton.setBounds(340, 440, 70, 33);

        deleteButton.setBackground(new java.awt.Color(65, 40, 107));
        deleteButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        contentPanel.add(deleteButton);
        deleteButton.setBounds(420, 440, 90, 33);

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search By:");
        contentPanel.add(jLabel2);
        jLabel2.setBounds(10, 390, 110, 40);

        searchCategoryField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchCategoryField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        contentPanel.add(searchCategoryField);
        searchCategoryField.setBounds(120, 400, 110, 30);

        searchButton.setBackground(new java.awt.Color(65, 40, 107));
        searchButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("SEARCH");
        contentPanel.add(searchButton);
        searchButton.setBounds(240, 440, 90, 33);

        searchValueField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        contentPanel.add(searchValueField);
        searchValueField.setBounds(30, 440, 200, 30);

        add(contentPanel, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        //This will bring the frame which was implemented for add button into the screen in Nimbus look 
        String[] args = null;
        new addEntryCounterPanel().main(args);
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        
        int column = 0;
        int row = dataTable.getSelectedRow();
        String primKey = dataTable.getModel().getValueAt(row, column).toString();
        
        //preparing query string for delete
        String delQueryString = "DELETE FROM Entry_Ticket_counter WHERE eticket_sl_no = '" + primKey + "'";
        
        //connecting db and then deleting the row according to primary key
        DatabaseConnection dbc = new DatabaseConnection();
        try {
            PreparedStatement pst = dbc.preparedStatementQuery(delQueryString);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted successfully");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        dbc.dbClose();
        
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchCategoryField;
    private javax.swing.JTextField searchValueField;
    private javax.swing.JScrollPane tableScrollPanel;
    // End of variables declaration//GEN-END:variables
}
