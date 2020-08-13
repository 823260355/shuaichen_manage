package com.shuaichen.service;

import com.shuaichen.dao.ProviderMapper;
import com.shuaichen.entity.Provider;

import java.util.List;

public class ProviderServiceImpl implements ProviderService {
    private ProviderMapper providerMapper;

    public void setProviderMapper(ProviderMapper providerMapper) {
        this.providerMapper = providerMapper;
    }

    @Override
    public Provider selectProviderById(String id) {
        return providerMapper.selectProviderById(id);
    }

    @Override
    public List<Provider> selectProviderList() {
        return providerMapper.selectProviderList();
    }

    @Override
    public int addProvider(Provider provider) {
        return providerMapper.addProvider(provider);
    }

    @Override
    public int updateProvider(Provider provider) {
        return providerMapper.updateProvider(provider);
    }

    @Override
    public int deleteProviderById(String id) {
        return providerMapper.deleteProviderById(id);
    }
}
