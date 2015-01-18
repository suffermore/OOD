package builder;

public class ConcreteBuilderA extends Builder {

	private Product product = new Product();
	
	@Override
	public void constructPartA() {
		product.add("M");
	}

	@Override
	public void constructPartB() {
		product.add("N");
	}

	@Override
	public Product getResult() {
		return product;
	}
}
