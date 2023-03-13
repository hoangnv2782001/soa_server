/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;
import service.*;
/**
 *
 * @author Administrator
 */
public class Client1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Travel_Service s = new Travel_Service();
       Travel port = s.getTravelPort();
       System.out.println(port.calculateFee("abc", "123", "vd", "ss", "gvvd"));
    }
    
}
