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



public class CreateTables{

    public static void createTable(JFrame f, DatabaseConnection databaseConnection, JButton createBtn) {
        createBtn.addActionListener(actionEvent -> {    
         databaseConnection.executeQuery("CREATE TABLE Customer(Username VARCHAR2(100) PRIMARY KEY,Name VARCHAR2(100),Email VARCHAR2(100),Password VARCHAR2(100))");
         databaseConnection.executeQuery("CREATE TABLE Payment(Payment_ID int PRIMARY KEY,Card_Holder_Name VARCHAR2(100),Card_Number VARCHAR2(100),CVV VARCHAR2(100),Expiry_date VARCHAR2(100))");
         databaseConnection.executeQuery("CREATE TABLE Billing_Address(Street VARCHAR2(100),City VARCHAR2(100),Postal_Code VARCHAR2(100),Province VARCHAR2(100),Payment_ID int PRIMARY KEY,FOREIGN KEY(Payment_ID) REFERENCES Payment(Payment_ID))");
         databaseConnection.executeQuery("CREATE TABLE Production_Company(Company_ID int PRIMARY KEY,Password VARCHAR2(100),Movies VARCHAR2(100))");
         databaseConnection.executeQuery("CREATE TABLE Movie(Title VARCHAR2(100) PRIMARY KEY,Genre VARCHAR2(100),Director VARCHAR2(100),Release_Year int,Synopsis VARCHAR2(1000),Duration int)");
    
         databaseConnection.executeQuery("CREATE TABLE Rent(Rental_ID int PRIMARY KEY,Price int,Date_of_rental DATE,Expiry_Date DATE,Rental_Period VARCHAR2(100))");
         databaseConnection.executeQuery("CREATE TABLE Purchase(Purchase_ID int PRIMARY KEY,Price int,Buy_Date DATE)");
         databaseConnection.executeQuery("CREATE TABLE Movie_Rating(Rating int,Title VARCHAR2(100) PRIMARY KEY)");
       databaseConnection.executeQuery("CREATE TABLE Admin(Admin_ID int PRIMARY KEY,password int)");
         databaseConnection.executeQuery("CREATE TABLE Can_Access(Admin_ID int,Payment_ID int,Username VARCHAR2(100),Purchase_ID int,Rental_ID int,Title VARCHAR2(100),Company_ID int,PRIMARY KEY (Admin_ID, Payment_ID, Username, Purchase_ID, Rental_ID, Title, Company_ID),FOREIGN KEY (Admin_ID) REFERENCES Admin(Admin_ID),FOREIGN KEY (Payment_ID) REFERENCES Payment(Payment_ID),FOREIGN KEY (Username) REFERENCES Customer(Username),FOREIGN KEY (Purchase_ID) REFERENCES Purchase(Purchase_ID),FOREIGN KEY (Rental_ID) REFERENCES Rent(Rental_ID),FOREIGN KEY (Title) REFERENCES Movie(Title),FOREIGN KEY (Company_ID) REFERENCES Production_Company(Company_ID))");
         databaseConnection.executeQuery("CREATE TABLE Makes(Payment_ID int,Username VARCHAR2(100),PRIMARY KEY (Payment_ID, Username),FOREIGN KEY (Payment_ID) REFERENCES Payment(Payment_ID),FOREIGN KEY (Username) REFERENCES Customer(Username))");
         databaseConnection.executeQuery("CREATE TABLE Rented(Username VARCHAR(100),Rental_ID int PRIMARY KEY,Title VARCHAR(100),FOREIGN KEY (Username) REFERENCES Customer(Username),FOREIGN KEY (Rental_ID) REFERENCES Rent(Rental_ID),FOREIGN KEY (Title) REFERENCES Movie(Title))");
         databaseConnection.executeQuery("CREATE TABLE Purchased(Username VARCHAR2(100),Purchase_ID int,Title VARCHAR2(100),FOREIGN KEY (Username) REFERENCES Customer(Username),FOREIGN KEY (Purchase_ID) REFERENCES Purchase(Purchase_ID),FOREIGN KEY (Title) REFERENCES Movie(Title))");
         databaseConnection.executeQuery("CREATE TABLE Sells_Rights(Company_ID int PRIMARY KEY,Title VARCHAR2(100),FOREIGN KEY (Title) REFERENCES Movie(Title),FOREIGN KEY (Company_ID) REFERENCES Production_Company(Company_ID))");
         databaseConnection.executeQuery("commit");
         JOptionPane.showMessageDialog(f, "All Tables Created!");

      

     });
    
}
}
