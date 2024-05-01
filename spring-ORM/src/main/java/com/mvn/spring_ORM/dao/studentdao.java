package com.mvn.spring_ORM.dao;

import java.util.List;


import com.mvn.spring_ORM.studentBean;

public interface studentdao {
     public int savestudent(studentBean studentbean);
     public studentBean viewstudentOne(int id);
     public void updatestudent(studentBean studentbean);
     public void deletestudent(int id);
     public List<studentBean>studentAll();
}
