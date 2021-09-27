package com.tut.HibernateProject;
import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App {
public static void main(String[] args) {
System.out.println("project started.....");



SessionFactory factory = new Configuration().configure().buildSessionFactory();



student st = new student();
st.setId(004);
st.setName("aman");
st.setCity("allahabad");
System.out.println(st);




Session session = factory.openSession();



// Transaction started
Transaction tx = session.beginTransaction();

//list are fetching
Query q=session.createQuery("from student");
List<student> list=q.list();
for(student student:list) {
System.out.println(student.getName());
}


//query delete
//Query q1 = session.createQuery("delete from studentRecord as d where d.city=:c");
//q1.setParameter("c", "usa");
//int res = q1.executeUpdate();
//System.out.println(res + " Record Deleted....");



// query update
//Query q2=session.createQuery("update studentRecord set city=:c where name=:n");
//q2.setParameter("c","usa");
//q2.setParameter("n", "jack");
//int res2=q2.executeUpdate();
//System.out.println(res2+" Record updated....");



// commiting transaction
session.save(st);
tx.commit();
}



}