package Lesson1Homework1;

import java.util.List;

public class Project {

	private int ProjectId;
	private List<Feature> feature;
	private List<Release> release;
	public int getProjectId() {
		return ProjectId;
	}
	
	
	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}
	public List<Feature> getFeature() {
		return feature;
	}
	public void setFeature(List<Feature> feature) {
		this.feature = feature;
	}
	public List<Release> getRelease() {
		return release;
	}
	public void setRelease(List<Release> release) {
		this.release = release;
	}
	
	
	
	
	
}
