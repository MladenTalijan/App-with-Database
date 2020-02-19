
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Home extends javax.swing.JFrame {
    String gender;
    public Home() {
        initComponents();
        show_user();
        
         Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }
public ArrayList<User> userList(){
    ArrayList<User> usersList = new ArrayList<>();
    
   try{
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=mladen";
       Connection con = DriverManager.getConnection(url);
       
       String query1 = "SELECT * FROM users";
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(query1);
       User user;
       while(rs.next()){
           user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("address"), rs.getString("gender"), rs.getString("membership"), rs.getString("genre"), rs.getString("date"));
           usersList.add(user);
       }
       
   }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
   }
   return usersList;
}

public void show_user(){
    ArrayList<User> list = userList();
    DefaultTableModel model = (DefaultTableModel)jTable_Display_User.getModel();
    Object[] row = new Object[7];
    for(int i=0; i < list.size() ; i++){
        row[0] = list.get(i).getId();
        row[1] = list.get(i).getName();
        row[2] = list.get(i).getAddress();
        row[3] = list.get(i).getGender();
        row[4] = list.get(i).getMembership();
        row[5] = list.get(i).getGenre();
        row[6] = list.get(i).getDate();
        model.addRow(row);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        books = new javax.swing.JCheckBox();
        readingRoom = new javax.swing.JCheckBox();
        genre = new javax.swing.JComboBox();
        saveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User = new javax.swing.JTable();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        date_chooser = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("Gender");

        jLabel4.setText("Membership");

        jLabel5.setText("Genre");

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");

        books.setText("Books");

        readingRoom.setText("Reading Room");

        genre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Klasici", "Akcioni", "Drame", "Horor", "Biografija", "Ljubavni", "Ostali" }));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jTable_Display_User.setBackground(new java.awt.Color(153, 153, 255));
        jTable_Display_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Address", "Gender", "Membership", "Genre", "Date"
            }
        ));
        jTable_Display_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User);

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel6.setText("Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(male)
                                    .addComponent(books))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(readingRoom)
                                    .addComponent(female)))
                            .addComponent(genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(saveBtn)
                                .addGap(18, 18, 18)
                                .addComponent(update))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resetBtn))
                            .addComponent(date_chooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(male)
                        .addComponent(female)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(readingRoom)
                        .addComponent(books)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(resetBtn)
                    .addComponent(update)
                    .addComponent(delete))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=mladen";
           Connection con = DriverManager.getConnection(url);
           
           String query = "insert into users(name, address, gender, membership, genre, date)values(?, ?, ?, ?, ?, ?)";
           PreparedStatement pst = con.prepareStatement(query);
           
           pst.setString(1, name.getText());
           pst.setString(2, address.getText());
           if(male.isSelected()){
               gender = "Male";
           }
           if(female.isSelected()){
               gender = "Female";
           }
           pst.setString(3, gender);
           
           String membership = "";
           if(books.isSelected()){
               membership += books.getText()+ " ";
           }
           if(readingRoom.isSelected()){
               membership += readingRoom.getText()+ " ";
           }
           pst.setString(4, membership);
           
           String pick;
           pick = genre.getSelectedItem().toString();
           pst.setString(5, pick);
           
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           String date = sdf.format(date_chooser.getDate());
           pst.setString(7, date);
           
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Data inserted successfuly!");
           
           DefaultTableModel model = (DefaultTableModel) jTable_Display_User.getModel();
           model.setRowCount(0);
           show_user();
           
           }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        name.setText("");
        address.setText("");
        buttonGroup1.clearSelection();
        books.setSelected(false);  
        readingRoom.setSelected(false);
        genre.setSelectedIndex(0);
        
    }//GEN-LAST:event_resetBtnActionPerformed

    private void jTable_Display_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_UserMouseClicked
        int i = jTable_Display_User.getSelectedRow();
        TableModel model = jTable_Display_User.getModel();
        
        name.setText(model.getValueAt(i, 1).toString());
        address.setText(model.getValueAt(i, 2).toString());
        String sex = model.getValueAt(i, 3).toString();
            if(sex.equals(male)){
                male.setSelected(true);
            }else{
                female.setSelected(true);
            }
        String membership = model.getValueAt(i, 4).toString();
            switch(membership){
                case "Books ":
                    books.setSelected(true);
                    readingRoom.setSelected(false);
                    break;
                case "Reading Room ":
                    readingRoom.setSelected(true);
                    books.setSelected(false);
                    break;
                default:
                    books.setSelected(true);
                    readingRoom.setSelected(true);
                    break;
            }
        String genre1 = model.getValueAt(i, 5).toString();
            switch(genre1){
                case "Klasici":
                    genre.setSelectedIndex(0);
                    break;
                case "Akcioni":
                    genre.setSelectedIndex(1);
                    break;
                case "Drame":
                    genre.setSelectedIndex(2);
                    break;
                case "Horor":
                    genre.setSelectedIndex(3);
                    break;
                case "Biografija":
                    genre.setSelectedIndex(4);
                    break;
                case "Ljubavni":
                    genre.setSelectedIndex(5);
                    break;
                case "Ostali":
                    genre.setSelectedIndex(6);
                    break;
            }
            try{
                int srow = jTable_Display_User.getSelectedRow();
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(srow, 6));
                date_chooser.setDate(date);
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_jTable_Display_UserMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=mladen";
           Connection con = DriverManager.getConnection(url);
           
           int row = jTable_Display_User.getSelectedRow();
           String value = (jTable_Display_User.getModel().getValueAt(row, 0).toString());
           String query = "UPDATE users SET name = ?, address = ?, gender = ?, membership = ?, genre = ?, date = ? where id=" + value;
           
           PreparedStatement pst = con.prepareStatement(query);
           
           pst.setString(1, name.getText());
           pst.setString(2, address.getText());
           if(male.isSelected()){
               gender = "Male";
           }
           if(female.isSelected()){
               gender = "Female";
           }
           pst.setString(3, gender);
           
           String membership = "";
           if(books.isSelected()){
               membership += books.getText()+ " ";
           }
           if(readingRoom.isSelected()){
               membership += readingRoom.getText()+ " ";
           }
           pst.setString(4, membership);
           
           String pick;
           pick = genre.getSelectedItem().toString();
           pst.setString(5, pick);
           
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           String date = sdf.format(date_chooser.getDate());
           pst.setString(7, date);
           
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Data updated successfuly!");
           
           DefaultTableModel model = (DefaultTableModel) jTable_Display_User.getModel();
           model.setRowCount(0);
           show_user();
           
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        int opt = JOptionPane.showConfirmDialog(null, "Are You sure to delete? ", "Delete", JOptionPane.YES_NO_OPTION);
        if(opt == 0){
        
        try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=mladen";
           Connection con = DriverManager.getConnection(url);
           
           int row = jTable_Display_User.getSelectedRow();
           String value = (jTable_Display_User.getModel().getValueAt(row, 0).toString());
           
           String query = "DELETE FROM users where id = " + value;
           PreparedStatement pst = con.prepareStatement(query);
           pst.executeUpdate();
           
           DefaultTableModel model = (DefaultTableModel) jTable_Display_User.getModel();
           model.setRowCount(0);
           show_user();
           JOptionPane.showMessageDialog(null, "Deleted successfuly");
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         } 
        }
    }//GEN-LAST:event_deleteActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JCheckBox books;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JButton delete;
    private javax.swing.JRadioButton female;
    private javax.swing.JComboBox genre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JCheckBox readingRoom;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
