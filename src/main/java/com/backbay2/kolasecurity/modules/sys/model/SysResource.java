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
 * 
 * </p>
 *
 * @author backbay2
 * @since 2023-03-21 10:03:46
 */
@Getter
@Setter
@TableName("sys_resource")
@ApiModel(value = "SysResource对象", description = "")
public class SysResource implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("资源权限编码")
    private String code;

    @ApiModelProperty("资源权限名称")
    private String name;

    @ApiModelProperty("资源权限类型('B':按钮)")
    private String type;

    @ApiModelProperty("授权码(如：system:user:add)")
    private String perms;

    @ApiModelProperty("资源请求类型")
    private String method;

    @ApiModelProperty("访问地址URL")
    private String url;

    @ApiModelProperty("组件路径")
    private String component;

    @ApiModelProperty("菜单状态（0显示 1隐藏）")
    private Boolean visible;

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
}
