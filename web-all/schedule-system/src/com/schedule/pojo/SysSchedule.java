package com.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: liyijia
 * @version: 0.0
 * @create time: 2024-01-2024/1/24
 * @description: ***********************************************************
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysSchedule {
    private Integer sid;
    private Integer uid;
    private String title;
    private Integer completed;
}
