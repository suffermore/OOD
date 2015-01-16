package Memento;

public class RoleStateMemeto {
	private int HP;
	private int MP;
	private int attack;
	private int defence;
	
	public RoleStateMemeto(int HP, int MP, int attack, int defence) {
		this.HP = HP;
		this.MP = MP;
		this.attack = attack;
		this.defence = defence;
	}
	
	public int getHP() {
		return this.HP;
	}
	
	public void setHP(int value) {
		this.HP = value;
	}
	
	public int getMP() {
		return this.MP;
	}

	public void setMP(int value) {
		this.MP = value;
	}
	
	public int getAttack() {
		return this.attack;
	}

	public void setAttack(int value) {
		this.attack = value;
	}
	
	public int getDefence() {
		return this.defence;
	}

	public void setDefence(int value) {
		this.defence = value;
	}
}
