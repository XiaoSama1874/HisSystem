package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.diseaseDiagnose;
import com.xiaosama.HisSystem.po.diseaseDiagnoseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface diseaseDiagnoseMapper {
    int countByExample(diseaseDiagnoseExample example);

    int deleteByExample(diseaseDiagnoseExample example);

    int insert(diseaseDiagnose record);

    int insertSelective(diseaseDiagnose record);

    List<diseaseDiagnose> selectByExample(diseaseDiagnoseExample example);

    int updateByExampleSelective(@Param("record") diseaseDiagnose record, @Param("example") diseaseDiagnoseExample example);

    int updateByExample(@Param("record") diseaseDiagnose record, @Param("example") diseaseDiagnoseExample example);
}