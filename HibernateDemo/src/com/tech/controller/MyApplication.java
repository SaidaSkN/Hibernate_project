package com.tech.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.palle.model.Actor;

public class MyApplication {

	public static void main(String[] args) {
		//step:1 Get the hibernate configufrations/settings present in hibernate.cf.xmi file.
				/* SessionFactory Uses:
				 * This interface get all the DB details.
				 * This interface help use to create Session to communicate with DB.
				 */
				SessionFactory sf =new Configuration().configure().buildSessionFactory();
				
				//step2: Open Session:
				//Session is used to  do   CURD operations for temporary purpose in database
				Session s= sf.openSession();
				
				//step3:Begin transaction
				//Transaction is used to do permanent changes in the databases
				Transaction t= s.beginTransaction();
				
				//step4: Create Object for entity class:
				//Actor a1= new Actor(3,"Saida","PK");
				Actor a2 = new Actor(5,"prabhas","bahubali");
				
				//Step5: Send the above details to DB to do insert operation:
				//By below  code data will be inserted only for temporary time or data stored in .log file
				//s.save(a1);
				s.save(a2);
			
				
				//Step6: commit the transaction:
				//by below code data will be inserted for permanent time or data is stored in.mdf file.
				t.commit();
				
				//step7:close the connection
				s.close();
				sf.close();

			}

		


	}


