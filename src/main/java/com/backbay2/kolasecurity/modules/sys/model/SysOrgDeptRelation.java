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
 * 
 * </p>
 *
 * @author backbay2
 * @since 2023-03-21 10:03:46
 */
@Getter
@Setter
@TableName("sys_org_dept_relation")
@ApiModel(value = "SysOrgDeptRelation对象", description = "")
public class SysOrgDeptRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("组织ID")
    private Long orgId;

    @ApiModelProperty("部门ID")
    private Long deptId;
}
