package template;

public class ConcreteMethodB extends AbstractMethod {
	
	protected void method1() {
		System.out.println("subclass B ��method1() ...");
	}
	
	protected void method2() {
		System.out.println("subclass B ��method2() ...");
	}
	
	protected boolean hookMethod() {
		return false;
	}
}