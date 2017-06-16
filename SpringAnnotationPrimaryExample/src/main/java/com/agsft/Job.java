package com.agsft;

public class Job {
	private String designation;

	public Job(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Job [designation=" + designation + "]";
	}

}
