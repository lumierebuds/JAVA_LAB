package scheduler;

// 스케줄러 : 상담센터

public interface Scheduler {

	void getNextCall(); // 다음 고객의 콜을 가져오는 메서드

	void sendCallToAgent(); // 상담원에게 콜을 던지는 메서드
}
