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
 * 菜单权限表
 * </p>
 *
 * @author backbay2
 * @since 2023-03-21 10:03:46
 */
@Getter
@Setter
@TableName("sys_menu")
@ApiModel(value = "SysMenu对象", description = "菜单权限表")
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("父级ID")
    private Integer parentId;

    @ApiModelProperty("菜单权限编码")
    private String code;

    @ApiModelProperty("菜单权限名称")
    private String name;

    @ApiModelProperty("菜单权限类型(1:目录;2:菜单;3:按钮)")
    private String type;

    @ApiModelProperty("授权码(如：system:user:add)")
    private String perms;

    @ApiModelProperty("资源请求类型")
    private String method;

    @ApiModelProperty("访问地址URL")
    private String url;

    @ApiModelProperty("菜单图标")
    private String icon;

    @ApiModelProperty("组件路径")
    private String component;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("菜单状态（0显示 1隐藏）")
    private Boolean visible;

    @ApiModelProperty("菜单状态（0正常 1停用）")
    private Boolean status;

    @ApiModelProperty("菜单备注")
    private String remark;

    @ApiModelProperty("创建时间")
    private LocalDateTime createAt;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateAt;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("菜单等级")
    private Integer level;
}
