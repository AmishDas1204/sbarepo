package com.sba3.model;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="customer")
public class Customer {
	

			@Id
			private long id;//id of customer
			
			private String name;//name of customer
			
			private String date;//date of joining of customer
			
			private String city;//city from which customer has come
			
			private int contact;//contact info of customer
			
			
           //setters and getters
			public String getDate() {
				return date;
			}

			public void setDate(String date) {
				this.date = date;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public int getContact() {
				return contact;
			}

			public void setContact(int contact) {
				this.contact = contact;
			}

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

				

}
