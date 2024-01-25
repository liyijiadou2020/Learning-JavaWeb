package com.schedule.dao.impl;

import com.schedule.dao.BaseDao;
import com.schedule.dao.SysUserDao;
import com.schedule.pojo.SysUser;

import java.util.List;

/**
 * @author: liyijia
 * @version: 0.0
 * @create time: 2024-01-2024/1/24
 * @description: 实现 SysUser 类的 Dao
 */
public class SysUserDaoImpl extends BaseDao implements SysUserDao {
    @Override
    public SysUser findByUsername(String username) {
        String sql ="select uid,username, user_pwd userPwd from sys_user where username = ?";
        List<SysUser> userList = baseQuery(SysUser.class, sql, username);
        return  null != userList&& userList.size()>0? userList.get(0):null;
    }
}
