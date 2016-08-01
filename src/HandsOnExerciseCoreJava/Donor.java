package HandsOnExerciseCoreJava;

import java.util.HashMap;

public class Donor implements IDonor{
    
    private String name;
    private String email;
    private HashMap <String, Project> donationList = new HashMap <String, Project>();
    
    public Donor(){
    	
    }
    
    public Donor(String name, String email){
    	this.name = name;
    	this.email = email;
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public HashMap<String, Project> getDonationList() {
		return donationList;
	}

	public void addProjectToDonationList(Project project){
		
		if (!donationList.containsKey(project.getName())){
			donationList.put(project.getName(), project);
		}
		
		
	}


}
