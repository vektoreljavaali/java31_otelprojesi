package com.otels.models;

import java.util.Date;

public class tblrezervasyon {

	private long 	id;
	private Date 	islemtarihi;
	private Date 	giristarihi;
	private Date 	cikistarihi;
	private long 	personelid;
	private long 	musteriid;
	private long 	odaid;
	private String	ucret;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getIslemtarihi() {
		return islemtarihi;
	}
	public void setIslemtarihi(Date islemtarihi) {
		this.islemtarihi = islemtarihi;
	}
	public Date getGiristarihi() {
		return giristarihi;
	}
	public void setGiristarihi(Date giristarihi) {
		this.giristarihi = giristarihi;
	}
	public Date getCikistarihi() {
		return cikistarihi;
	}
	public void setCikistarihi(Date cikistarihi) {
		this.cikistarihi = cikistarihi;
	}
	public long getPersonelid() {
		return personelid;
	}
	public void setPersonelid(long personelid) {
		this.personelid = personelid;
	}
	public long getMusteriid() {
		return musteriid;
	}
	public void setMusteriid(long musteriid) {
		this.musteriid = musteriid;
	}
	public long getOdaid() {
		return odaid;
	}
	public void setOdaid(long odaid) {
		this.odaid = odaid;
	}
	public String getUcret() {
		return ucret;
	}
	public void setUcret(String ucret) {
		this.ucret = ucret;
	}
	
	
	
	
}
