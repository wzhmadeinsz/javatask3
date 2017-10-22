package com.jnshu.dao;

import com.jnshu.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "personDao")
public interface PersonDao {
    Person takeById(int id);
    List<Person> takeAll();
    void addper(Person per);
    void deleById(int id);
    void updatePer(Person per);
    Person takeByName(String name);
}
