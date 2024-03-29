package com.ruoyi.guoran.orderforgoods.service;




import com.ruoyi.guoran.orderforgoods.domain.OrderStoreinventory;

import java.math.BigDecimal;
import java.util.List;

/**
 * 门店库存Service接口
 *
 * @author ruoyi
 * @date 2023-12-28
 */
public interface OrderIStoreinventoryService {
    /**
     * 查询门店库存
     *
     * @param inentorydetailsId 门店库存主键
     * @return 门店库存
     */
    public OrderStoreinventory selectStoreinventoryByInentorydetailsId(Long inentorydetailsId);

    /**
     * 查询门店库存列表
     *
     * @param storeinventory 门店库存
     * @return 门店库存集合
     */
    public List<OrderStoreinventory> selectStoreinventoryList(OrderStoreinventory storeinventory);

    /**
     * 新增门店库存
     *
     * @param storeinventory 门店库存
     * @return 结果
     */
    public int insertStoreinventory(OrderStoreinventory storeinventory);

    /**
     * 修改门店库存
     *
     * @param storeinventory 门店库存
     * @return 结果
     */
    public int updateStoreinventory(OrderStoreinventory storeinventory);

    /**
     * 批量删除门店库存
     *
     * @param inentorydetailsIds 需要删除的门店库存主键集合
     * @return 结果
     */
    public int deleteStoreinventoryByInentorydetailsIds(String inentorydetailsIds);

    /**
     * 删除门店库存信息
     *
     * @param inentorydetailsId 门店库存主键
     * @return 结果
     */
    public int deleteStoreinventoryByInentorydetailsId(Long inentorydetailsId);

    /*条件查询存*/
    OrderStoreinventory getStoreinventoryByShopIdAndFruitId(String shopId, String fruitId);

    BigDecimal selectNumberByFruitIdAndFruittypesId(String fruitId, String fruittypesId);
}
