package mypackage.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="Emp3")  
@PrimaryKeyJoinColumn(name="EID")  
public class Contact extends Employee{

	private String cno,hno;

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}
	
	
	
	
}
