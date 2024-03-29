package com.ruoyi.guoran.orderforgoods.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.guoran.orderforgoods.domain.OrderReturnStatistics;
import com.ruoyi.guoran.orderforgoods.service.OrderIReturnStatisticsService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 退货统计Controller
 * 
 * @author chunyuw61
 * @date 2023-12-29
 */
@Controller
@RequestMapping("/orderforgoods/statistics")
public class OrderReturnStatisticsController extends BaseController
{
    private String prefix = "orderforgoods/statistics";

    @Autowired
    private OrderIReturnStatisticsService returnStatisticsService;

    @RequiresPermissions("orderforgoods:statistics:view")
    @GetMapping()
    public String statistics()
    {
        return prefix + "/statistics";
    }

    /**
     * 查询退货统计列表
     */
    @RequiresPermissions("orderforgoods:statistics:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OrderReturnStatistics returnStatistics)
    {
        startPage();
        List<OrderReturnStatistics> list = returnStatisticsService.selectReturnStatisticsList(returnStatistics);
        for (OrderReturnStatistics statistics : list) {
            System.out.println("--------------------------------------------------------");
            System.out.println(statistics);
            System.out.println("--------------------------------------------------------");
        }
        return getDataTable(list);
    }

    /**
     * 导出退货统计列表
     */
    @RequiresPermissions("orderforgoods:statistics:export")
    @Log(title = "退货统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OrderReturnStatistics returnStatistics)
    {
        List<OrderReturnStatistics> list = returnStatisticsService.selectReturnStatisticsList(returnStatistics);
        ExcelUtil<OrderReturnStatistics> util = new ExcelUtil<OrderReturnStatistics>(OrderReturnStatistics.class);
        return util.exportExcel(list, "退货统计数据");
    }

    /**
     * 新增退货统计
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存退货统计
     */
    @RequiresPermissions("orderforgoods:statistics:add")
    @Log(title = "退货统计", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OrderReturnStatistics returnStatistics)
    {
        return toAjax(returnStatisticsService.insertReturnStatistics(returnStatistics));
    }

    /**
     * 修改退货统计
     */
    @RequiresPermissions("orderforgoods:statistics:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        OrderReturnStatistics returnStatistics = returnStatisticsService.selectReturnStatisticsById(id);
        mmap.put("returnStatistics", returnStatistics);
        return prefix + "/edit";
    }

    /**
     * 修改保存退货统计
     */
    @RequiresPermissions("orderforgoods:statistics:edit")
    @Log(title = "退货统计", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OrderReturnStatistics returnStatistics)
    {
        return toAjax(returnStatisticsService.updateReturnStatistics(returnStatistics));
    }

    /**
     * 删除退货统计
     */
    @RequiresPermissions("orderforgoods:statistics:remove")
    @Log(title = "退货统计", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(returnStatisticsService.deleteReturnStatisticsByIds(ids));
    }
}
