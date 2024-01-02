package com.ruoyi.inventory.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 出货单对象 warehousestock
 * 
 * @author 24K纯帅
 * @date 2023-12-26
 */
public class Warehousestock extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long whId;

    /** 仓库编号 */
    @Excel(name = "仓库编号")
    private String wId;

    /** 水果编号 */
    @Excel(name = "水果编号")
    private String fruitId;

    /** 水果种类编号 */
    @Excel(name = "水果种类编号")
    private String fruittypesId;

    /** 水果名称 */
    @Excel(name = "水果名称")
    private String fruitName;

    /** 进价 */
    @Excel(name = "进价")
    private BigDecimal jinjia;

    /** 数量 */
    @Excel(name = "数量")
    private Double whCount;

    /** 乐观锁 */
    private Long REVISION;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 更新人 */
    @Excel(name = "更新人")
    private String updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedTime;

    /** 状态 */
    @Excel(name = "状态")
    private Long isStatus;

    public void setWhId(Long whId) 
    {
        this.whId = whId;
    }

    public Long getWhId() 
    {
        return whId;
    }
    public void setwId(String wId)
    {
        this.wId = wId;
    }

    public String getwId()
    {
        return wId;
    }
    public void setFruitId(String fruitId)
    {
        this.fruitId = fruitId;
    }

    public String getFruitId()
    {
        return fruitId;
    }
    public void setFruittypesId(String fruittypesId) 
    {
        this.fruittypesId = fruittypesId;
    }

    public String getFruittypesId() 
    {
        return fruittypesId;
    }
    public void setFruitName(String fruitName) 
    {
        this.fruitName = fruitName;
    }

    public String getFruitName() 
    {
        return fruitName;
    }
    public void setJinjia(BigDecimal jinjia)
    {
        this.jinjia = jinjia;
    }

    public BigDecimal getJinjia()
    {
        return jinjia;
    }
    public void setWhCount(Double whCount)
    {
        this.whCount = whCount;
    }

    public Double getWhCount()
    {
        return whCount;
    }
    public void setREVISION(Long REVISION) 
    {
        this.REVISION = REVISION;
    }

    public Long getREVISION() 
    {
        return REVISION;
    }
    public void setCreatedBy(String createdBy) 
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() 
    {
        return createdBy;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setUpdatedBy(String updatedBy) 
    {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy() 
    {
        return updatedBy;
    }
    public void setUpdatedTime(Date updatedTime) 
    {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime() 
    {
        return updatedTime;
    }
    public void setIsStatus(Long isStatus) 
    {
        this.isStatus = isStatus;
    }

    public Long getIsStatus() 
    {
        return isStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("whId", getWhId())
            .append("wId", getwId())
            .append("fruitId", getFruitId())
            .append("fruittypesId", getFruittypesId())
            .append("fruitName", getFruitName())
            .append("jinjia", getJinjia())
            .append("whCount", getWhCount())
            .append("REVISION", getREVISION())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .append("isStatus", getIsStatus())
            .toString();
    }
}
