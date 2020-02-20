package com.gmy.sparkproject.test;

import com.gmy.sparkproject.dao.ITaskDao;
import com.gmy.sparkproject.dao.impl.DAOFactory;
import com.gmy.sparkproject.domain.Task;

public class TaskDAOTest {

    public static void main(String[] args) {
        ITaskDao taskDao = DAOFactory.getTaskDAO();

        Task task = taskDao.findById(2);

        System.out.println(task.getTaskName());
    }
}
