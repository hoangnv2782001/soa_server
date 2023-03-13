/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class OrderDAO extends DAO {

    public OrderDAO() {
        super();
    }

    public String getOrderStatus(String orderID) {
        try {
            Connection con = getConnection();

            String sql = "SELECT status from order1 where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, orderID);
            ResultSet rs = preparedStatement.executeQuery();
             while (rs.next()) {
               return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
