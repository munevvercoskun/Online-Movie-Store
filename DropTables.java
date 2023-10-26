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



public class DropTables{

    public static void dropTable(JFrame f, DatabaseConnection databaseConnection, JButton dropBtn) {
        dropBtn.addActionListener(actionEvent -> {  
         databaseConnection.executeQuery("DROP TABLE Customer CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE PAYMENT CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE PURCHASE CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE RENT CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE MOVIE CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE PRODUCTION_COMPANY CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE MAKES CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE RENTED CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE PURCHASED CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE ADMIN CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE CAN_ACCESS CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE BILLING_ADDRESS CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE Sells_rights CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("DROP TABLE Movie_Rating CASCADE CONSTRAINTS PURGE");
         databaseConnection.executeQuery("commit");
         JOptionPane.showMessageDialog(f, "All Tables Dropped!");
        });
    }
}
        
