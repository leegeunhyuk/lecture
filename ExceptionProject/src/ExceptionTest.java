
public class ExceptionTest {
	// ������ 3���� ó�� ���
	// 1) ���� ����
	// 2) ���� ȸ�� => throws
	// 3) ���� ��ȯ => ���� Ŭ������ ����
	public static void main(String[] args) {

		// ���� ����
		int maxRetry = 10;
		while (maxRetry > 0) {
			try {
				// ��Ʈ��ũ ��ְ� �߻������� �𸣴� �ڵ�
				return;// ���ܰ� ������
			} catch (Exception e) {
				// �α� ���� ���(��ְ� �߻��ߴٴ�)
				// �����ð� ���
				// maxRetry--;
			} finally {
				// ����� ���ҽ� �ݳ�, ����
			}
		}
//		throw new RetryFailedException();//���� �õ� �����ϸ� ���� ���� �߻���Ų��
	}
}
