package com.gmy.sparkproject.dao.impl;

import com.gmy.sparkproject.dao.ITaskDao;

public class DAOFactory {

    public static ITaskDao getTaskDAO(){
        return new TaskDaoImpl();
    }
}
