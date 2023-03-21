package com.backbay2.kolasecurity.modules.sys.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 系统部门表
 * </p>
 *
 * @author backbay2
 * @since 2023-03-21 10:03:46
 */
@Getter
@Setter
@TableName("sys_dept")
@ApiModel(value = "SysDept对象", description = "系统部门表")
public class SysDept implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("部门代码")
    private String code;

    @ApiModelProperty("部门名称")
    private String name;

    @ApiModelProperty("状态（0:启用，1禁用）")
    private Boolean status;
}
