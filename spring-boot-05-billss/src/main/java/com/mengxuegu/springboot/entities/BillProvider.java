package com.mengxuegu.springboot.entities;

/**
 * @Author: liuwenjing
 * @Description:
 * @Date: Create in 6:49 2020/3/9
 */
public class BillProvider extends Bill {
    private String providerName;

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}
