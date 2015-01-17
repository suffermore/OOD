package template;

abstract class AbstractMethod {
	
	protected abstract void method1();
	protected abstract void method2();
	
	public final void templateMethod() {

		if (hookMethod()) {
			method1();
		} else {
			method1();
			method2();
		}
	}
	
	protected boolean hookMethod() {
		return true;
	}
	
}
