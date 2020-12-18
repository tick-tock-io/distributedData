package com.jdd.distributedData.distributedData.controller;

import com.jdd.distributedData.distributedData.domain.Order;
import com.jdd.distributedData.distributedData.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/createOrder")
    public String createOrder(@RequestParam(value = "orderId") Integer orderId,
                              @RequestParam(value = "productName") String productName,
                              @RequestParam(value = "mobileNumber") String mobileNumber) {
        Order order = new Order();
        order.setOrderId(orderId);
        order.setProductName(productName);
        order.setMobileNumber(mobileNumber);
        try{
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "done";
    }

    @GetMapping("/countOrder")
    public int countOrder(){
        int count = orderService.countOrder();
        return count;
    }
}
