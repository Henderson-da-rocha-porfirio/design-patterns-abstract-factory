package softblue.designpatterns;

import softblue.designpatterns.gui.Window;
import softblue.designpatterns.shape.Shape;
import softblue.designpatterns.shape.ShapeAbstractFactory;
import softblue.designpatterns.shape.ShapeFactoryProducer;


public class App {

	public static void main(String[] args) {

		Window w = new Window("Shapes", 300, 300);
		w.show();
		
		ShapeAbstractFactory factory = ShapeFactoryProducer.getFactory(false); // A classe app não enxerga quais factories estão na memória,
																					//apenas enxerga ShapeAbstractFactory.
		Shape shape = factory.newShape("circle"); // Como também não enxerga a instancia de que shape está retornando da memória.
		
		w.drawShape(shape)   ;
	}
}
