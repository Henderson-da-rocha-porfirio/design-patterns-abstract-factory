package softblue.designpatterns.shape;

public class FillShapeFactory extends ShapeAbstractFactory { // Essa classe implementa o método newShape.

	@Override
	public Shape newShape(String type) { // newShape é um método capaz de criar shapes preenchidos com base num tipo.
		if (type.equals("circle")) {
			return new FillCircle();
		} else if (type.equals("square")) {
			return new FillSquare();
		}
		
		return null;
	}
}
