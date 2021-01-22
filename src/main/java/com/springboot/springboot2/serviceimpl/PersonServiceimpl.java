package com.springboot.springboot2.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springboot2.dao.PersonDao;
import com.springboot.springboot2.entity.Person;
import com.springboot.springboot2.service.PersonService;
@Service
public class PersonServiceimpl implements PersonService {

	@Autowired //接口
    private PersonDao personDao;

    /*
        Service层介于controller和dao之间作为服务层进行一些逻辑处理，
        这里逻辑太简单所以知识单纯调用dao所以不做注释
     */
    public List<Person> getAll(){
        return personDao.getAll();
    }

    public Person getPersonByID(int id){
        return personDao.getPersonByID(id);
    }

    public void  delete(int id){
        personDao.delete(id);
    }

    public void update(Person p){
        personDao.update(p);
    }

    public void newp(Person p){
        personDao.newp(p);
    }

}
