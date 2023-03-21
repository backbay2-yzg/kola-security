package com.backbay2.kolasecurity.modules.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 系统菜单资源关系表
 * </p>
 *
 * @author backbay2
 * @since 2023-03-21 10:03:46
 */
@Getter
@Setter
@TableName("sys_menu_resource_relation")
@ApiModel(value = "SysMenuResourceRelation对象", description = "系统菜单资源关系表")
public class SysMenuResourceRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    private Long id;

    @ApiModelProperty("菜单ID")
    private Long menuId;

    @ApiModelProperty("资源ID")
    private Long resourceId;
}
