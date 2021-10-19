package com.example.projet1.domain;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class Customer {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Id ;
    private String Name;
    private String Address;
    private  String phonenumber;
    private Date dataofbirthrecords;
    
public Customer() {
	super();
  }

public Customer(int Id , String Name, String Address,String phonenumber, Date dataofbirthrecords) {
		super();
		
		this.Id = Id;
		this.Name = Name;
		this.Address = Address;
		this.phonenumber = phonenumber;
		this.dataofbirthrecords= dataofbirthrecords;
}

public int getId() {
 return Id;
   }
public void setId( int Id) {
 this.Id = Id;
   }

public String getName() {
 return Name;
   }
public void setName(String Name) {
 this.Name = Name;
    }

public String getAddress() {
 return Address;
    }
public void setAddress(String Address) {
 this.Address = Address;
    }

public String getphonenumber() {
	return phonenumber;
    }
public void setphonenumber(String phonenumber) {
	 this.phonenumber = phonenumber;
    }
public Date getdataofbirthrecords() {
	return dataofbirthrecords;
    }
public void setdataofbirthrecords(Date dataofbirthrecords) {
	 this.dataofbirthrecords = dataofbirthrecords;
    }
 
}
