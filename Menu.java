import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class Menu {
    
     public static void main(String[] args) {
        
        Menu();
        
     }
    public static void Menu(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        JFrame f=new JFrame();//creating instance of JFrame  
          
        JButton test=new JButton("Test Connection");
        test.setBounds(30,100,140,60);
        f.add(test);
        JButton createBtn=new JButton("Create Tables");//creating instance of JButton  
        createBtn.setBounds(180,100,120, 60);//x axis, y axis, width, height  
        f.add(createBtn);//adding button in JFrame  

        JButton dropBtn = new JButton("Drop Tables");
        dropBtn.setBounds(310,100,120, 60);
        f.add(dropBtn);
        
        JLabel title = new JLabel("Online Movie Store");
        title.setFont(new Font("Arial", Font.BOLD, 14));
        title.setBounds(180, 50, 150, 50);
        f.add(title);
        
        JButton popBtn = new JButton("Populate Tables");
        popBtn.setBounds(30,170,140, 60);
        f.add(popBtn);
        
        JButton querybtn = new JButton("View Queries");
        querybtn.setBounds(180, 170, 120, 60);
        f.add(querybtn);
        final JTextField tf=new JTextField();  
        tf.setBounds(10,50, 150,20);  
        f.add(tf);
        
        JButton exit = new JButton("Exit");
        exit.setBounds(350,25,70,30);
        f.add(exit);
        
        
          test.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if(databaseConnection.createConnection() == true){
                tf.setText("Connected!");
            }else{
                tf.setText("Not Connected");
            };
    }
});
        CreateTables.createTable(f, databaseConnection, createBtn);
        DropTables.dropTable(f, databaseConnection, dropBtn);
        PopulateTables.popTable(f, databaseConnection, popBtn);
        
        
        
        querybtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            ViewQueries.QueriesWindow(databaseConnection);
                
            }
        });
        
        exit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            f.setVisible(false);
            f.dispose();
            
            
        }
 });
        
        f.setSize(500,500);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      
    }
}