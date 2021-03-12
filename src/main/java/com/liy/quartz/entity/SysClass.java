package com.liy.quartz.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 班级表(SysClass)表实体类
 *
 * @author makejava
 * @since 2021-03-12 10:36:18
 */
@SuppressWarnings("serial")
public class SysClass extends Model<SysClass> {
    //所属租户
    private Integer tenantId;
    //班级ID
    private String classId;
    //班级名称
    private String className;
    //教室ID
    private String roomId;
    //年级名称
    private String gradeName;
    //部门ID
    private Integer deptId;
    //班级人数
    private Integer stuCount;
    //简易分析考勤人数
    private Integer easyCount;
    //录课总数
    private Long courseCount;
    //考勤状态,同时代表正在上课 1 未上课 2 上课中
    private Integer attendanceFlag;
    //删除标记
    private String delFlag;
    //类型（1、固定班级；2、虚拟班级；）
    private Integer classType;


    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getStuCount() {
        return stuCount;
    }

    public void setStuCount(Integer stuCount) {
        this.stuCount = stuCount;
    }

    public Integer getEasyCount() {
        return easyCount;
    }

    public void setEasyCount(Integer easyCount) {
        this.easyCount = easyCount;
    }

    public Long getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(Long courseCount) {
        this.courseCount = courseCount;
    }

    public Integer getAttendanceFlag() {
        return attendanceFlag;
    }

    public void setAttendanceFlag(Integer attendanceFlag) {
        this.attendanceFlag = attendanceFlag;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getClassType() {
        return classType;
    }

    public void setClassType(Integer classType) {
        this.classType = classType;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.classId;
    }
    }