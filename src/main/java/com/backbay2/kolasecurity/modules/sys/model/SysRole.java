package com.backbay2.kolasecurity.modules.sys.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 系统角色表
 * </p>
 *
 * @author backbay2
 * @since 2023-03-21 10:03:47
 */
@Getter
@Setter
@TableName("sys_role")
@ApiModel(value = "SysRole对象", description = "系统角色表")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("角色名称")
    private String name;

    @ApiModelProperty("角色描述")
    private String desc;

    @ApiModelProperty("状态(0:启用 1:禁用)")
    private Boolean status;

    @ApiModelProperty("是否删除(0:删除 1:已删除)")
    private Boolean deleted;

    @ApiModelProperty("创建时间")
    private LocalDateTime createAt;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateAt;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("删除时间")
    private LocalDateTime deleteAt;

    @ApiModelProperty("删除者")
    private String deleteBy;
}
