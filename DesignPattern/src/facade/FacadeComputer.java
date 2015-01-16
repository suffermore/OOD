package facade;

public class FacadeComputer {
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;

	public FacadeComputer() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
	}
	
	public void startComputer() {
		cpu.freeze();
		memory.load();
		hardDrive.read();
		cpu.excute();
	}
}
