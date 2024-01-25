package com.schedule.dao;

import com.schedule.pojo.SysSchedule;
import com.schedule.pojo.SysUser;

/**
 * @author: liyijia
 * @version: 0.0
 * @create time: 2024-01-2024/1/24
 * @description: Data Access Object，数据访问对象，该类用于对表格进行 CRUD 操作
 * DAO 一般需要定义接口和实现类！因为接口就是规范。
 *
 *
 * @规范：
 *  1. Dao 接口需要添加良好的文档说明
 *  2.
 *
 */
public interface SysUserDao {
    /**
     * 根据用户名获得完整用户信息的方法
     * @param username 要查询的用户名
     * @return 如果找到了返回SysUser对象,找不到返回null
     */
    SysUser findByUsername(String username);
}
