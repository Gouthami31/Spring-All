

package com.mvn.spring_ORM.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.mvn.spring_ORM.studentBean;

public class studentdaoImpl implements studentdao  {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    @Transactional
    public int savestudent(studentBean studentbean) {
        int savedetails = (Integer) hibernateTemplate.save(studentbean);
        return savedetails;
    }

    @Override
    public studentBean viewstudentOne(int id) {
        return hibernateTemplate.get(studentBean.class, id);
    }

    @Override
    @Transactional
    public void updatestudent(studentBean studentbean) {
        hibernateTemplate.update(studentbean);
    }

    @Override
    @Transactional
    public void deletestudent(int id) {
        studentBean student = hibernateTemplate.get(studentBean.class, id);
        if (student != null) {
            hibernateTemplate.delete(student);
        }
    }

    @Override
    public List<studentBean> studentAll() {
    	return hibernateTemplate.loadAll(studentBean.class);
    }
}

