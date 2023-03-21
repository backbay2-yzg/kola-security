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
 * @since 2023-03-21 10:03:47
 */
@Getter
@Setter
@TableName("sys_user")
@ApiModel(value = "SysUser对象", description = "")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户账号")
    private String username;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("用户手机号")
    private String mobile;

    @ApiModelProperty("用户性别（0未知，1男 2女 ）")
    private Byte sex;

    @ApiModelProperty("用户邮箱")
    private String email;

    @ApiModelProperty("头像地址")
    private String avatar;

    @ApiModelProperty("用户类型（0超级管理员，1系统管理员，2系统用户）")
    private Boolean userType;

    @ApiModelProperty("用户昵称")
    private String nickName;

    @ApiModelProperty("帐号状态（0正常 1停用）")
    private Byte status;

    @ApiModelProperty("删除标志（0存在 1删除）")
    private Byte deleted;

    @ApiModelProperty("用户创建时间")
    private LocalDateTime createAt;

    @ApiModelProperty("创建者")
    private String createBy;

    @ApiModelProperty("用户更新时间")
    private LocalDateTime updateAt;

    @ApiModelProperty("更新者")
    private String updateBy;

    @ApiModelProperty("删除时间")
    private LocalDateTime deleteAt;

    @ApiModelProperty("删除者")
    private String deleteBy;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("登录IP(INET_ATON:地址转数值,INET_NTOA:数值转地址)")
    private Integer loignIp;

    @ApiModelProperty("最后登录时间")
    private LocalDateTime loginAt;

    @ApiModelProperty("加密盐值")
    private String salt;
}
