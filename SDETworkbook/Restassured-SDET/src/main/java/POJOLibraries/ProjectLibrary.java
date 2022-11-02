package POJOLibraries;

public class ProjectLibrary {
	//step1: Declare all the variables as global
	  String CreatedBy;
	  String ProjectName;
	  String Status;
	  int TeamSize;
	  
	//step2: provide constructor to initiate
	public ProjectLibrary(String createdBy, String projectName, String status, int teamSize) {
	
		this.CreatedBy = createdBy;
		this.ProjectName = projectName;
		this.Status = status;
		this.TeamSize = teamSize;
	}
	//step3: provide getter and setter

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		this.CreatedBy = createdBy;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		this.ProjectName = projectName;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		this.Status = status;
	}

	public int getTeamSize() {
		return TeamSize;
	}

	public void setTeamSize(int teamSize) {
		this.TeamSize = teamSize;
	}
	

}
