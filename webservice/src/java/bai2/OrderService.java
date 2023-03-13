/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

//import java.lang.annotation.Documented;
import dao.OrderDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "OrderService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class OrderService {

    @WebMethod(operationName = "checkOrderStatus")
    public String checkOrderStatus(@WebParam(name = "OrderNumber") String OrderNumber,
                                   @WebParam(name = "companyID")String companyID) {
        OrderDAO o = new OrderDAO();
        String status = o.getOrderStatus(OrderNumber);
        if(status == null){
            return "Don Hang Khong Ton Tai";
        }
        return status;
    }
}
