package Memento;

public class Client {
	public static void main(String[] args) {
		//before battle
		Role petter = new Role("Petter");
		petter.initializeState();
		petter.display();
		
		//save memeto before battle
		RoleStateCaretaker statebook = new RoleStateCaretaker();
		statebook.setMemeto(petter.saveState());
		
		//in battle
		petter.fight();
		petter.display();
		
		//after battle, recover state
		petter.recoverState(statebook.getMemeto());
		petter.display();
	}
}
