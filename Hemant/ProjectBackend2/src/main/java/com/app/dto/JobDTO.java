package com.app.dto;

import javax.validation.constraints.NotNull;

public class JobDTO {
	@NotNull(message = "jobTitle cant be null")
	private String jobTitle;
	@NotNull(message = "jobDescription cant be null")
	private String jobDescription;
    @NotNull(message = "recruiterid can't be null")
    private long recruiterId;
    
    
    
    private boolean status;
    
    public JobDTO() {
		super();
	}
    
	public JobDTO(@NotNull(message = "jobTitle cant be null") String jobTitle,
			@NotNull(message = "jobDescription cant be null") String jobDescription,
			@NotNull(message = "recruiterid can't be null") long recruiterId, boolean status) {
		super();
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.recruiterId = recruiterId;
		this.status = status;
	}



	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public long getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(long recruiterId) {
		this.recruiterId = recruiterId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "JobDTO [jobTitle=" + jobTitle + ", jobDescription=" + jobDescription + ", recruiterId=" + recruiterId
				+ ", status=" + status + "]";
	}

	

	

}