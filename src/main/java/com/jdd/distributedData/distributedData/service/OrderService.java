package com.jdd.distributedData.distributedData.service;

import com.jdd.distributedData.distributedData.domain.Order;

import java.sql.SQLException;

public interface OrderService {

   int createOrder(Order order) throws SQLException;

   int countOrder();
}