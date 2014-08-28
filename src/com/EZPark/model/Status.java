package com.EZPark.model;

import java.util.Date;

public class Status {
	private long idStatus;
	private Date dataStatus;
	private Date horaStatus;
	public long getIdStatus() {
		return idStatus;
	}
	public void setIdStatus(long idStatus) {
		this.idStatus = idStatus;
	}
	public Date getDataStatus() {
		return dataStatus;
	}
	public void setDataStatus(Date dataStatus) {
		this.dataStatus = dataStatus;
	}
	public Date getHoraStatus() {
		return horaStatus;
	}
	public void setHoraStatus(Date horaStatus) {
		this.horaStatus = horaStatus;
	}
	
	
}
