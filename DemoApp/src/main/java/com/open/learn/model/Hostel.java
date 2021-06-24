package com.open.learn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hostel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idhostel;
	private String hostel_name;
	
	public Hostel() {
		// TODO Auto-generated constructor stub
	}
	public Hostel(int idhostel, String hostel_name) {
		super();
		this.idhostel = idhostel;
		this.hostel_name = hostel_name;
	}
	/**
	 * @return the idhostel
	 */
	public int getIdhostel() {
		return idhostel;
	}
	/**
	 * @param idhostel the idhostel to set
	 */
	public void setIdhostel(int idhostel) {
		this.idhostel = idhostel;
	}
	/**
	 * @return the hostel_name
	 */
	public String getHostel_name() {
		return hostel_name;
	}
	/**
	 * @param hostel_name the hostel_name to set
	 */
	public void setHostel_name(String hostel_name) {
		this.hostel_name = hostel_name;
	}
	
	

}
