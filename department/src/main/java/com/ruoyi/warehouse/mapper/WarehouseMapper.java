package com.ruoyi.warehouse.mapper;

import java.util.List;
import com.ruoyi.warehouse.domain.Warehouse;

/**
 * 仓库信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-12-27
 */
public interface WarehouseMapper 
{
    /**
     * 查询仓库信息
     * 
     * @param wId 仓库信息主键
     * @return 仓库信息
     */
    public Warehouse selectWarehouseByWId(Long wId);

    /**
     * 查询仓库信息列表
     * 
     * @param warehouse 仓库信息
     * @return 仓库信息集合
     */
    public List<Warehouse> selectWarehouseList(Warehouse warehouse);

    /**
     * 新增仓库信息
     * 
     * @param warehouse 仓库信息
     * @return 结果
     */
    public int insertWarehouse(Warehouse warehouse);

    /**
     * 修改仓库信息
     * 
     * @param warehouse 仓库信息
     * @return 结果
     */
    public int updateWarehouse(Warehouse warehouse);

    /**
     * 删除仓库信息
     * 
     * @param wId 仓库信息主键
     * @return 结果
     */
    public int deleteWarehouseByWId(Long wId);

    /**
     * 批量删除仓库信息
     * 
     * @param wIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWarehouseByWIds(String[] wIds);
}
