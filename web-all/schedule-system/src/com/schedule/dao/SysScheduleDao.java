package com.schedule.dao;

import com.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * @author: liyijia
 * @version: 0.0
 * @create time: 2024-01-2024/1/24
 * @description:
 */
public interface SysScheduleDao {
    /**
     * 用于向数据中增加一条日程记录
     * @param schedule 日程数据以 SysSchedule 实体类对象形式入参
     * @return 返回影响数据库记录的行数，行数为 0 说明增加失败，大于 0 说明增加成功
     */
    int addSchedule(SysSchedule schedule);

    /**
     * 查询所有用户的日程
     */
    List<SysSchedule> findAll();
}
