/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;
import orderclient.*;
import orderclient.OrderService_Service;

/**
 *
 * @author Administrator
 */
public class OrderClient {
    public static void main(String[] args) {
        OrderService_Service oss = new OrderService_Service();
        OrderService port = oss.getOrderServicePort();
        System.out.println("Trang Thai Don Hang : "+ port.checkOrderStatus("ZRA56782C",  "Mega Electronics Ltd."));
    }
}
