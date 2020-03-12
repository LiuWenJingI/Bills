package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.Provider;

import java.util.List;

/**
 * @Author: liuwenjing
 * @Description:
 * @Date: Create in 18:59 2020/3/8
 */
public interface ProviderMapper {
    List<Provider> getProvider(Provider provider);
    Provider getProviderByPid(Integer pid);
    int addProvider(Provider provider);
    int deleteProvider(Provider provider);
    int deleteProviderByPid(Integer pid);
    int updateProvider(Provider provider);
}
