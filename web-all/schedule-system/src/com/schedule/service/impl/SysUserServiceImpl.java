package com.schedule.service.impl;

import com.schedule.dao.SysUserDao;
import com.schedule.dao.impl.SysUserDaoImpl;
import com.schedule.pojo.SysUser;
import com.schedule.service.SysUserService;

/**
 * @author: liyijia
 * @version: 0.0
 * @create time: 2024/1/24
 * @description: 实现了以sys_user表格为核心的业务处理
 */
public class SysUserServiceImpl implements SysUserService {
    private SysUserDao userDao =new SysUserDaoImpl();

    @Override
    public SysUser findByUsername(String username) {
        // 调用服务层方法,继续查询

        return userDao.findByUsername(username);
    }
}
