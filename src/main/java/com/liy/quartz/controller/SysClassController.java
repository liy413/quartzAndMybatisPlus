package com.liy.quartz.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liy.quartz.entity.SysClass;
import com.liy.quartz.service.SysClassService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 班级表(SysClass)表控制层
 *
 * @author makejava
 * @since 2021-03-12 10:36:18
 */
@RestController
@RequestMapping("sysClass")
public class SysClassController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SysClassService sysClassService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param sysClass 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SysClass> page, SysClass sysClass) {
        return success(this.sysClassService.page(page, new QueryWrapper<>(sysClass)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.sysClassService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param sysClass 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SysClass sysClass) {
        return success(this.sysClassService.save(sysClass));
    }

    /**
     * 修改数据
     *
     * @param sysClass 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SysClass sysClass) {
        return success(this.sysClassService.updateById(sysClass));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.sysClassService.removeByIds(idList));
    }
}