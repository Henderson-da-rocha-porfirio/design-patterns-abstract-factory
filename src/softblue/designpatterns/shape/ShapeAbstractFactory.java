package softblue.designpatterns.shape;

public abstract class ShapeAbstractFactory {

	public abstract Shape newShape(String type); //Método newShape que retorna uma instância de Shape.
													//E recebe como parametro o tipo de Shape como uma string
														// A implementação vai ser definida por quem chamar a criação de shapes.
}
