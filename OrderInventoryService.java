
package com.rest.jaxb;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.OrderDetail;
 
//import com.java2novice.model.Order;
 
@Path("/order-inventory")
public class OrderInventoryService {
 
    @GET
    @Path("/order/{orderId}")
    @Produces(MediaType.APPLICATION_XML)
    public EmployeeOrder getUserById(@PathParam("orderId") Integer orderId){
         
        OrderDetail ord = new OrderDetail();
        EmployeeOrder eord =  ord.getUserDetail(orderId);
       
     return eord;
}}