package com.liy.quartz.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表(SysUser)实体类
 *
 * @author makejava
 * @since 2021-03-11 17:01:18
 */
@Data
public class SysUser implements Serializable {
    private static final long serialVersionUID = -24419968809620659L;
    /**
    * 主键ID
    */
    private Integer userId;
    /**
    * 用户名
    */
    private String username;
    
    private String password;
    /**
    * 随机盐
    */
    private String salt;
    /**
    * 简介
    */
    private String phone;
    /**
    * 头像
    */
    private String avatar;
    /**
    * 部门ID
    */
    private Integer deptId;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 修改时间
    */
    private Date updateTime;
    /**
    * 0-正常，9-锁定
    */
    private String lockFlag;
    /**
    * 0-正常，1-删除
    */
    private String delFlag;
    /**
    * 微信openid
    */
    private String wxOpenid;
    /**
    * QQ openid
    */
    private String qqOpenid;
    /**
    * 所属租户
    */
    private Integer tenantId;
    /**
    * 用户姓名
    */
    private String userRealname;
    /**
    * 用户类型（0、sa平台管理员；1、管理员；2、普通用户；3、老师；4、学生；9、ycat/ynes用户）
    */
    private Integer userType;
    /**
    * 频道ID
    */
    private String channelId;
    /**
    * 第三方用户id
    */
    private String thirdUserId;
    /**
    * 学号/工号
    */
    private String jobNumber;
    /**
    * 身份证号
    */
    private String idNumber;




}