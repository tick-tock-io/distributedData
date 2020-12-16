package com.jdd.distributedData.distributedData.service.Impl;

import com.jdd.distributedData.distributedData.dao.mapper.OrderMapper;
import com.jdd.distributedData.distributedData.domain.Order;
import com.jdd.distributedData.distributedData.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int createOrder(Order order) throws SQLException {
        int result = orderMapper.saveOrder(order.getOrderId(), order.getProductName());
        return result;
    }

    @Override
    public int countOrder() {
        return orderMapper.countOrder();
    }
}