package com.gmy.sparkproject.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class FastjsonTest {
    public static void main(String[] args) {

        String json = "[{'学生':'张三','班级':'4K','年纪':'大实训','科目':'spark','成绩':90},{'学生':'李四','班级':'4K','年纪':'大实训','科目':'fi','成绩':95}]";

        JSONArray jsonArray = JSONArray.parseArray(json);
        JSONObject jsonObject = jsonArray.getJSONObject(0);
        System.out.println(jsonObject.getString("学生"));
    }
}
