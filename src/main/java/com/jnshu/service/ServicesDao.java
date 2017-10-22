package com.jnshu.service;

import com.jnshu.model.Person;

import java.util.List;

public interface ServicesDao {
     Person takePerById(int id);
     List<Person> takeAllPer();
     void addPer(Person per);
     void upPer(Person per);
     Person takeByname(String name);
     void deleByid(int id);
}
