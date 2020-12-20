package com.code.jpa;

import com.code.jpa.dao.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ApplicationRoot {

  private static final EntityManagerFactory emFactoryObj;
  private static final String PERSISTENCE_UNIT_NAME = "PersistenceUnitName";

  static {
    emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
  }

  // Use this method To Retrieve The 'EntityManager' Object
  public static EntityManager getEntityManager() {
    return emFactoryObj.createEntityManager();
  }

  public static void main(String[] args) {

    EntityManager entityMgr = getEntityManager();
    entityMgr.getTransaction().begin();

    Person person = new Person();
    person.setName("Sven");
    person.setCity("Ektorp");

    entityMgr.persist(person);

    entityMgr.getTransaction().commit();

    entityMgr.clear();
    System.out.println("Row inserted in database.");

  }

}
