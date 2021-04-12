package com.leavemanagement.SpringBootCrud.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LeaveManagement")
public class Leave {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String leavetype;
	private String reason;
	private String startdate;
	private String enddate;

	public Leave() {

	}

	public Leave(long id, String name, String leavetype, String reason, String startdate, String enddate) {
		super();
		this.id = id;
		this.name = name;
		this.leavetype = leavetype;
		this.reason = reason;
		this.startdate = startdate;
		this.enddate = enddate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	 @Column(name = "name", nullable = false)
	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeavetype() {
		return leavetype;
	}

	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

}
