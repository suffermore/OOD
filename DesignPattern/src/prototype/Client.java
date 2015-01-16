package prototype;

public class Client {
	public static void main(String[] args) {
		Resume a = new Resume("Petter");
		a.setPersonalInfo("Male", "27");
		a.setWorkExperience("2009 - 2010", "Nexxter");
		
		Resume b = (Resume)a.clone();
		b.setWorkExperience("2010 - 2012", "NowAge");
		
		Resume c = (Resume)a.clone();
		c.setWorkExperience("2012 - 2015", "KateIn");
		
		a.display();
		b.display();
		c.display();
	}
}
