package ananas.lib.blueprint.elements.reflect;

public class BprBox {

	// private ReflectElement mElement;

	public boolean bind(Object child) {
		if (child instanceof ReflectElement) {
			// this.mElement = (ReflectElement) child;
		} else {
			return true;
		}
		return true;
	}
}