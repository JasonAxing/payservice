package com.jmall.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.jmall.entity.Payment;
import com.jmall.entity.PaymentExample;

public interface PaymentMapper {
    long countByExample(PaymentExample example);

    int deleteByExample(PaymentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Payment record);

    int insertSelective(Payment record);

    List<Payment> selectByExample(PaymentExample example);

    Payment selectByPrimaryKey(Long id);
    
    Payment selectByTradeNo(String outTradeNo);

    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByPrimaryKeySelective(Payment record);
    
    int updateByTradeNoSelective(Payment record);

    int updateByPrimaryKey(Payment record);
}