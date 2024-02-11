 package com.palle.model;

import javax.persistence.Id;
import javax.persistence.Entity;

import javax.persistence.Table;

//Below code is use to map the class in xml file for( mapping tag)
@Entity
//Below code will customize the table name
@Table(name="movie")

public class Actor {
	
	
	
	
	//below variables will be converted has columns in the table
		//below @Id will give primary key for ano colouns
		@Id
		private int ano;
		private String aname;
		private String film;
		
		public Actor(int ano, String aname, String film)
		{
			super();
			this.ano = ano;
			this.aname = aname;
			this.film = film;
		}
		
		public Actor()
		{
			super();
		
		}

		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public String getAname() {
			return aname;
		}
		public void setAname(String aname) {
			this.aname = aname;
		}
		public String getFilm() {
			return film;
		}
		public void setFilm(String film) {
			this.film = film;
		}
		

	}



