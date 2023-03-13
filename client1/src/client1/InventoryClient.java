/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;
import inventoryclient.*;
/**
 *
 * @author Administrator
 */
public class InventoryClient {
    public static void main(String[] args) {
        InventoryService_Service iss = new InventoryService_Service();
        InventoryService port = iss.getInventoryServicePort();
        System.out.println("Ket Qua :"+port.checkInventory("sp1", 5));
    }
}
