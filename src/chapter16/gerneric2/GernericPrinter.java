package chapter16.gerneric2;

public class GernericPrinter<T> {

	private T material;
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
}
