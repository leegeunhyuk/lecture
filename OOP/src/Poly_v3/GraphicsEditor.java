package Poly_v3;

public class GraphicsEditor {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[10];

		int num;
		// ������ ���� �׸���
		for (int i = 0; i < 10; i++) {
			num = (int) (Math.random() * 3) + 1;
			switch (num) {
			case 1:// �簢�� ����
				shapes[i] = new Rectangle();
				break;
			case 2:// �� ����
				shapes[i] = new Ellipse();
				break;
			case 3:// �� ����
				shapes[i] = new Line();
				break;
			}
		}
		// �׷��� ���� Ȯ��
		for (int i = 0; i < 10; i++) {
			shapes[i].draw();
		}
	}
}