package com.zone.innovation.activityfeed.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Feed {
	
	@Id
	private long id;
	
	private Date timestamp;
	private String category;
	@JsonProperty("alert-type")
	private String alertType;
	private String title;
	
	@JsonProperty("visit-engineer")
	private String visitEngineer;
	
	@JsonProperty("visit-time")
	private String visitTime;
	
	@JsonProperty("issue-status")
	private String issueStatus;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAlertType() {
		return alertType;
	}
	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVisitEngineer() {
		return visitEngineer;
	}
	public void setVisitEngineer(String visitEngineer) {
		this.visitEngineer = visitEngineer;
	}
	public String getVisitTime() {
		return visitTime;
	}
	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}
	public String getIssueStatus() {
		return issueStatus;
	}
	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}
	
	
	

}
