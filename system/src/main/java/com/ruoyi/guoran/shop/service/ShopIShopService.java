package com.ruoyi.shop.service;

import com.ruoyi.guoran.domain.Shop;

import java.util.List;

/**
 * 门店信息Service接口
 * 
 * @author zgf
 * @date 2023-12-26
 */
public interface ShopIShopService
{
    /**
     * 查询门店信息
     * 
     * @param sId 门店信息主键
     * @return 门店信息
     */
    public Shop selectShopBySId(Long sId);

    /**
     * 查询门店信息列表
     * 
     * @param shop 门店信息
     * @return 门店信息集合
     */
    public List<Shop> selectShopList(Shop shop);

    /**
     * 新增门店信息
     * 
     * @param shop 门店信息
     * @return 结果
     */
    public int insertShop(Shop shop);

    /**
     * 修改门店信息
     * 
     * @param shop 门店信息
     * @return 结果
     */
    public int updateShop(Shop shop);

    /**
     * 批量删除门店信息
     * 
     * @param sIds 需要删除的门店信息主键集合
     * @return 结果
     */
    public int deleteShopBySIds(String sIds);

    /**
     * 删除门店信息信息
     * 
     * @param sId 门店信息主键
     * @return 结果
     */
    public int deleteShopBySId(Long sId);

    List<String> selectname();

    String selectname1(String name);

}
