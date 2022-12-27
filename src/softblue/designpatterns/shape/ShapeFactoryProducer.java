package softblue.designpatterns.shape;

public class ShapeFactoryProducer { // Instacia uma factory que vai instanciar os shapes.

	public static ShapeAbstractFactory getFactory(boolean fill) { //pode usar um método static ou o padrão singleton.
		if (fill) {
			return new FillShapeFactory();
		} else {							// Geralmente, com uma boa prática, a factory você trabalha ela por aplicação. Poderia usar o padrão singleton.
			return new NotFillShapeFactory();
		}
	}
}
