package softblue.designpatterns.shape;

import java.awt.Graphics;

public class NotFillCircle extends Shape { // tem a mesma implementação de FillCircle mas muda de fill para draw

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawOval(0, 0, 50, 50); //aqui.
	}
}
