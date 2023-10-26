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



public class PopulateTables{

    public static void popTable(JFrame f, DatabaseConnection databaseConnection, JButton popBtn) {
        popBtn.addActionListener(actionEvent -> {  
            
            databaseConnection.executeQuery("INSERT INTO Customer VALUES ('munevver', 'MunevverCoskun', 'munevver.coskun@ryerson.ca', 'mnvvrcskn')");
            databaseConnection.executeQuery("INSERT INTO Customer (Username, Name, Email, Password) VALUES ('zamla', 'Zaiba', 'zaiba.amla@ryerson.ca', 'ilikePizza06')");
            databaseConnection.executeQuery("INSERT INTO Customer (Username, Name, Email, Password) VALUES ('nabil', 'Nabil', 'nabil.@ryerson.ca', 'password')");
            databaseConnection.executeQuery("INSERT INTO Customer (Username, Name, Email, Password) VALUES ('JohnH', 'John', 'john.Hanover@hotmail.com', 'BigPlate889')");
            databaseConnection.executeQuery("INSERT INTO Customer (Username, Name, Email, Password) VALUES ('AshleyCake', 'Ashley', 'ashleyMakesCake@gmail.com', 'cupcakesWithSprinkles44')");
            databaseConnection.executeQuery("INSERT INTO Customer (Username, Name, Email, Password) VALUES ('KinderFan', 'Neil', 'neilpatrick@yahoo.ca', 'FitzgararldTHE3')");
            databaseConnection.executeQuery("INSERT INTO Customer (Username, Name, Email, Password) VALUES ('LillyPad', 'Lilly', 'lillyericson@gmail.com', 'OliveTheory73')");
            databaseConnection.executeQuery("INSERT INTO Customer (Username, Name, Email, Password) VALUES ('Marshmellow', 'Marshell', 'Marshmellow_ericson@hotmail.ca', 'coolBeans62898')");
            databaseConnection.executeQuery("INSERT INTO Customer (Username, Name, Email, Password) VALUES ('CampbellSoup', 'Nick', 'NickLoves_soup@gmail.com', 'ChiliIsthebettersoup_73')");
            databaseConnection.executeQuery("INSERT INTO Customer (Username, Name, Email, Password) VALUES ('CraigsCookies', 'Craig', 'craigscookies@gmail.com', 'ChocolatechipCookie0098')");
            
            
            databaseConnection.executeQuery("INSERT INTO Payment (Payment_ID,Card_Holder_Name, Card_Number, CVV, Expiry_Date) VALUES (1, 'MunevverCoskun', '785 660 932 272 5234', '705',TO_DATE('08/12/24','YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Payment (Payment_ID,Card_Holder_Name, Card_Number, CVV, Expiry_Date) VALUES (2, 'Zaiba Amla', '670 839 607 635 2810', '445',TO_DATE ('02/05/23', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Payment (Payment_ID,Card_Holder_Name, Card_Number, CVV, Expiry_Date) VALUES (3, 'Nabil Haque', '342 365 949 886 1437', '882',TO_DATE ('30/07/25', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Payment (Payment_ID,Card_Holder_Name, Card_Number, CVV, Expiry_Date) VALUES (4, 'John Hanover', '516 537 272 969 2203', '313', TO_DATE('2023-06-30', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Payment (Payment_ID,Card_Holder_Name, Card_Number, CVV, Expiry_Date) VALUES (5, 'Ashley Oconnell', '404 417 309 051 4342', '668', TO_DATE('2024-03-07', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Payment (Payment_ID,Card_Holder_Name, Card_Number, CVV, Expiry_Date) VALUES (6, 'Neil Patrick', '773 409 364 529 4399', '213',TO_DATE('2024-10-24', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Payment (Payment_ID,Card_Holder_Name, Card_Number, CVV, Expiry_Date) VALUES (7, 'Lilly Ericson', '304 226 394 047 4286', '553', TO_DATE('2025-01-13', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Payment (Payment_ID,Card_Holder_Name, Card_Number, CVV, Expiry_Date) VALUES (8, 'Marshel Ericson', '874 052 748 879 0026', '831', TO_DATE('2025-05-06', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Payment (Payment_ID,Card_Holder_Name, Card_Number, CVV, Expiry_Date) VALUES (9, 'Nick Young', '258 907 173 426 1441', '055', TO_DATE('2024-03-11', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Payment (Payment_ID,Card_Holder_Name, Card_Number, CVV, Expiry_Date) VALUES (10, 'Craig Austin', '138 732 375 372 0891', '993', TO_DATE('2024-06-11', 'YYYY-MM-DD'))");
            
            databaseConnection.executeQuery("INSERT INTO Purchase(Purchase_ID, Price, Buy_Date) VALUES (00001, 22.5, TO_DATE('2022-10-03', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Purchase(Purchase_ID, Price, Buy_Date) VALUES (00002, 22.5, TO_DATE('2022-10-01', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Purchase(Purchase_ID, Price, Buy_Date) VALUES (00003, 15, TO_DATE('2022-09-27', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Purchase(Purchase_ID, Price, Buy_Date) VALUES (00004, 15, TO_DATE('2022-09-23', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Purchase(Purchase_ID, Price, Buy_Date) VALUES (5, 20, TO_DATE('2022-10-04', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Purchase(Purchase_ID, Price, Buy_Date) VALUES (6, 25, TO_DATE('2022-10-08', 'YYYY-MM-DD'))");
            databaseConnection.executeQuery("INSERT INTO Purchase(Purchase_ID, Price, Buy_Date) VALUES (7, 17, TO_DATE('2022-10-12', 'YYYY-MM-DD'))");
            
            
               databaseConnection.executeQuery("INSERT INTO Rent (Rental_ID, Price, Date_of_rental, Expiry_Date, Rental_Period) VALUES (0001, 15, TO_DATE('2022-03-10', 'YYYY-MM-DD'), TO_DATE('2022-10-10','YYYY-MM-DD'), '1w')");
               databaseConnection.executeQuery("INSERT INTO Rent (Rental_ID, Price, Date_of_rental, Expiry_Date, Rental_Period) VALUES (0002, 15, TO_DATE('2022-01-10', 'YYYY-MM-DD'), TO_DATE('2022-08-10','YYYY-MM-DD'), '1w')");
               databaseConnection.executeQuery("INSERT INTO Rent (Rental_ID, Price, Date_of_rental, Expiry_Date, Rental_Period) VALUES (0003, 10, TO_DATE('2022-09-29', 'YYYY-MM-DD'), TO_DATE('2022-04-10','YYYY-MM-DD'), '1w')");
               databaseConnection.executeQuery("INSERT INTO Rent (Rental_ID, Price, Date_of_rental, Expiry_Date, Rental_Period) VALUES (0004, 10, TO_DATE('2022-09-23', 'YYYY-MM-DD'), TO_DATE('2022-09-30','YYYY-MM-DD'), '1w')");
               databaseConnection.executeQuery("INSERT INTO Rent (Rental_ID, Price, Date_of_rental, Expiry_Date, Rental_Period) VALUES (5, 7, TO_DATE('2022-10-11', 'YYYY-MM-DD'), TO_DATE('2022-10-18', 'YYYY-MM-DD'), '1w')");
               databaseConnection.executeQuery("INSERT INTO Rent (Rental_ID, Price, Date_of_rental, Expiry_Date, Rental_Period) VALUES (6, 10, TO_DATE('2022-10-07', 'YYYY-MM-DD'), TO_DATE('2022-10-14', 'YYYY-MM-DD'), '1w')");
               databaseConnection.executeQuery("INSERT INTO Rent (Rental_ID, Price, Date_of_rental, Expiry_Date, Rental_Period) VALUES (7, 5, TO_DATE('2022-10-03', 'YYYY-MM-DD'), TO_DATE('2022-10-09', 'YYYY-MM-DD'), '1w')");
            
            
            
                databaseConnection.executeQuery("INSERT INTO Billing_Address(Street, City, Postal_code, Province, Payment_ID) VALUES ('90 Bellows Ave', 'Mississuaga', 'L8R 9Y2', 'ON', 0001)");
                databaseConnection.executeQuery("INSERT INTO Billing_Address(Street, City, Postal_code, Province, Payment_ID) VALUES ('30 Dundas St', 'Toronto', 'M3K 1R5', 'ON', 0002)");
                databaseConnection.executeQuery("INSERT INTO Billing_Address(Street, City, Postal_code, Province, Payment_ID) VALUES ('44 Elmwood Ave', 'North York', 'M3V 4N9', 'ON', 0003)");

            
            
            databaseConnection.executeQuery("INSERT INTO Production_Company (Company_ID, Password, Movies) VALUES (001, 'BestMovieMakers123', 'Mean girls')");
            databaseConnection.executeQuery("INSERT INTO Production_Company (Company_ID, Password, Movies) VALUES (002, 'BeesAreCool', 'Inception')");
            databaseConnection.executeQuery("INSERT INTO Production_Company (Company_ID, Password, Movies) VALUES (003, 'Pinapple972', 'Good Will Hunting')");
            databaseConnection.executeQuery("INSERT INTO Production_Company (Company_ID, Password, Movies) VALUES (004, 'Kevin26', 'Dispicable Me')");
            databaseConnection.executeQuery("INSERT INTO Production_Company(Company_ID, Password, Movies) VALUES (5, 'YungShmoney$', 'Madagascar')");
            databaseConnection.executeQuery("INSERT INTO Production_Company(Company_ID, Password, Movies) VALUES (6, 'Password123', 'Spider-Man No Way Home')");
            databaseConnection.executeQuery("INSERT INTO Production_Company(Company_ID, Password, Movies) VALUES (7, 'Lebron212', 'The Exorcist')");
            
                databaseConnection.executeQuery("INSERT INTO Movie (Title, Genre, Director, Release_Year, Synopsis, Duration) VALUES ('Mean Girls', 'Comedy/Teen', 'Mark Waters', 2004, 'Cady Heron unwittingly finds herself in the good graces of an elite group of cool students dubbed the Plastics, but she soon realizes how her shallow group of new friends earned this nickname', 157)");
                databaseConnection.executeQuery("INSERT INTO Movie (Title, Genre, Director, Release_Year, Synopsis, Duration) VALUES ('Inception', 'Action/Sci-fi', 'Christopher Nolan', 2010, 'Dom Cobb is a thief with the rare ability to enter peoples dreams and steal tehir secrets from their subconscious', 148)");
                databaseConnection.executeQuery("INSERT INTO Movie (Title, Genre, Director, Release_Year, Synopsis, Duration) VALUES ('Good Will Hunting', 'Drama/Romance', 'Gus Van Sant', 1998, 'Will Hunting has a genius-level IQ but chooses to work as a janitor at MIT', 126)");
                databaseConnection.executeQuery("INSERT INTO Movie (Title, Genre, Director, Release_Year, Synopsis, Duration) VALUES ('Despicable Me', 'Family/Comedy', 'Pierre Coffin', 2010, 'Supervillain Gru, a man who delights in all things wicked, hatches a plan to steal the moon', 95)");
                databaseConnection.executeQuery("INSERT INTO Movie (Title, Genre, Director, Release_Year, Synopsis, Duration) VALUES ('Madagascar', 'Animation', 'Tom McGrath', 2005, 'Alex the lion is the king of the urban jungle, the main attraction at New Yorks Central Park Zoo. He and his best friends -- Marty the zebra, Melman the giraffe and Gloria the hippo -- have spent their whole lives in blissful captivity before an admiring public and with regular meals provided for them. Not content to leave well enough alone, Marty lets his curiosity get the better of him and makes his escape -- with the help of some prodigious penguins -- to explore the world.', 86)");
                databaseConnection.executeQuery("INSERT INTO Movie (Title, Genre, Director, Release_Year, Synopsis, Duration) VALUES ('Spider-Man No Way Home', 'Action', 'Jon Watts', 2021, 'With Spider-Man identity now revealed, our friendly neighborhood web-slinger is unmasked and no longer able to separate his normal life as Peter Parker from the high stakes of being a superhero. When Peter asks for help from Doctor Strange, the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.', 148)");
                databaseConnection.executeQuery("INSERT INTO Movie (Title, Genre, Director, Release_Year, Synopsis, Duration) VALUES ('The Exorcist', 'Horror', 'John Boorman', 1973, 'One of the most profitable horror movies ever made, this tale of an exorcism is based loosely on actual events. When young Regan (Linda Blair) starts acting odd -- levitating, speaking in tongues -- her worried mother (Ellen Burstyn) seeks medical help, only to hit a dead end. A local priest (Jason Miller), however, thinks the girl may be seized by the devil. The priest makes a request to perform an exorcism, and the church sends in an expert (Max von Sydow) to help with the difficult job.', 132)");
            
                databaseConnection.executeQuery("INSERT INTO Movie_Rating (Rating, Title) VALUES (4, 'Mean Girls')");
                databaseConnection.executeQuery("INSERT INTO Movie_Rating (Rating, Title) VALUES (5, 'Inception')");
                databaseConnection.executeQuery("INSERT INTO Movie_Rating (Rating, Title) VALUES (5, 'Good Will Hunting')");
                databaseConnection.executeQuery("INSERT INTO Movie_Rating (Rating, Title) VALUES (4, 'Despicable Me')");
                databaseConnection.executeQuery("INSERT INTO Movie_Rating (Rating, Title) VALUES (4, 'Madagascar')");
                databaseConnection.executeQuery("INSERT INTO Movie_Rating (Rating, Title) VALUES (5, 'Spider-Man No Way Home')");
                databaseConnection.executeQuery("INSERT INTO Movie_Rating (Rating, Title) VALUES (3.5, 'The Exorcist')");

                databaseConnection.executeQuery("INSERT INTO Admin VALUES (01, 5678)");
             
                    databaseConnection.executeQuery("INSERT INTO Can_Access (Admin_ID, Payment_ID, Username, Purchase_ID, Rental_ID, Title, Company_ID) VALUES (01, 0001, 'munevver', 00001, 0001, 'Mean Girls', 001)");
                    databaseConnection.executeQuery("INSERT INTO Can_Access (Admin_ID, Payment_ID, Username, Purchase_ID, Rental_ID, Title, Company_ID) VALUES (01, 0002, 'zamla', 00002, 0002, 'Inception', 002)");
                    databaseConnection.executeQuery("INSERT INTO Can_Access (Admin_ID, Payment_ID, Username, Purchase_ID, Rental_ID, Title, Company_ID) VALUES (01, 0003, 'nabil', 00003, 0003, 'Good Will Hunting', 003)");
                    
                    databaseConnection.executeQuery("INSERT INTO Makes (Payment_ID, Username) VALUES (0001, 'munevver')");
                    databaseConnection.executeQuery("INSERT INTO Makes (Payment_ID, Username) VALUES (0002, 'zamla')");
                    databaseConnection.executeQuery("INSERT INTO Makes (Payment_ID, Username) VALUES (0003, 'nabil')"); 

                databaseConnection.executeQuery("INSERT INTO Rented (Username, Rental_ID, Title) VALUES ('zamla', 0001, 'Mean Girls')");
                databaseConnection.executeQuery("INSERT INTO Rented (Username, Rental_ID, Title) VALUES ('munevver', 0004, 'Despicable Me')");
                databaseConnection.executeQuery("INSERT INTO Rented (Username, Rental_ID, Title) VALUES ('nabil', 0002, 'Inception')");

                databaseConnection.executeQuery("INSERT INTO Purchased (Username, Purchase_ID, Title) VALUES ('munevver', 00001, 'Mean Girls')");
                databaseConnection.executeQuery("INSERT INTO Purchased (Username, Purchase_ID, Title) VALUES ('zamla', 00004, 'Despicable Me')");
                databaseConnection.executeQuery("INSERT INTO Purchased (Username, Purchase_ID, Title) VALUES ('nabil', 00002, 'Inception')");
                
                databaseConnection.executeQuery("INSERT INTO Sells_Rights (Company_ID, Title) VALUES (001, 'Mean Girls')");
                databaseConnection.executeQuery("INSERT INTO Sells_Rights (Company_ID, Title) VALUES (002, 'Inception')");
                databaseConnection.executeQuery("INSERT INTO Sells_Rights (Company_ID, Title) VALUES (003, 'Good Will Hunting')");
                databaseConnection.executeQuery("INSERT INTO Sells_Rights (Company_ID, Title) VALUES (004, 'Despicable Me')");
            
            
            
            databaseConnection.executeQuery("commit");
            JOptionPane.showMessageDialog(f, "All Tables Populated!");

        });
    }
}
