package com.ruoyi.guoran.price.mapper;

import java.util.List;
import com.ruoyi.guoran.price.domain.PriceFruitPrice;

/**
 * 设价Mapper接口
 * 
 * @author ruoyi
 * @date 2023-12-25
 */
public interface PriceFruitPriceMapper
{
    /**
     * 查询设价
     * 
     * @param pId 设价主键
     * @return 设价
     */
    public PriceFruitPrice selectFruitPriceByPId(Long pId);

    /**
     * 查询设价列表
     * 
     * @param priceFruitPrice 设价
     * @return 设价集合
     */
    public List<PriceFruitPrice> selectFruitPriceList(PriceFruitPrice priceFruitPrice);

    /**
     * 新增设价
     * 
     * @param priceFruitPrice 设价
     * @return 结果
     */
    public int insertFruitPrice(PriceFruitPrice priceFruitPrice);

    /**
     * 修改设价
     * 
     * @param priceFruitPrice 设价
     * @return 结果
     */
    public int updateFruitPrice(PriceFruitPrice priceFruitPrice);

    /**
     * 删除设价
     * 
     * @param pId 设价主键
     * @return 结果
     */
    public int deleteFruitPriceByPId(Long pId);

    /**
     * 批量删除设价
     * 
     * @param pIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFruitPriceByPIds(String[] pIds);

    double selectJ(String code);

    Integer selectID(String code);

    Integer insertBCprice(double hxj, double lsj,String id);



}
