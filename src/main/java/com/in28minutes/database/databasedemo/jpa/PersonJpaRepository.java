package com.in28minutes.database.databasedemo.jpa;


import com.in28minutes.database.databasedemo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class  PersonJpaRepository {

    //connect to the database!
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    public Person update(Person person){
        //merge method knows whetehr the ID is set in the person or if not, it inserts an id
        return entityManager.merge(person);
    }
    public Person insert(Person person){
        //merge method knows whetehr the ID is set in the person or if not, it inserts an id
        return entityManager.merge(person);
    }

    public void deleteById(int id){
        Person person = findById(id);
        entityManager.remove(person);
    }


    public List<Person> findAll(){
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
        return namedQuery.getResultList();
    }



}
