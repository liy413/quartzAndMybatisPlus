package com.liy.quartz.controller;

import com.liy.quartz.entity.SysUser;
import com.liy.quartz.service.SysUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户表(SysUser)表控制层
 *
 * @author liy
 * @since 2021-03-11 17:01:22
 */
@Slf4j
@RestController
@RequestMapping("sysUser")
@AllArgsConstructor
public class SysUserController {
    /**
     * 服务对象
     */
    private SysUserService sysUserService;

    @GetMapping("/list")
    public void list(){
        List<SysUser> list = sysUserService.list();
        for (SysUser sysUser : list) {
            log.info(sysUser.toString());
        }
    }
}