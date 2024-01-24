package com.schedule.test;

import com.schedule.dao.BaseDao;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author: Li Yijia
 * @version:
 * @created: 2024/1/24
 * @description:
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
}
