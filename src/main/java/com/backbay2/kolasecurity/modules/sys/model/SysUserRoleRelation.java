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
@TableName("sys_user_role_relation")
@ApiModel(value = "SysUserRoleRelation对象", description = "")
public class SysUserRoleRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("用户ID")
    private Long userId;

    @ApiModelProperty("角色ID")
    private Long roleId;
}
