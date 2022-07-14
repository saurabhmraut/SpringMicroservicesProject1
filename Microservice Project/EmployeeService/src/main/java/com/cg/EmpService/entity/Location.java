package com.cg.EmpService.entity;

public class Location {
	private Long locId;
	private String locName;
	
	
	
	public Location(Long locId, String locName) {
		super();
		this.locId = locId;
		this.locName = locName;
	}
	public Long getLocId() {
		return locId;
	}
	public void setLocId(Long locId) {
		this.locId = locId;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	
	

}
