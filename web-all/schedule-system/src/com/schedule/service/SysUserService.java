package com.schedule.service;

import com.schedule.pojo.SysUser;

/**
 * @author: liyijia
 * @version: 0.0
 * @create time: 2024/1/24
 * @description: 该接口定义了以sys_user表格为核心的业务处理
 */
public interface SysUserService {

    /**
     * 根据用户名获得完整用户信息的方法
     * @param username 要查询的用户名
     * @return 如果找到了返回SysUser对象,找不到返回null
     */
    SysUser findByUsername(String username);

}
