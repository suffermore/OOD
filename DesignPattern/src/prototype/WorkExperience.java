package prototype;

public class WorkExperience{

	private String timeArea;
	private String company;
	private String aimCompany;
	
	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getTimeArea() {
		return this.timeArea;
	}
	
	public String getCompany() {
		return this.company;
	}

	@Override
	public Object clone() {
		WorkExperience obj = null;
		try {
			obj = (WorkExperience)super.clone();
			obj.timeArea = this.timeArea;
			obj.company = this.company;
			obj.aimCompany = this.aimCompany;
		} catch (CloneNotSupportedException e) {
			System.out.println("WorkExperience cannot be cloned");
		}
		return obj;
	}
}
