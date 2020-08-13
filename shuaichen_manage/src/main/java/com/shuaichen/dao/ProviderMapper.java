package com.shuaichen.dao;

import com.shuaichen.entity.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProviderMapper {
    //查询供应商信息
    Provider selectProviderById(@Param("providerId") String id);
    //所有供应商信息
    List<Provider> selectProviderList();
    //添加供应商
    int addProvider(Provider provider);
    //修改供应商信息
    int updateProvider(Provider provider);
    //删除供应商
    int deleteProviderById(@Param("providerId") String id);
}