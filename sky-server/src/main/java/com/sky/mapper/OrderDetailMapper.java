package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface OrderDetailMapper {

    /**
     * 插入订单明细数据
     * @param orderDetailList
     */
    void insertBatch(ArrayList<OrderDetail> orderDetailList);

    /**
     * 通过订单id查询其中你的订单详情
     * @param orderId
     * @return
     */
    @Select("select * from order_detail where order_id= #{orderId}")
    List<OrderDetail> getByOrderId(Long orderId);
}
