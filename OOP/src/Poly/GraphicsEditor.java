package Poly;

public class GraphicsEditor {

	public static void main(String[] args) {
		Rectangle[] rects = new Rectangle[10];
		Ellipse[] ells = new Ellipse[10];
		Line[] lines = new Line[10];

		int num;
		// ������ ���� �׸���
		for (int i = 0; i < 10; i++) {
			num = (int) (Math.random() * 3) + 1;
			switch (num) {
			case 1:// �簢�� ����
				rects[i] = new Rectangle();
				break;
			case 2:// �� ����
				ells[i] = new Ellipse();
				break;
			case 3:// �� ����
				lines[i] = new Line();
				break;
			}
		}
//		 �׷��� ���� Ȯ��
		for (int i = 0; i < 10; i++) {
			if (rects[i] != null) {
				rects[i].drawRectangle();
			} else if (ells[i] != null) {
				ells[i].drawEllipse();
			} else if (lines[i] != null) {
				lines[i].drawLine();
			}
		}
	}
}
