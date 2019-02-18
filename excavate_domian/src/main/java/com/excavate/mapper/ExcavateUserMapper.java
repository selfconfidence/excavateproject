package com.excavate.mapper;

import com.excavate.pojo.ExcavateUserExample;
import com.excavate.pojo.ExcavateUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExcavateUserMapper {
    int countByExample(ExcavateUserExample example);

    int deleteByExample(ExcavateUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExcavateUser record);

    int insertSelective(ExcavateUser record);

    List<ExcavateUser> selectByExample(ExcavateUserExample example);

    ExcavateUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExcavateUser record, @Param("example") ExcavateUserExample example);

    int updateByExample(@Param("record") ExcavateUser record, @Param("example") ExcavateUserExample example);

    int updateByPrimaryKeySelective(ExcavateUser record);

    int updateByPrimaryKey(ExcavateUser record);
}