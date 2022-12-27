package softblue.designpatterns.shape;

import java.awt.Graphics;

public class FillCircle extends Shape { //Desenha um círculo preenchido.

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillOval(0, 0, 50, 50); // Para isso, ele usa esse método.
	}
}
