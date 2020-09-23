/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuItems;
import AddButtonItems.addFoodCounterPanel;
import Mainpackage.*;
import AddButtonItems.*;
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

class foodCounterModel{
    private int sl_no, visitor_id,food_id,no_of_food,total_price;
    private String sold_time;

    public foodCounterModel(int sl_no, int visitor_id, int food_id, int no_of_food,int total_price, String sold_time) {
        this.sl_no = sl_no;
        this.visitor_id = visitor_id;
        this.food_id = food_id;
        this.no_of_food = no_of_food;
        this.sold_time = sold_time;
        this.total_price = total_price;
    }

    public int getSl_no() {
        return sl_no;
    }

    public int getVisitor_id() {
        return visitor_id;
    }

    public int getFood_id() {
        return food_id;
    }

    public int getNo_of_food() {
        return no_of_food;
    }

    public String getSold_time() {
        return sold_time;
    }

    public int getTotal_price() {
        return total_price;
    }
    
    
}

/**
 *
 * @author Julfikar
 */
public class foodCounterPanel extends javax.swing.JPanel {

    
    //variable declaration of query so that we can use it while passing into a method
    //query string is used in some method in this name: "qString"
    private String queryString = "SELECT  Food_Counter.order_sl_no,Food_Counter.visitor_id,Food_Counter.food_id,Food_Counter.no_of_food, ( Food_Counter.no_of_food * Food_Info.food_price ) total_price,Food_Counter.food_sold_date FROM Food_Counter , Food_Info WHERE Food_Counter.food_id = Food_Info.food_id ";

    //Array List for retrieving info from database
    //qString is the String of Query operation
    private ArrayList<foodCounterModel> foodCounterList(String qString) {
        ArrayList<foodCounterModel> foodList = new ArrayList<>();
        DatabaseConnection dbc = new DatabaseConnection();
        try {

            ResultSet rs = dbc.resultSetQuery(qString);

            foodCounterModel foodCounter;
            while (rs.next()) {
                foodCounter = new foodCounterModel(
                        rs.getInt("order_sl_no"),
                        rs.getInt("visitor_id"),
                        rs.getInt("food_id"),
                        rs.getInt("no_of_food"),
                        rs.getInt("total_price"),
                        rs.getString("food_sold_date")     
                );
                foodList.add(foodCounter);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

        //closing database
        dbc.dbClose();

        return foodList;
    }

    //showing values from database to the jtable
    //qString is the String of Query operation
    private void show_foodCounter(String qString) {
        ArrayList<foodCounterModel> list = foodCounterList(qString);
        DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getSl_no();
            row[1] = list.get(i).getVisitor_id();
            row[2] = list.get(i).getFood_id();
            row[3] = list.get(i).getNo_of_food();
            row[4] = list.get(i).getTotal_price();
            row[5] = list.get(i).getSold_time();
            
                    
            model.addRow(row);
        }
    }
    
    
    /**
     * Creates new form visitorInfoPanel
     */
    public foodCounterPanel() {
        initComponents();
        show_foodCounter(queryString);
        
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
        jLabel1.setText("Food Counter");
        contentPanel.add(jLabel1);
        jLabel1.setBounds(10, 30, 510, 30);

        jPanel2.setBackground(new java.awt.Color(65, 40, 107));
        jPanel2.setLayout(null);
        contentPanel.add(jPanel2);
        jPanel2.setBounds(10, 70, 510, 10);

        jPanel3.setBackground(new java.awt.Color(65, 40, 107));
        jPanel3.setLayout(null);
        contentPanel.add(jPanel3);
        jPanel3.setBounds(360, 30, 160, 30);

        jPanel4.setBackground(new java.awt.Color(65, 40, 107));
        jPanel4.setLayout(null);
        contentPanel.add(jPanel4);
        jPanel4.setBounds(10, 30, 160, 30);

        tableScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        tableScrollPanel.setForeground(new java.awt.Color(255, 255, 255));

        dataTable.setBackground(new java.awt.Color(255, 255, 255));
        dataTable.setForeground(new java.awt.Color(0, 0, 0));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Sl. No", "Visitor ID", "Food ID", "No of Item(s)", "Total Price", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        contentPanel.add(addButton);
        addButton.setBounds(440, 440, 80, 33);

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
        searchButton.setBounds(320, 440, 100, 33);

        searchValueField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        contentPanel.add(searchValueField);
        searchValueField.setBounds(30, 440, 200, 30);

        add(contentPanel, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        //This will bring the frame which was implemented for add button into the screen in Nimbus look 
        String[] args = null;
        new addFoodCounterPanel().main(args);
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JTable dataTable;
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
