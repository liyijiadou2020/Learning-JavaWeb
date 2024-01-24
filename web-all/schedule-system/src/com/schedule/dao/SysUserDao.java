package com.schedule.dao;

import com.schedule.pojo.SysSchedule;

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
     * 用于向数据中增加一条日程记录
     * @param schedule 日程数据以 SysSchedule 实体类对象形式入参
     * @return 返回影响数据库记录的行数，行数为 0 说明增加失败，大于 0 说明增加成功
     */
    int addSchedule(SysSchedule schedule);

}
