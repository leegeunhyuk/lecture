
public class ExceptionTest {
	// 예외의 3가지 처리 방법
	// 1) 예외 복구
	// 2) 예외 회피 => throws
	// 3) 예외 전환 => 에외 클래스를 변경
	public static void main(String[] args) {

		// 예외 복구
		int maxRetry = 10;
		while (maxRetry > 0) {
			try {
				// 네트워크 장애가 발생할지도 모르는 코드
				return;// 예외가 없으면
			} catch (Exception e) {
				// 로그 정보 출력(장애가 발생했다는)
				// 일정시간 대기
				// maxRetry--;
			} finally {
				// 사용한 리소스 반납, 정리
			}
		}
//		throw new RetryFailedException();//복구 시도 실패하면 직접 예외 발생시킨다
	}
}
