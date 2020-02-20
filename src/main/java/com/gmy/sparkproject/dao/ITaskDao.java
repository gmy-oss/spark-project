package com.gmy.sparkproject.dao;

import com.gmy.sparkproject.domain.Task;

public interface ITaskDao {

    /**
     * 根据主键查询任务
     */
    Task findById(long taskid);
}
