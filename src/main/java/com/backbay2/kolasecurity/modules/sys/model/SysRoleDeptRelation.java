package com.backbay2.kolasecurity.modules.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author backbay2
 * @since 2023-03-21 10:03:47
 */
@Getter
@Setter
@TableName("sys_role_dept_relation")
@ApiModel(value = "SysRoleDeptRelation对象", description = "")
public class SysRoleDeptRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("角色ID")
    private Long roleId;

    @ApiModelProperty("部门ID")
    private Long deptId;
}
