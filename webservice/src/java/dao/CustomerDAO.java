/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.customer;

/**
 *
 * @author Administrator
 */
public class CustomerDAO extends DAO {

    public CustomerDAO() {
        super();
    }

    public int getCustomer(String cardNumber) {
        List<customer> ee = new ArrayList<customer>();

        try {
            String sql = "Select * from customer where cardNumber =?";
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cardNumber);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

               return 1;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
            e.printStackTrace();
            return 0;
        }

        return 0;
    }

    public void insertCustomer(String idString ,String cardType, String cardHolderName, String cardNumber, String cvcNumber, String expirationDate) {
        try {
            String sql = "insert into customer values(?,?,?,?,?,?)";
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, idString);
            preparedStatement.setString(2, cardType);
            preparedStatement.setString(3, cardHolderName);
            preparedStatement.setString(4, cardNumber);
            preparedStatement.setString(5, cvcNumber);
            preparedStatement.setString(6, expirationDate);
            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public static void main(String[] args) {
//        new CustomerDAO();
//    }
}
