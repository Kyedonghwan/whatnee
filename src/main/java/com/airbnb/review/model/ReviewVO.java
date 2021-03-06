package com.airbnb.review.model;

import java.sql.Timestamp;

public class ReviewVO {
	private int grade;
	private String content;
	private int userno;
	private int amenity;
	private int cleanGrade;
	private int accuracyGrade;
	private int communicationGrade;
    private int locationGrade;
    private int checkinGrade;
    private int satisfactionpriceGrade;
    private Timestamp regdate;
    private String username;
    private String userid;
    
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public ReviewVO() {
    	
    }
	
	
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "ReviewVO [grade=" + grade + ", content=" + content + ", userno=" + userno + ", amenity=" + amenity
				+ ", cleanGrade=" + cleanGrade + ", accuracyGrade=" + accuracyGrade + ", communicationGrade="
				+ communicationGrade + ", locationGrade=" + locationGrade + ", checkinGrade=" + checkinGrade
				+ ", satisfactionpriceGrade=" + satisfactionpriceGrade + ", regdate=" + regdate + ", username="
				+ username + ", userid=" + userid + "]";
	}
	public ReviewVO(int grade, String content, int userno, int amenity, int cleanGrade, int accuracyGrade,
			int communicationGrade, int locationGrade, int checkinGrade, int satisfactionpriceGrade, Timestamp regdate,
			String username, String userid) {
		super();
		this.grade = grade;
		this.content = content;
		this.userno = userno;
		this.amenity = amenity;
		this.cleanGrade = cleanGrade;
		this.accuracyGrade = accuracyGrade;
		this.communicationGrade = communicationGrade;
		this.locationGrade = locationGrade;
		this.checkinGrade = checkinGrade;
		this.satisfactionpriceGrade = satisfactionpriceGrade;
		this.regdate = regdate;
		this.username = username;
		this.userid = userid;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUserno() {
		return userno;
	}
	public void setUserno(int userno) {
		this.userno = userno;
	}
	public int getAmenity() {
		return amenity;
	}
	public void setAmenity(int amenity) {
		this.amenity = amenity;
	}
	public int getCleanGrade() {
		return cleanGrade;
	}
	public void setCleanGrade(int cleanGrade) {
		this.cleanGrade = cleanGrade;
	}
	public int getAccuracyGrade() {
		return accuracyGrade;
	}
	public void setAccuracyGrade(int accuracyGrade) {
		this.accuracyGrade = accuracyGrade;
	}
	public int getCommunicationGrade() {
		return communicationGrade;
	}
	public void setCommunicationGrade(int communicationGrade) {
		this.communicationGrade = communicationGrade;
	}
	public int getLocationGrade() {
		return locationGrade;
	}
	public void setLocationGrade(int locationGrade) {
		this.locationGrade = locationGrade;
	}
	public int getCheckinGrade() {
		return checkinGrade;
	}
	public void setCheckinGrade(int checkinGrade) {
		this.checkinGrade = checkinGrade;
	}
	public int getSatisfactionpriceGrade() {
		return satisfactionpriceGrade;
	}
	public void setSatisfactionpriceGrade(int satisfactionpriceGrade) {
		this.satisfactionpriceGrade = satisfactionpriceGrade;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
}
