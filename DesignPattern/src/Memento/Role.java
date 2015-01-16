package Memento;

public class Role {
	private String name;
	private int HP;
	private int MP;
	private int attack;
	private int defence;
	
	public Role(String name) {
		this.name = name;
	}
	
	//save state
	public RoleStateMemeto saveState() {
		return (new RoleStateMemeto(HP, MP, attack, defence));
	}
	
	//Initialize
	public void initializeState() {
		this.HP = 100;
		this.MP = 100;
		this.attack = 50;
		this.defence = 20;
	}
	
	//recover state
	public void recoverState(RoleStateMemeto memeto) {
		this.HP = memeto.getHP();
		this.MP = memeto.getMP();
		this.attack = memeto.getAttack();
		this.defence = memeto.getDefence();
	}
	
	public void fight() {
		this.HP -= 100;
		this.MP -= 10;
	}
	
	//display state
	public void display() {
		System.out.println(this.name + ": HP-:" + this.HP + " MP-:" + this.MP + " Attack-:" + this.attack + " Defence-:" + this.defence);
	}
}
