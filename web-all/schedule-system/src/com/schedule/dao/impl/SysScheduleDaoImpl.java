package com.schedule.dao.impl;

import com.schedule.dao.BaseDao;
import com.schedule.dao.SysScheduleDao;
import com.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * @author: liyijia
 * @version: 0.0
 * @create time: 2024-01-2024/1/24
 * @description: ***********************************************************
 */
public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {

    @Override
    public int addSchedule(SysSchedule schedule){
        String sql = "INSERT INTO sys_schedule values(DEFAULT, ?, ?, ?)";
        int rows = baseUpdate(sql, schedule.getUid(), schedule.getTitle(), schedule.getCompleted());
        return rows;
    }

    /**
     * 查询所有用户的日程
     */
    @Override
    public List<SysSchedule> findAll() {
        String sql = "SELECT sid, uid, title, completed from sys_schedule";
        List<SysSchedule> schedules = baseQuery(SysScheduleDao.class, sql);
        return schedules;
    }
}
