package builder;

public class ConcreteBuilderB extends Builder {

	private Product product = new Product();
	
	@Override
	public void constructPartA() {
		product.add("X");
	}

	@Override
	public void constructPartB() {
		product.add("Y");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
