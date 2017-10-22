package com.jnshu.service;

import com.jnshu.dao.PersonDao;
import com.jnshu.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value = "services")
public class Services implements ServicesDao{
    @Resource(name = "personDao")
    private PersonDao perDao;
    public Person takePerById(int id){
        return perDao.takeById(id);
    }
    public List<Person> takeAllPer(){
        return perDao.takeAll();
    }
    public void addPer(Person per){
        perDao.addper(per);
    }
    public void upPer(Person per){ perDao.updatePer(per); }
    public Person takeByname(String name){
        return perDao.takeByName(name);
    }
    public void deleByid(int id){
        perDao.deleById(id);
    }
}
