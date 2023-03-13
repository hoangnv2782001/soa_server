/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import dao.InventoryDAO;
import dao.OrderDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "InventoryService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class InventoryService {

    @WebMethod(operationName = "checkInventory")
    public String checkInventory(
            @WebParam(name = "productId") String productId,
            @WebParam(name = "quantity") int quantity) {
        InventoryDAO dao = new InventoryDAO();

        int currentInventory = dao.getQuantity(productId);

        if (currentInventory >= quantity && currentInventory != -1) {
            return "Hang Van Con Trong Kho";
        } else if (currentInventory != -1) {
            return "Da Het San Pham";
        }
        return "San Pham Khong Ton Tai";
        
    }
}
