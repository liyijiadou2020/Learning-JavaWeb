package com.schedule.test;

import com.schedule.dao.BaseDao;
import com.schedule.pojo.SysUser;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @author Li Yijia
 * @version 0
 * @created 2024/1/24
 * @description BaseDao的测试类
 */
public class TestBaseDao {

    private static BaseDao baseDao;

    @BeforeClass
    public static void initBaseDao() {
        baseDao = new BaseDao();
    }

    /**
     * 查询用户的数量
     * baseQueryObject - 查询结果集是单行单列 一个值的数据的方法
     */
    @Test
    public void testBaseQueryObject() {
        String sql = "SELECT COUNT(1) FROM sys_user";
        Long count = baseDao.baseQueryObject(Long.class, sql);
        System.out.println(count);
    }

    /**
     * 查询 sys_user 中所有用户的信息。
     * 使用 baseQuery 方法
     * 注意 如果查出来的结果和对象中的field名不一致，要使用 as 来改别名
     */
    @Test
    public void testBaseQuery() {
        String sql = "SELECT uid, username, user_pwd as userPwd FROM sys_user";
        List<SysUser> sysUserList = baseDao.baseQuery(SysUser.class, sql);
        sysUserList.forEach(System.out::println); // lambda 中的包含引用
    }

    /**
     * 测试通用的增删改
     */
    @Test
    public void testBaseupdate() {
        String sql = "INSERT INTO sys_schedule values(DEFAULT, ?, ?, ?)";
        int rows = baseDao.baseUpdate(sql, 1, "学习Java", 0);
        System.out.println(rows);
    }


}
