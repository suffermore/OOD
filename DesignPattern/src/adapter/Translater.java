package adapter;

public class Translater extends Player{

	private ForeignCentre fCentre = new ForeignCentre();
	
	public Translater(String name) {
		super(name);
		fCentre.set(name);
	}

	@Override
	public void attack() {
		fCentre.attack();
	}

	@Override
	public void defense() {
		fCentre.defense();
	}

}
