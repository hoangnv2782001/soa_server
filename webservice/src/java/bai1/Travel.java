/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import dao.CustomerDAO;
import java.util.List;
import model.customer;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "Travel")
public class Travel {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "calculateFee")
    public String hello(@WebParam(name = "cardHolderName") String cardHolderName,
            @WebParam(name = "cardType") String cardType,
            @WebParam(name = "cardNumber") String cardNumber,
            @WebParam(name = "cvcNumber") String cvcNumber,
            @WebParam(name = "expirationDate") String expirationDate) {
//        return cardHolderName;
//        return "abcnxjdxjd";
        CustomerDAO d = new CustomerDAO();
//        List<customer> l = d.getCustomer(cardHolderName);
//        if(l == null){
//            return "null";
//        }
//        if (l.size()==0) {
//            return "Khong hop le";
//        }
//        String type = l.get(0).getCardType();
//        if(type.equals("visa")){
//            return "Ban het 10k";
//        }
//        return "Ban het 30k";
        int result = d.getCustomer(cardNumber);
        if(result ==0)
            d.insertCustomer(cardHolderName+cardNumber, cardType, cardHolderName, cardNumber, cvcNumber, expirationDate);
        return "Thanh Cong";
    }
}
