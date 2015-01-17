package template;

public class ConcreteMethodB extends AbstractMethod {
	
	protected void method1() {
		System.out.println("subclass B £ºmethod1() ...");
	}
	
	protected void method2() {
		System.out.println("subclass B £ºmethod2() ...");
	}
	
	protected boolean hookMethod() {
		return false;
	}
}