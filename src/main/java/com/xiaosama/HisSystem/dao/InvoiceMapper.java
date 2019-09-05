package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.Invoice;
import com.xiaosama.HisSystem.pojo.po.InvoiceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InvoiceMapper {
    int countByExample(InvoiceExample example);

    int deleteByExample(InvoiceExample example);

    int deleteByPrimaryKey(Integer number);

    int insert(Invoice record);

    int insertSelective(Invoice record);

    List<Invoice> selectByExample(InvoiceExample example);

    Invoice selectByPrimaryKey(Integer number);

    int updateByExampleSelective(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    int updateByExample(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    int updateByPrimaryKeySelective(Invoice record);

    int updateByPrimaryKey(Invoice record);
}