package com.jdd.distributedData.distributedData.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface OrderMapper extends BaseMapper{

    int saveOrder(@Param("orderId") Integer orderId,
                  @Param("productName") String productName,
                  @Param("mobileNumber") String mobileNumber);

    int countOrder();
}