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


public class ViewQueries{




public static void QueriesWindow(DatabaseConnection databaseConnection){

    JFrame queryWindow=new JFrame();
    JLabel title = new JLabel("View Queries");
    title.setFont(new Font("Arial", Font.BOLD, 14));
    title.setBounds(400, 25, 100, 50);
    queryWindow.add(title);
    JButton query1 = new JButton("Customers that have rented a movie");
    query1.setBounds(50, 100, 300, 30);
    queryWindow.add(query1);
    JButton query2 = new JButton("All Non-Horror Movies");
    query2.setBounds(50,140,300,30);
    queryWindow.add(query2);
    
    JButton query3 = new JButton("Release Year of Movies");
    query3.setBounds(50,180,300,30);
    queryWindow.add(query3);
    
    JButton query4 = new JButton("Movie Ratings");
    query4.setBounds(50,220,300,30);
    queryWindow.add(query4);
    
    JButton query5 = new JButton("Cost to Purchase Movies");
    query5.setBounds(50,260,300,30);
    queryWindow.add(query5);
    
    JButton query6 = new JButton("Cost to Rent Movies");
    query6.setBounds(50,300,300,30);
    queryWindow.add(query6);
    
    JButton query7 = new JButton("Date Users purchased a Movie");
    query7.setBounds(50,340,300,30);
    queryWindow.add(query7);
    
    JButton query8 = new JButton("List all current users");
    query8.setBounds(50,380,300,30);
    queryWindow.add(query8);
    
    JButton exit = new JButton("Exit");
    exit.setBounds(850,25,70,30);
    queryWindow.add(exit);
    
    JTable queryResult = new JTable();
    
    
    JScrollPane sp = new JScrollPane(queryResult);
    
    sp.setBounds(350,100, 600, 320);
    //model.addColumn("customerName");
    
   queryWindow.add(sp);
    
   DefaultTableModel model =(DefaultTableModel)queryResult.getModel();
   queryWindow.setSize(1000,500);//400 width and 500 height  
   queryWindow.setLayout(null);//using no layout managers  
   queryWindow.setVisible(true);
    
    
      
    query1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try{
                model.setRowCount(0);
                ResultSet res = databaseConnection.executeQuery("SELECT Customer.Name FROM Customer WHERE EXISTS(SELECT rent.rental_id FROM Rent, Rented WHERE rented.rental_id = rent.rental_id AND rented.username = customer.username)");
                ResultSetMetaData metdata = res.getMetaData();
                int colCount = metdata.getColumnCount();
                String[] colName = new String[colCount];
                
                for(int i=0; i<colCount; i++){
                    colName[i] = metdata.getColumnName(i+1);
                }
                model.setColumnIdentifiers(colName);
                String name;
                while(res.next()){
                    name=res.getString(1);
                    String[] row = {name};
                    model.addRow(row);
                }
            }
            catch (SQLException a) {
                a.printStackTrace();
                
             }
            
        }
 });
    
    query2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try{
                model.setRowCount(0);
                ResultSet res = databaseConnection.executeQuery("SELECT * FROM Movie MINUS(Select * FROM Movie WHERE genre = 'Horror')");
                ResultSetMetaData metdata = res.getMetaData();
                int colCount = metdata.getColumnCount();
                String[] colName = new String[colCount];
                //DefaultTableModel model =(DefaultTableModel)queryResult.getModel();
                for(int i=0; i<colCount; i++){
                    colName[i] = metdata.getColumnName(i+1);
                }
                model.setColumnIdentifiers(colName);
                String title, genre, director, releaseYear, synopsis, duration;
                while(res.next()){
                    title=res.getString(1);
                    genre=res.getString(2);
                    director=res.getString(3);
                    releaseYear=res.getString(4);
                    synopsis=res.getString(5);
                    duration=res.getString(6);
                    String[] row = {title,genre,director,releaseYear,synopsis,duration};
                    model.addRow(row);
                }
              
            }
            catch (SQLException a) {
                a.printStackTrace();
                
             }
            
        }
 });

    query3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try{
                model.setRowCount(0);
                ResultSet res = databaseConnection.executeQuery("SELECT production_company.movies, movie.release_year FROM movie, sells_rights, production_company WHERE production_company.company_id = sells_rights.company_id AND movie.title = sells_rights.title");
                ResultSetMetaData metdata = res.getMetaData();
                int colCount = metdata.getColumnCount();
                String[] colName = new String[colCount];
                
                for(int i=0; i<colCount; i++){
                    colName[i] = metdata.getColumnName(i+1);
                }
                model.setColumnIdentifiers(colName);
                String movie, year;
                while(res.next()){
                    movie=res.getString(1);
                    year=res.getString(2);
                    String[] row = {movie,year};
                    model.addRow(row);
                }
            }
            catch (SQLException a) {
                a.printStackTrace();
                
             }
            
        }
 });
    
    query4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try{
                model.setRowCount(0);
                ResultSet res = databaseConnection.executeQuery("SELECT movie.title, movie.genre, movie_rating.rating FROM movie, movie_rating WHERE movie.title = movie_rating.title");
                ResultSetMetaData metdata = res.getMetaData();
                int colCount = metdata.getColumnCount();
                String[] colName = new String[colCount];
                
                for(int i=0; i<colCount; i++){
                    colName[i] = metdata.getColumnName(i+1);
                }
                model.setColumnIdentifiers(colName);
                String movie,genre, rating;
                while(res.next()){
                    movie=res.getString(1);
                    genre=res.getString(2);
                    rating=res.getString(3);
                    String[] row = {movie,genre,rating};
                    model.addRow(row);
                }
            }
            catch (SQLException a) {
                a.printStackTrace();
                
             }
            
        }
 });
    
    query5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try{
                model.setRowCount(0);
                ResultSet res = databaseConnection.executeQuery("SELECT movie.title, purchase.price FROM movie, purchase, purchased WHERE purchase.purchase_id = purchased.purchase_id AND movie.title = purchased.title");
                ResultSetMetaData metdata = res.getMetaData();
                int colCount = metdata.getColumnCount();
                String[] colName = new String[colCount];
                
                for(int i=0; i<colCount; i++){
                    colName[i] = metdata.getColumnName(i+1);
                }
                model.setColumnIdentifiers(colName);
                String movie,price;
                while(res.next()){
                    movie=res.getString(1);
                    price=res.getString(2);
            
                    String[] row = {movie,price};
                    model.addRow(row);
                }
            }
            catch (SQLException a) {
                a.printStackTrace();
                
             }
            
        }
 });
    
    query6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try{
                model.setRowCount(0);
                ResultSet res = databaseConnection.executeQuery("SELECT movie.title, rent.price FROM movie, rent, rented WHERE rent.rental_id = rented.rental_id AND movie.title = rented.title");
                ResultSetMetaData metdata = res.getMetaData();
                int colCount = metdata.getColumnCount();
                String[] colName = new String[colCount];
                
                for(int i=0; i<colCount; i++){
                    colName[i] = metdata.getColumnName(i+1);
                }
                model.setColumnIdentifiers(colName);
                String movie,price;
                while(res.next()){
                    movie=res.getString(1);
                    price=res.getString(2);
            
                    String[] row = {movie,price};
                    model.addRow(row);
                }
            }
            catch (SQLException a) {
                a.printStackTrace();
                
             }
            
        }
 });
    
    query7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try{
                model.setRowCount(0);
                ResultSet res = databaseConnection.executeQuery("SELECT Customer.username, movie.title, purchase.Buy_date FROM Customer, Movie, Purchase, Purchased WHERE Customer.username = purchased.username AND purchase.purchase_id = purchased.purchase_id AND movie.title = purchased.title");
                ResultSetMetaData metdata = res.getMetaData();
                int colCount = metdata.getColumnCount();
                String[] colName = new String[colCount];
                
                for(int i=0; i<colCount; i++){
                    colName[i] = metdata.getColumnName(i+1);
                }
                model.setColumnIdentifiers(colName);
                String name,movie,price;
                while(res.next()){
                    name=res.getString(1);
                    movie=res.getString(2);
                    price=res.getString(3);
            
                    String[] row = {name,movie,price};
                    model.addRow(row);
                }
            }
            catch (SQLException a) {
                a.printStackTrace();
                
             }
            
        }
 });
    
    query8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try{
                model.setRowCount(0);
                ResultSet res = databaseConnection.executeQuery("SELECT Username FROM Customer");
                ResultSetMetaData metdata = res.getMetaData();
                int colCount = metdata.getColumnCount();
                String[] colName = new String[colCount];
                
                for(int i=0; i<colCount; i++){
                    colName[i] = metdata.getColumnName(i+1);
                }
                model.setColumnIdentifiers(colName);
                String name;
                while(res.next()){
                    name=res.getString(1);
                    String[] row = {name};
                    model.addRow(row);
                }
            }
            catch (SQLException a) {
                a.printStackTrace();
                
             }
            
        }
 });
    
    exit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            queryWindow.setVisible(false);
            queryWindow.dispose();
            
            
        }
 });
    
   queryWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
