package com.gmy.sparkproject.test;


import com.gmy.sparkproject.jdbc.JDBCHelper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class JDBCHelperTest {

    public static void main(String[] args) {
        JDBCHelper jdbcHelper = JDBCHelper.getInstance();

//      测试普通的增删改语句

jdbcHelper.executeUpdate
        ("insert into test_user(name,age) values(?,?)",new Object[] {"王二",23});

        final Map<String,Object> testUser = new HashMap<String, Object>();

        jdbcHelper.executeQuery("select name,age from test_user where id=?",
                new Object[]{5}, new JDBCHelper.QueryCallback() {
                    @Override
                    public void process(ResultSet rs) throws Exception {
                        if (rs.next()){
                            String name = rs.getString(1);
                            int age = rs.getInt(2);


                            testUser.put("name",name);
                            testUser.put("age",age);
                        }
                    }
                });
        System.out.println(testUser.get("name")+":"+testUser.get("age"));

        String sql = "insert into test_user(name,age) values(?,?)";

        List<Object[]> paramsList = new ArrayList<Object[]>();
        paramsList.add(new Object[]{"路星河",27});
        paramsList.add(new Object[]{"耿耿",27});


        jdbcHelper.executeBatch(sql,paramsList);
    }




}
