package prototype;

public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private WorkExperience workExp;
	
	public Resume(String name) {
		this.name = name;
	}
	
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String timeArea, String company) {
		workExp = new WorkExperience();
		workExp.setTimeArea(timeArea);
		workExp.setCompany(company);
	}
	
	@Override
	public Object clone() {
		Resume obj = null;
		try {
			obj = (Resume)super.clone();
			obj.name = this.name;
			obj.age = this.age;
			obj.sex = this.sex;
			obj.workExp = this.workExp;
		} catch (CloneNotSupportedException e) {
			System.out.println("Resume cannot be cloned");
		}
		return obj;
	}
	
	public void display() {
		System.out.println("Career info\nName: " + this.name + ", Age: " + this.age + ", \nWorkExperience: " + this.workExp.getTimeArea() + " - " + this.workExp.getCompany());
	}
}
