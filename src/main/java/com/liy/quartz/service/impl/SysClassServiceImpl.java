package com.liy.quartz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liy.quartz.entity.SysClass;
import com.liy.quartz.mapper.SysClassMapper;
import com.liy.quartz.service.SysClassService;
import org.springframework.stereotype.Service;

/**
 * 班级表(SysClass)表服务实现类
 *
 * @author makejava
 * @since 2021-03-12 10:36:18
 */
@Service("sysClassService")
public class SysClassServiceImpl extends ServiceImpl<SysClassMapper, SysClass> implements SysClassService {

}